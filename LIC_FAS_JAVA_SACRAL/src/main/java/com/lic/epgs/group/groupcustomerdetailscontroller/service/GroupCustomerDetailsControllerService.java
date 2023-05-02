package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupCustomerDetailsControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupCustomerDetailsControllerService {

    @Autowired
    private GroupCustomerDetailsControllerRepository groupCustomerDetailsControllerRepository;

    public List<GroupCustomerDetails> findByGroupCustomerIdAndContactId(Long groupCustomerId, Long contactId) {
        return groupCustomerDetailsControllerRepository.findByGroupCustomerIdAndContactId(groupCustomerId, contactId);
    }

    public List<GroupCustomerDetails> findAllByGroupCustomerIdAndContactId(Long groupCustomerId, Long contactId) {
        return groupCustomerDetailsControllerRepository.findAllByGroupCustomerIdAndContactId(groupCustomerId, contactId);
    }

    public GroupCustomerDetails save(GroupCustomerDetails groupCustomerDetails) {
        return groupCustomerDetailsControllerRepository.save(groupCustomerDetails);
    }

    public void delete(GroupCustomerDetails groupCustomerDetails) {
        groupCustomerDetailsControllerRepository.delete(groupCustomerDetails);
    }
}