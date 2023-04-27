package com.lic.epgs.gstexcemption.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.gstexcemption.dto.GstExcemptionDto;
import com.lic.epgs.gstexcemption.dto.GstResponseDto;

@Repository
public interface GstExcemptionRepository extends JpaRepository<GstExcemptionDto, Integer> {

    GstResponseDto<List<GstExcemptionDto>> searchforExisting(String gstNo, String unitCode, String proposalNo);

}