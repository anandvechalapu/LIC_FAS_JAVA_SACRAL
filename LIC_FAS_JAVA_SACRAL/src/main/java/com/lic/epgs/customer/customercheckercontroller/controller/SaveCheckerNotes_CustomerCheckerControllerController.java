package com.lic.epgs.customer.customercheckercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.customer.customercheckercontroller.model.SaveCheckerNotesModel;
import com.lic.epgs.customer.customercheckercontroller.service.SaveCheckerNotes_CustomerCheckerControllerService;

@RestController
@RequestMapping("/savecheckernotes")
public class SaveCheckerNotes_CustomerCheckerControllerController {
	
	@Autowired
	private SaveCheckerNotes_CustomerCheckerControllerService saveCheckerNotes_CustomerCheckerControllerService;
	
	@GetMapping
	public List<SaveCheckerNotesModel> getAllSaveCheckerNotes() {
		return saveCheckerNotes_CustomerCheckerControllerService.getAllSaveCheckerNotes();
	}
	
	@GetMapping("/{id}")
	public SaveCheckerNotesModel getSaveCheckerNotesByID(@PathVariable Long id) {
		return saveCheckerNotes_CustomerCheckerControllerService.getSaveCheckerNotesByID(id);
	}
	
	@PostMapping
	public SaveCheckerNotesModel saveSaveCheckerNotes(@RequestBody SaveCheckerNotesModel saveCheckerNotesModel) {
		return saveCheckerNotes_CustomerCheckerControllerService.saveSaveCheckerNotes(saveCheckerNotesModel);
	}
	
	@PutMapping
	public SaveCheckerNotesModel updateSaveCheckerNotes(@RequestBody SaveCheckerNotesModel saveCheckerNotesModel) {
		return saveCheckerNotes_CustomerCheckerControllerService.saveSaveCheckerNotes(saveCheckerNotesModel);
	}
	
	@DeleteMapping("/{id}")
	public void deleteSaveCheckerNotes(@PathVariable Long id) {
		saveCheckerNotes_CustomerCheckerControllerService.deleteSaveCheckerNotes(id);
	}

}