package com.lic.epgs.lead.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.lead.dto.CommonLeadDto;
import com.lic.epgs.lead.dto.LeadBasicDetailsDto;
import com.lic.epgs.lead.dto.SearchLeadDto;
import com.lic.epgs.lead.service.InProgressCriteriaSearchService;

@RestController
@RequestMapping("/inprogress")
public class InProgressCriteriaSearchController {

    @Autowired
    private InProgressCriteriaSearchService inProgressCriteriaSearchService;

    @PostMapping(value = "/searchLeadsByCriteria")
    public ResponseEntity<?> findLeadsByCriteriaQuery(@RequestBody CommonLeadDto commonLeadDto) {
        LeadBasicDetailsDto[] leadBasicDetailsDtos = inProgressCriteriaSearchService.findLeadsByCriteriaQuery(commonLeadDto.getLoginUser(), commonLeadDto.getSearchCriteria());
        return new ResponseEntity<>(leadBasicDetailsDtos, HttpStatus.OK);
    }

    @PostMapping(value = "/searchLeadsByValidation")
    public ResponseEntity<?> findLeadsByValidation(@RequestBody CommonLeadDto commonLeadDto) {
        LeadBasicDetailsDto[] leadBasicDetailsDtos = inProgressCriteriaSearchService.findLeadsByValidation(commonLeadDto.getLoginUser());
        return new ResponseEntity<>(leadBasicDetailsDtos, HttpStatus.OK);
    }

    @PostMapping(value = "/searchLeadsByMakerValidation")
    public ResponseEntity<?> findLeadsByMakerValidation(@RequestBody CommonLeadDto commonLeadDto) {
        LeadBasicDetailsDto[] leadBasicDetailsDtos = inProgressCriteriaSearchService.findLeadsByMakerValidation(commonLeadDto.getLoginUser());
        return new ResponseEntity<>(leadBasicDetailsDtos, HttpStatus.OK);
    }

}