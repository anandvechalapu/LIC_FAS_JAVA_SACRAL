package com.lic.epgs.subcustomer.subcustomercheckercontroller.repository; 
 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.jpa.repository.Query; 
import org.springframework.data.repository.query.Param; 
 
public interface GetInprogressLoad_SubCustomerMakerController3Repository extends JpaRepository<DataModel, Long> { 
 
   @Query("SELECT dm FROM DataModel dm WHERE dm.roleType = :roleType and dm.unitCode = :unitCode and dm.status = 'In Progress'") 
   List<DataModel> getInprogressLoad_SubCustomerMakerController3(@Param("roleType") String roleType, @Param("unitCode") String unitCode); 
 
}