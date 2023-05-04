package com.lic.epgs.trust.model; 

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Table; 

@Entity 
@Table(name = "address_details_dto") 
public class AddressDetailsDto { 
 
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id; 
 
  private Long trustId; 
 
  private String addressLine1; 
 
  private String addressLine2; 
 
  private String city; 
  
  private String state; 
  
  private String postalCode; 
  
  private String country; 
  
  private String responseMessage; 
 
  public Long getId() { 
    return id; 
  } 
 
  public void setId(Long id) { 
    this.id = id; 
  } 
 
  public Long getTrustId() { 
    return trustId; 
  } 
 
  public void setTrustId(Long trustId) { 
    this.trustId = trustId; 
  } 
 
  public String getAddressLine1() { 
    return addressLine1; 
  } 
 
  public void setAddressLine1(String addressLine1) { 
    this.addressLine1 = addressLine1; 
  } 
 
  public String getAddressLine2() { 
    return addressLine2; 
  } 
 
  public void setAddressLine2(String addressLine2) { 
    this.addressLine2 = addressLine2; 
  } 
 
  public String getCity() { 
    return city; 
  } 
 
  public void setCity(String city) { 
    this.city = city; 
  } 
  
  public String getState() { 
    return state; 
  } 
 
  public void setState(String state) { 
    this.state = state; 
  } 
  
  public String getPostalCode() { 
    return postalCode; 
  } 
 
  public void setPostalCode(String postalCode) { 
    this.postalCode = postalCode; 
  } 
  
  public String getCountry() { 
    return country; 
  } 
 
  public void setCountry(String country) { 
    this.country = country; 
  } 
  
  public String getResponseMessage() { 
    return responseMessage; 
  } 
 
  public void setResponseMessage(String responseMessage) { 
    this.responseMessage = responseMessage; 
  } 
 
}