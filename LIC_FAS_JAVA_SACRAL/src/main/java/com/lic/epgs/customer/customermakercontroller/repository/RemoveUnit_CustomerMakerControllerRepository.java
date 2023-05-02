package com.lic.epgs.customer.customermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoveUnit_CustomerMakerControllerRepository extends JpaRepository<RemoveUnit_CustomerMakerController, Long> {

    @Modifying
    @Query("DELETE FROM RemoveUnit_CustomerMakerController u WHERE u.customerUnitOfficeId = :customerUnitOfficeId AND u.customerId = :customerId")
    int deleteUnitDetails(@Param("customerUnitOfficeId") Long customerUnitOfficeId, @Param("customerId") Long customerId);

}