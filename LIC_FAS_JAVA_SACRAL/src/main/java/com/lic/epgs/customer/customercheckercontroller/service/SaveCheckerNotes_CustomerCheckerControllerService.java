package com.lic.epgs.customer.customercheckercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.customer.customercheckercontroller.entity.SaveCheckerNotes;
import com.lic.epgs.customer.customercheckercontroller.repository.SaveCheckerNotes_CustomerCheckerControllerRepository;

@Service
public class SaveCheckerNotes_CustomerCheckerControllerService {
	
	@Autowired
	private SaveCheckerNotes_CustomerCheckerControllerRepository saveCheckerNotes_CustomerCheckerControllerRepository;
	
	public List<SaveCheckerNotes> getAllSaveCheckerNotes() {
		return saveCheckerNotes_CustomerCheckerControllerRepository.findAll();
	}
	
	public SaveCheckerNotes getSaveCheckerNotesByID(Long id) {
		return saveCheckerNotes_CustomerCheckerControllerRepository.findById(id).orElse(null);
	}
	
	public SaveCheckerNotes saveSaveCheckerNotes(SaveCheckerNotes saveCheckerNotes) {
		return saveCheckerNotes_CustomerCheckerControllerRepository.save(saveCheckerNotes);
	}
	
	public void deleteSaveCheckerNotes(Long id) {
		saveCheckerNotes_CustomerCheckerControllerRepository.deleteById(id);
	}

}