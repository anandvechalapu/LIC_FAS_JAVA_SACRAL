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

  public List<GroupCustomerDetails> getGroupCustomerDetails() {
    return groupCustomerDetailsRepository.findAll();
  }

  public void deleteGroupCustomerDetails(Long groupCustomerId) {
    groupCustomerDetailsRepository.deleteGroupCustomerDetails(groupCustomerId);
  }
  
}