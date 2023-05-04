package com.lic.epgs.subcustomer.subcustomercheckercontroller.model; 
 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
 
@Entity
public class DataModel { 
 
   @Id 
   @GeneratedValue(strategy=GenerationType.IDENTITY) 
   private Long id; 
 
   private String roleType; 
   private String unitCode; 
   private String status; 
    
   public Long getId() { 
      return id; 
   } 
 
   public void setId(Long id) { 
      this.id = id; 
   } 
 
   public String getRoleType() { 
      return roleType; 
   } 
 
   public void setRoleType(String roleType) { 
      this.roleType = roleType; 
   } 
 
   public String getUnitCode() { 
      return unitCode; 
   } 
 
   public void setUnitCode(String unitCode) { 
      this.unitCode = unitCode; 
   } 
 
   public String getStatus() { 
      return status; 
   } 
 
   public void setStatus(String status) { 
      this.status = status; 
   } 
 
   @Override 
   public String toString() { 
      return "DataModel [id=" + id + ", roleType=" + roleType + ", unitCode=" + unitCode + ", status=" + status + "]"; 
   } 
 
}