package com.lic.epgs.stampduty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.stampduty.model.InprogressLoad_STAMP_DUTY;

@Repository
public interface InprogressLoad_STAMP_DUTY_Repository extends JpaRepository<InprogressLoad_STAMP_DUTY, Long> {

    @Query("SELECT i FROM InprogressLoad_STAMP_DUTY i WHERE i.role = ?1 AND i.unitOfficeCode = ?2")
    public InprogressLoad_STAMP_DUTY getInprogressLoad_STAMP_DUTY(String role, String unitOfficeCode);

}