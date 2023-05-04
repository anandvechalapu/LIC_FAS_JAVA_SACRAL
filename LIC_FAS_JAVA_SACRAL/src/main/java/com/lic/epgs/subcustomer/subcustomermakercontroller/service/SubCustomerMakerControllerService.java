package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerMakerController;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.SubCustomerMakerControllerRepository;

@Service
public class SubCustomerMakerControllerService {
    
	@Autowired
	private SubCustomerMakerControllerRepository subCustomerMakerControllerRepository;
	
	public Optional<SubCustomerMakerController> findByStatusAndWorkflowStatus(String status, String workflowStatus) {
		return subCustomerMakerControllerRepository.findByStatusAndWorkflowStatus(status, workflowStatus);
	}
	
	public void updateStatusById(String status, Long id) {
		subCustomerMakerControllerRepository.updateStatusById(status, id);
	}
	
	public void updateMappedDetailsById(String mappedDetails, Long id) {
		subCustomerMakerControllerRepository.updateMappedDetailsById(mappedDetails, id);
	}
	
}