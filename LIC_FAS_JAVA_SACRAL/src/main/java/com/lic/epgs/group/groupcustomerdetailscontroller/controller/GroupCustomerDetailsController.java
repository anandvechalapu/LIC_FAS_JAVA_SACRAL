package com.lic.epgs.group.groupcustomerdetailscontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetails;
import com.lic.epgs.group.groupcustomerdetailscontroller.service.GroupCustomerDetailsService;

@RestController
public class GroupCustomerDetailsController {
  
  @Autowired
  private GroupCustomerDetailsService groupCustomerDetailsService;

  @GetMapping
  public List<GroupCustomerDetails> getGroupCustomerDetails() {
    return groupCustomerDetailsService.getGroupCustomerDetails();
  }

  @DeleteMapping
  public void deleteGroupCustomerDetails(Long groupCustomerId) {
    groupCustomerDetailsService.deleteGroupCustomerDetails(groupCustomerId);
  }

}