//Spring Boot Controller Class 
package com.lic.epgs.stampduty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.stampduty.model.SaveNotesDetails_STAMP_DUTY_10;
import com.lic.epgs.stampduty.service.SaveNotesDetails_STAMP_DUTY_10Service;

@RestController
@RequestMapping("/stampduty")
public class SaveNotesDetails_STAMP_DUTY_10Controller {
	
	@Autowired
	private SaveNotesDetails_STAMP_DUTY_10Service service;
	
	@PostMapping
	public SaveNotesDetails_STAMP_DUTY_10 save(@RequestBody SaveNotesDetails_STAMP_DUTY_10 saveNotesDetails_STAMP_DUTY_10) {
		return service.save(saveNotesDetails_STAMP_DUTY_10);
	}
	
	@GetMapping("/{name}")
	public List<SaveNotesDetails_STAMP_DUTY_10> findByNameContainingIgnoreCase(@PathVariable String name) {
		return service.findByNameContainingIgnoreCase(name);
	}
	
	@GetMapping("/byjobtitle/{jobTitle}")
	public List<SaveNotesDetails_STAMP_DUTY_10> findByJobTitleContainingIgnoreCase(@PathVariable String jobTitle) {
		return service.findByJobTitleContainingIgnoreCase(jobTitle);
	}
	
	@GetMapping("/bydateofhire/{dateOfHire}")
	public List<SaveNotesDetails_STAMP_DUTY_10> findByDateOfHire(@PathVariable String dateOfHire) {
		return service.findByDateOfHire(dateOfHire);
	}
	
	@GetMapping("/name/{name}")
	public List<SaveNotesDetails_STAMP_DUTY_10> findByNameOrderByNameAsc(@PathVariable String name) {
		return service.findByNameOrderByNameAsc(name);
	}

}