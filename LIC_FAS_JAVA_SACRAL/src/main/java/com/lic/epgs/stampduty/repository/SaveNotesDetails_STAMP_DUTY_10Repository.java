package com.lic.epgs.stampduty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.stampduty.model.SaveNotesDetails_STAMP_DUTY_10;

@Repository
public interface SaveNotesDetails_STAMP_DUTY_10Repository extends JpaRepository<SaveNotesDetails_STAMP_DUTY_10, Long> {
	
	public SaveNotesDetails_STAMP_DUTY_10 findByNameContainingIgnoreCase(String name);
	public SaveNotesDetails_STAMP_DUTY_10 findByJobTitleContainingIgnoreCase(String jobTitle);
	public SaveNotesDetails_STAMP_DUTY_10 findByDateOfHire(String dateOfHire);
	public SaveNotesDetails_STAMP_DUTY_10 findByNameOrderByNameAsc(String name);
	
}