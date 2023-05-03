package com.lic.epgs.lead.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.model.Customer;
import com.lic.epgs.lead.service.GetCustomerDetails_LEAD8Service;

@RestController
public class GetCustomerDetails_LEAD8Controller {

   @Autowired
   GetCustomerDetails_LEAD8Service getCustomerDetails_LEAD8Service;

   @GetMapping("/getCustomerDetails/{customerId}")
   public Optional<Customer> getCustomerDetails(@PathVariable("customerId") Long customerId) {
      return getCustomerDetails_LEAD8Service.getCustomerDetails(customerId);
   }

   @GetMapping("/findAllByCustomerStatusAndIndustryType")
   public List<Customer> findAllByCustomerStatusAndIndustryType(@RequestParam("status") String status,
         @RequestParam("industryType") String industryType) {
      return getCustomerDetails_LEAD8Service.findAllByCustomerStatusAndIndustryType(status, industryType);
   }

   @GetMapping("/findAllByCustomerIdAndCustomerCodeAndCustomerNameAndPANAndCustomerTypeAndCustomerStatusAndIndustryTypeAndCustomerEntity")
   public List<Customer> findAllByCustomerIdAndCustomerCodeAndCustomerNameAndPANAndCustomerTypeAndCustomerStatusAndIndustryTypeAndCustomerEntity(
         @RequestParam("customerId") Long customerId,
         @RequestParam("customerCode") String customerCode,
         @RequestParam("customerName") String customerName,
         @RequestParam("PAN") String PAN,
         @RequestParam("customerType") String customerType,
         @RequestParam("customerStatus") String customerStatus,
         @RequestParam("industryType") String industryType,
         @RequestParam("customerEntity") String customerEntity) {
      return getCustomerDetails_LEAD8Service
            .findAllByCustomerIdAndCustomerCodeAndCustomerNameAndPANAndCustomerTypeAndCustomerStatusAndIndustryTypeAndCustomerEntity(
                  customerId, customerCode, customerName, PAN, customerType, customerStatus, industryType,
                  customerEntity);
   }

   @GetMapping("/findByCustomerIdAndCustomerStatus")
   public List<Customer> findByCustomerIdAndCustomerStatus(@RequestParam("customerId") Long customerId,
         @RequestParam("status") String status) {
      return getCustomerDetails_LEAD8Service.findByCustomerIdAndCustomerStatus(customerId, status);
   }

   @GetMapping("/findByCustomerIdAndCustomerStatusAndIndustryType")
   public List<Customer> findByCustomerIdAndCustomerStatusAndIndustryType(
         @RequestParam("customerId") Long customerId,
         @RequestParam("status") String status,
         @RequestParam("industryType") String industryType) {
      return getCustomerDetails_LEAD8Service.findByCustomerIdAndCustomerStatusAndIndustryType(customerId, status,
            industryType);
   }

}