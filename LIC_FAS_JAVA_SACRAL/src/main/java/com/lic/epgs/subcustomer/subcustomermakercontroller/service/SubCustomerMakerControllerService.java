package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.SubCustomerMakerControllerRepository;
import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerMakerController;

@Service
public class SubCustomerMakerControllerService {

	@Autowired
	private SubCustomerMakerControllerRepository subCustomerMakerControllerRepository;

	public List<SubCustomerMakerController> getMakerNotesBySubCustomerId(long subCustomerId) {
		return subCustomerMakerControllerRepository.getMakerNotesBySubCustomerId(subCustomerId);
	}

}