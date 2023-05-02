Name();
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentExpiryDate() {
        return documentExpiryDate;
    }

    public void setDocumentExpiryDate(String documentExpiryDate) {
        this.documentExpiryDate = documentExpiryDate;
    }

    public String getUnitOffice() {
        return unitOffice;
    }

    public void setUnitOffice(String unitOffice) {
        this.unitOffice = unitOffice;
    }

    public String getUnitOfficeCode() {
        return unitOfficeCode;
    }

    public void setUnitOfficeCode(String unitOfficeCode) {
        this.unitOfficeCode = unitOfficeCode;
    }

}

package com.lic.epgs.customer.customercheckercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customercheckercontroller.dto.CustomerBasicDetailsDto;
import com.lic.epgs.customer.customercheckercontroller.service.EditExitingCustomerBasicDetailsService;

@RestController
@RequestMapping("/customerchecker/")
public class EditExitingCustomerBasicDetailsController {

	@Autowired
	private EditExitingCustomerBasicDetailsService editExitingCustomerBasicDetailsService;
	
	@PostMapping("/edit/customer")
	public ResponseEntity<CustomerBasicDetailsDto> editExitingCustomerBasicDetails(@RequestBody CustomerBasicDetailsDto customerBasicDetailsDto){
		return new ResponseEntity<>(editExitingCustomerBasicDetailsService.save(customerBasicDetailsDto), HttpStatus.OK);
	}
	
	@PostMapping("/create/history/customer")
	public ResponseEntity<Void> createHistoryRecordForCustomerBasicDetails(@RequestBody CustomerBasicDetailsDto customerBasicDetailsDto){
		editExitingCustomerBasicDetailsService.createHistoryRecordForCustomerBasicDetails(customerBasicDetailsDto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PostMapping("/create/history/address")
	public ResponseEntity<Void> createHistoryRecordForAddressDetails(@RequestBody CustomerBasicDetailsDto customerBasicDetailsDto){
		editExitingCustomerBasicDetailsService.createHistoryRecordForAddressDetails(customerBasicDetailsDto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PostMapping("/create/history/contact")
	public ResponseEntity<Void> createHistoryRecordForContactDetails(@RequestBody CustomerBasicDetailsDto customerBasicDetailsDto){
		editExitingCustomerBasicDetailsService.createHistoryRecordForContactDetails(customerBasicDetailsDto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	