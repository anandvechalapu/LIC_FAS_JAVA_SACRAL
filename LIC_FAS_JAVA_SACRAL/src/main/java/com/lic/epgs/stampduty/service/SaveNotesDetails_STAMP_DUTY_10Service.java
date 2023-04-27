//Spring Boot Service Class
package com.lic.epgs.stampduty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.stampduty.model.SaveNotesDetails_STAMP_DUTY_10;
import com.lic.epgs.stampduty.repository.SaveNotesDetails_STAMP_DUTY_10Repository;

@Service
public class SaveNotesDetails_STAMP_DUTY_10Service {
	
	@Autowired
	private SaveNotesDetails_STAMP_DUTY_10Repository repository;
	
	public SaveNotesDetails_STAMP_DUTY_10 save(SaveNotesDetails_STAMP_DUTY_10 saveNotesDetails_STAMP_DUTY_10) {
		return repository.save(saveNotesDetails_STAMP_DUTY_10);
	}
	
	public List<SaveNotesDetails_STAMP_DUTY_10> findByNameContainingIgnoreCase(String name) {
		return repository.findByNameContainingIgnoreCase(name);
	}
	
	public List<SaveNotesDetails_STAMP_DUTY_10> findByJobTitleContainingIgnoreCase(String jobTitle) {
		return repository.findByJobTitleContainingIgnoreCase(jobTitle);
	}
	
	public List<SaveNotesDetails_STAMP_DUTY_10> findByDateOfHire(String dateOfHire) {
		return repository.findByDateOfHire(dateOfHire);
	}
	
	public List<SaveNotesDetails_STAMP_DUTY_10> findByNameOrderByNameAsc(String name) {
		return repository.findByNameOrderByNameAsc(name);
	}

}