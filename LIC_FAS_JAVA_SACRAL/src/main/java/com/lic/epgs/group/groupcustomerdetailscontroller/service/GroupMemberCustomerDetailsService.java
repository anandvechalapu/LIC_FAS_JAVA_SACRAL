package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupMemberCustomerDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupMemberCustomerDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupMemberCustomerDetailsService {

    @Autowired
    private GroupMemberCustomerDetailsRepository groupMemberCustomerDetailsRepository;

    public List<GroupMemberCustomerDetails> findByGroupCustomerId(Long groupCustomerId) {
        return groupMemberCustomerDetailsRepository.findByGroupCustomerId(groupCustomerId);
    }

    public Optional<GroupMemberCustomerDetails> findByGroupCustomerIdAndCustomerId(Long groupCustomerId, Long customerId) {
        return groupMemberCustomerDetailsRepository.findByGroupCustomerIdAndCustomerId(groupCustomerId, customerId);
    }

    public void deleteByGroupCustomerId(Long groupCustomerId) {
        groupMemberCustomerDetailsRepository.deleteByGroupCustomerId(groupCustomerId);
    }

}