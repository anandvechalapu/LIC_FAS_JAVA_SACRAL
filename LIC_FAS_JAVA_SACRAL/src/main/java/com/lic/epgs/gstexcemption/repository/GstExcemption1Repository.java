package com.lic.epgs.gstexcemption.repository;

import com.lic.epgs.gstexcemption.model.GstExcemption1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface GstExcemption1Repository extends JpaRepository<GstExcemption1, Long> {

    @Modifying
    @Transactional
    @Query("update GstExcemption1 g set g.isActive = false where g.gstexcemptionId = ?1")
    int updateExistingRecord(Long gstexcemptionId);
}