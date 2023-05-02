package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerAddressDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupCustomerDetailsControllerRepository;

@Service
public class GroupCustomerDetailsControllerService {
    
    @Autowired
    private GroupCustomerDetailsControllerRepository groupCustomerDetailsControllerRepository;
    
    public List<GroupCustomerAddressDetails> getGroupCustomerAddressDetailsByGroupAddressIdAndGroupCustomerId(Long groupAddressId, Long groupCustomerId) {
        return groupCustomerDetailsControllerRepository.findByGroupAddressIdAndGroupCustomerId(groupAddressId, groupCustomerId);
    }
    
    public List<GroupCustomerAddressDetails> getGroupCustomerAddressDetailsByGroupCustomerId(Long groupCustomerId) {
        return groupCustomerDetailsControllerRepository.findByGroupCustomerId(groupCustomerId);
    }
    
    public Optional<GroupCustomerAddressDetails> getGroupCustomerAddressDetailsByGroupCustomerIdAndAddressId(Long groupCustomerId, Long addressId) {
        return groupCustomerDetailsControllerRepository.findByGroupCustomerIdAndAddressId(groupCustomerId, addressId);
    }
    
}