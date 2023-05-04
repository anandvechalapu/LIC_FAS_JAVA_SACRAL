package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.RemoveSubCustomerUnitOfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveSubCustomerUnitOfficeService {

    @Autowired
    private RemoveSubCustomerUnitOfficeRepository removeSubCustomerUnitOfficeRepository;

    public boolean removeSubCustomerUnitOffice(Long subCustomerId, Long unitOfficeId) {
        return removeSubCustomerUnitOfficeRepository.removeSubCustomerUnitOffice(subCustomerId, unitOfficeId);
    }

}