package com.lic.epgs.customer.customermakercontroller.repository; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.customer.customermakercontroller.dto.CustomerUnitOfficeDto;

@Repository
public interface GetUnitCustomerMakerControllerRepository extends JpaRepository<CustomerUnitOfficeDto, Integer> {

    CustomerUnitOfficeDto findByCustomerId(Integer customerId);
}