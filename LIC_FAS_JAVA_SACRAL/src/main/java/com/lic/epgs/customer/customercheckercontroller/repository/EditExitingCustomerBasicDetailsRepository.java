package com.lic.epgs.customer.customercheckercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.customer.customercheckercontroller.dto.CustomerBasicDetailsDto;

public interface EditExitingCustomerBasicDetailsRepository extends JpaRepository<CustomerBasicDetailsDto, Long> {
    CustomerBasicDetailsDto findByCustomerId(Long customerId);
    
    CustomerBasicDetailsDto save(CustomerBasicDetailsDto customerBasicDetailsDto);
    
    void createHistoryRecordForCustomerBasicDetails(CustomerBasicDetailsDto customerBasicDetailsDto);
    
    void createHistoryRecordForAddressDetails(CustomerBasicDetailsDto customerBasicDetailsDto);
    
    void createHistoryRecordForContactDetails(CustomerBasicDetailsDto customerBasicDetailsDto);
    
    void createHistoryRecordForCustomerNotes(CustomerBasicDetailsDto customerBasicDetailsDto);
    
    void createHistoryRecordForBankAccountDetails(CustomerBasicDetailsDto customerBasicDetailsDto);
    
    void createHistoryRecordForDocumentDetails(CustomerBasicDetailsDto customerBasicDetailsDto);
    
    void createHistoryRecordForCustomerUnitOfficeDetails(CustomerBasicDetailsDto customerBasicDetailsDto);
}