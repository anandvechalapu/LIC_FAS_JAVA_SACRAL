@Repository
package com.lic.epgs.gstexcemption.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.gstexcemption.model.DocumentDetailsDto;

@Repository
public interface SaveGstDocumentDetails14Repository extends JpaRepository<DocumentDetailsDto, Long> {

    DocumentDetailsDto findByGstExemptionId(Long gstExemptionId);

    DocumentDetailsDto save(DocumentDetailsDto documentDetailsDto);

    void deleteByGstExemptionId(Long gstExemptionId);

}