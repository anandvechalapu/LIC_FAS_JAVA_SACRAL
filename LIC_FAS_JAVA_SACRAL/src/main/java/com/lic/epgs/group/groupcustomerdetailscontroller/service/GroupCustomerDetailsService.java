package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupCustomerDetailsRepository;

@Service
public class GroupCustomerDetailsService {
    
    @Autowired
    private GroupCustomerDetailsRepository groupCustomerDetailsRepository;

    public GroupCustomerDetails getGroupDetailsMakerByGroupCustomerIdAndUnitCode(Long groupCustomerId, String unitCode) {
        return groupCustomerDetailsRepository.getGroupDetailsMakerByGroupCustomerIdAndUnitCode(groupCustomerId, unitCode);
    }

    public GroupCustomerDetails getGroupDetailsMakerByGroupCustomerId(Long groupCustomerId) {
        return groupCustomerDetailsRepository.getGroupDetailsMakerByGroupCustomerId(groupCustomerId);
    }

    public List<GroupCustomerDetails> findAll() {
        return groupCustomerDetailsRepository.findAll();
    }

    public GroupCustomerDetails save(GroupCustomerDetails groupCustomerDetails) {
        return groupCustomerDetailsRepository.save(groupCustomerDetails);
    }

}