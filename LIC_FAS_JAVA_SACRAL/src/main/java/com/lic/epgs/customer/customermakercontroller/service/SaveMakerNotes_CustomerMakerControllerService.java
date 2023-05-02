package com.lic.epgs.customer.customermakercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customermakercontroller.entity.CustomerMakerController;
import com.lic.epgs.customer.customermakercontroller.repository.SaveMakerNotes_CustomerMakerControllerRepository;

@Service
public class SaveMakerNotes_CustomerMakerControllerService {

	@Autowired
	private SaveMakerNotes_CustomerMakerControllerRepository repository;
	
	public List<CustomerMakerController> getAllNotes(){
		return repository.findAll();
	}
	
	public CustomerMakerController saveNote(CustomerMakerController customerMakerController) {
		return repository.save(customerMakerController);
	}
	
	public CustomerMakerController getNoteById(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public void deleteNoteById(Long id) {
		repository.deleteById(id);
	}
	
}