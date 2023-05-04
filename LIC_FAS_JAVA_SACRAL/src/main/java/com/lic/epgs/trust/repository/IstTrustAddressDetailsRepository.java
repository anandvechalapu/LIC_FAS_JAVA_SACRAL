package com.lic.epgs.trust.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 

import com.lic.epgs.trust.model.AddressDetailsDto; 

@Repository 
public interface IstTrustAddressDetailsRepository extends JpaRepository<AddressDetailsDto, Long> { 
 
  /** 
   * Retrieve the address details for a given trust ID 
   * 
   * @param trustId 
   * @return the address details for a given trust ID 
   */ 
  List<AddressDetailsDto> findByTrustId(Long trustId); 
  
  /** 
   * Retrieve the response message indicating whether the request was successful or not 
   * 
   * @param trustId 
   * @return the response message indicating whether the request was successful or not 
   */ 
  String getResponseMessage(Long trustId); 
}