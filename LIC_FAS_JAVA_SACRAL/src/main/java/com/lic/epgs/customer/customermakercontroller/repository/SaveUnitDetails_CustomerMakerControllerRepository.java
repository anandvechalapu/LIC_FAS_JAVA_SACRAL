package com.lic.epgs.customer.customermakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.customer.customermakercontroller.dto.CustomerUnitOfficeDto;
import com.lic.epgs.customer.customermakercontroller.dto.CommonResponseDto;

public interface SaveUnitDetails_CustomerMakerControllerRepository extends JpaRepository<CustomerUnitOfficeDto, Long>{

    // This method will save a new record for the given customerUnitOfficeDto object
    // and return a CommonResponseDto object with the newly created CustomerUnitOfficeDto
    // and a transaction status of SUCCESS and a transaction message of Save.
    CommonResponseDto saveUnitDetails(CustomerUnitOfficeDto customerUnitOfficeDto);

    // This method will update an existing record for the given customerUnitOfficeId
    // and return a CommonResponseDto object with the updated CustomerUnitOfficeDto
    // and a transaction status of SUCCESS and a transaction message of Update.
    CommonResponseDto updateUnitDetails(Long customerUnitOfficeId, CustomerUnitOfficeDto customerUnitOfficeDto);

    // This method will check the customerId provided in the DTO and return a 
    // CommonResponseDto object with a transaction message of Invalid customer and 
    // a transaction status of FAIL if the customerId does not exist.
    CommonResponseDto checkCustomerId(CustomerUnitOfficeDto customerUnitOfficeDto);
}