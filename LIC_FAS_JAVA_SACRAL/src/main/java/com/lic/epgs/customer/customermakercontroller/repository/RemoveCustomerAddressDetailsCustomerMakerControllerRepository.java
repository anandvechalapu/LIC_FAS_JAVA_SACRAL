package com.lic.epgs.customer.customermakercontroller.repository;

import com.lic.epgs.customer.customermakercontroller.model.CommonResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RemoveCustomerAddressDetailsCustomerMakerControllerRepository extends JpaRepository<CommonResponseDto, Long> {

    @Query("update Address set isActive=false, modifiedOn=CURRENT_TIMESTAMP where addressId=:addressId and customerId=:customerId")
    CommonResponseDto removeAddressFromAddressDetailsGridAPI(@Param("addressId") Long addressId, @Param("customerId") Long customerId);

}