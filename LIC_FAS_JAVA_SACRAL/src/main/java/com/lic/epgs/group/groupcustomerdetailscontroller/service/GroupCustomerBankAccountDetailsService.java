package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import com.lic.epgs.group.groupcustomerdetailscontroller.entity.GroupCustomer;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupCustomerBankAccountDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupCustomerBankAccountDetailsService {

    @Autowired
    private GroupCustomerBankAccountDetailsRepository groupCustomerBankAccountDetailsRepository;

    public String getGroupCustomerBankAccountDetailsByGroupCustomerId(Long groupCustomerId) {
        GroupCustomer groupCustomer = groupCustomerBankAccountDetailsRepository.findById(groupCustomerId).orElse(null);
        return groupCustomer.getBankAccountDetails();
    }
}