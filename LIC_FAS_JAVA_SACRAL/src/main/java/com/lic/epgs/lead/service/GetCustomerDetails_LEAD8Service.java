package com.lic.epgs.lead.service;
 
import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.lic.epgs.lead.repository.GetCustomerDetails_LEAD8Repository;
import com.lic.epgs.lead.model.Customer;
 
@Service
public class GetCustomerDetails_LEAD8Service {
 
   @Autowired
   GetCustomerDetails_LEAD8Repository getCustomerDetails_LEAD8Repository;
 
   public Optional<Customer> getCustomerDetails(Long customerId) {
       return getCustomerDetails_LEAD8Repository.getCustomerDetails(customerId);
   }
 
   public List<Customer> findAllByCustomerStatusAndIndustryType(String status, String industryType) { 
       return getCustomerDetails_LEAD8Repository.findAllByCustomerStatusAndIndustryType(status, industryType);
   }
 
   public List<Customer> findAllByCustomerIdAndCustomerCodeAndCustomerNameAndPANAndCustomerTypeAndCustomerStatusAndIndustryTypeAndCustomerEntity(
           Long customerId, String customerCode, String customerName, String PAN, String customerType, String customerStatus, String industryType, String customerEntity) { 
       return getCustomerDetails_LEAD8Repository.findAllByCustomerIdAndCustomerCodeAndCustomerNameAndPANAndCustomerTypeAndCustomerStatusAndIndustryTypeAndCustomerEntity(
               customerId, customerCode, customerName, PAN, customerType, customerStatus, industryType, customerEntity);
   }
 
   public List<Customer> findByCustomerIdAndCustomerStatus(Long customerId, String status) { 
       return getCustomerDetails_LEAD8Repository.findByCustomerIdAndCustomerStatus(customerId, status);
   }
 
   public List<Customer> findByCustomerIdAndCustomerStatusAndIndustryType(Long customerId, String status, String industryType) { 
       return getCustomerDetails_LEAD8Repository.findByCustomerIdAndCustomerStatusAndIndustryType(customerId, status, industryType);
   }
 
}