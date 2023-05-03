package com.lic.epgs.lead.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.lead.dto.CommonLeadDto;
import com.lic.epgs.lead.dto.LeadBasicDetailsDto;
import com.lic.epgs.lead.dto.SearchLeadDto;

@Repository
public interface InProgressCriteriaSearchRepository extends JpaRepository<CommonLeadDto, Long> {

    @Query("SELECT l FROM CommonLeadDto l WHERE l.loginUser = :loginUser AND l.transactionStatus = 'IN_PROGRESS' AND l.searchCriteria = :searchCriteria")
    public LeadBasicDetailsDto[] findLeadsByCriteriaQuery(@Param("loginUser") String loginUser, @Param("searchCriteria") SearchLeadDto searchDto);

    @Query("SELECT l FROM CommonLeadDto l WHERE l.loginUser = :loginUser AND l.transactionStatus = 'IN_PROGRESS' AND l.inProgressSearchValidation = true")
    public LeadBasicDetailsDto[] findLeadsByValidation(@Param("loginUser") String loginUser);

    @Query("SELECT l FROM CommonLeadDto l WHERE l.loginUser = :loginUser AND l.transactionStatus = 'IN_PROGRESS' AND l.inProgressSearchMakerValidation = true")
    public LeadBasicDetailsDto[] findLeadsByMakerValidation(@Param("loginUser") String loginUser);

}