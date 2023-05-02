package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.Customer;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.RemoveMemberCustomerDetailsGroupCustomerDetailsControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemoveMemberCustomerDetailsGroupCustomerDetailsControllerService {

    @Autowired
    private RemoveMemberCustomerDetailsGroupCustomerDetailsControllerRepository repository;

    public Customer findByCustomerCode(String customerCode) {
        return repository.findByCustomerCode(customerCode);
    }

    public List<Customer> findByGroupId(long groupId) {
        return repository.findByGroupId(groupId);
    }

    public int removeMemberCustomerFromGroup(String customerCode) {
        return repository.removeMemberCustomerFromGroup(customerCode);
    }

}