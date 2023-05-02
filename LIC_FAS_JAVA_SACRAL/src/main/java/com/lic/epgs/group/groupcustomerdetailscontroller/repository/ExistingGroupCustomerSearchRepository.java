package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomer;

@Repository
public interface ExistingGroupCustomerSearchRepository extends JpaRepository<GroupCustomer, Long> {
    
    @Query("SELECT gc FROM GroupCustomer gc WHERE gc.groupCode= :groupCode AND gc.groupName= :groupName AND gc.groupStatus= :groupStatus AND gc.unitCode= :unitCode AND gc.status= :status ORDER BY gc.modifiedOn DESC")
    public GroupCustomer searchForExistingGroupCustomer(@Param("groupCode") String groupCode, 
                                                       @Param("groupName") String groupName, 
                                                       @Param("groupStatus") String groupStatus,
                                                       @Param("unitCode") String unitCode, 
                                                       @Param("status") String status);
    
    @Query("SELECT gc FROM GroupCustomer gc WHERE gc.groupCode= :groupCode AND gc.groupName= :groupName AND gc.groupStatus= :groupStatus AND gc.unitCode= :unitCode AND gc.status= :status ORDER BY gc.modifiedOn DESC")
    public GroupCustomer searchForExistingGroupCustomerWithPagination(@Param("groupCode") String groupCode, 
                                                                     @Param("groupName") String groupName, 
                                                                     @Param("groupStatus") String groupStatus,
                                                                     @Param("unitCode") String unitCode, 
                                                                     @Param("status") String status, 
                                                                     @Param("pageCount") int pageCount, 
                                                                     @Param("limit") int limit);

}