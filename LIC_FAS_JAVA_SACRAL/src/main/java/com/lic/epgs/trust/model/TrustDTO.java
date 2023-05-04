package com.lic.epgs.trust.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;

@Entity
@Table(name="trust_dto")
public class TrustDTO {

@Id
@GeneratedValue
@Column(name="id")
private Long id;

@Column(name="trust_code")
private String trustCode;

@Column(name="unit_code")
private String unitCode;

@Column(name="role")
private String role;

public Long getId() {
 return id;
}

public void setId(Long id) {
 this.id = id;
}

public String getTrustCode() {
 return trustCode;
}

public void setTrustCode(String trustCode) {
 this.trustCode = trustCode;
}

public String getUnitCode() {
 return unitCode;
}

public void setUnitCode(String unitCode) {
 this.unitCode = unitCode;
}

public String getRole() {
 return role;
}

public void setRole(String role) {
 this.role = role;
}

}