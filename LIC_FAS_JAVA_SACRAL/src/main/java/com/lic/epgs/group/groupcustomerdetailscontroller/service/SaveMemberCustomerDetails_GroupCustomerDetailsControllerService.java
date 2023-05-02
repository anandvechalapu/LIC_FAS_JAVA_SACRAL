package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.SaveMemberCustomerDetails_GroupCustomerDetailsControllerRepository;

@Service
public class SaveMemberCustomerDetails_GroupCustomerDetailsControllerService {

    @Autowired
    private SaveMemberCustomerDetails_GroupCustomerDetailsControllerRepository saveMemberCustomerDetails_GroupCustomerDetailsControllerRepository;

   public Optional<GroupCustomerDetails> findByCustomerCodeAndGroupCustomerId(String customerCode, Long groupCustomerId) {
        return saveMemberCustomerDetails_GroupCustomerDetailsControllerRepository.findByCustomerCodeAndGroupCustomerId(customerCode, groupCustomerId);
    }
    
    public GroupCustomerDetails save(GroupCustomerDetails groupCustomerDetails) {
        return saveMemberCustomerDetails_GroupCustomerDetailsControllerRepository.save(groupCustomerDetails);
    }

}