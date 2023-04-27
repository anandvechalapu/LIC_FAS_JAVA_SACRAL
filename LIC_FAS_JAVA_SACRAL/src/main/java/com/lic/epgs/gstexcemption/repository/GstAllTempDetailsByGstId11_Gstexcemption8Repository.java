package com.lic.epgs.gstexcemption.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.gstexcemption.model.GstAllTempDetailsByGstId11_Gstexcemption8;

@Repository
public interface GstAllTempDetailsByGstId11_Gstexcemption8Repository extends JpaRepository<GstAllTempDetailsByGstId11_Gstexcemption8, Long> {

    GstAllTempDetailsByGstId11_Gstexcemption8 findByGstExemptionId(Long gstExemptionId);

}