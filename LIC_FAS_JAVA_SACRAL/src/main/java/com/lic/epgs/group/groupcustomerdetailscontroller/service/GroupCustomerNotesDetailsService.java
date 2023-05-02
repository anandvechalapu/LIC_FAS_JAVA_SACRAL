package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerNotesDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupCustomerNotesDetailsRepository;

@Service
public class GroupCustomerNotesDetailsService {

    @Autowired
    private GroupCustomerNotesDetailsRepository groupCustomerNotesDetailsRepository;
    
    public List<GroupCustomerNotesDetails> findByGroupCustomerIdAndDateRange(Long groupCustomerId, 
                                                                            String startDate, 
                                                                            String endDate) {
        return groupCustomerNotesDetailsRepository.findByGroupCustomerIdAndDateRange(groupCustomerId, startDate, endDate);
    }
}