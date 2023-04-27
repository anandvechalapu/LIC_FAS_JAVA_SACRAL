package com.lic.epgs.commission.controller;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.dto.CommissionQuestionDetailsDto;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsTempEntity;
import com.lic.epgs.commission.service.SaveQuestion9CommissionsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commission")
public class SaveQuestion9CommissionsController {

    @Autowired
    private SaveQuestion9CommissionsService saveQuestion9CommissionsService;

    @RequestMapping(value = "/markCommissionQuestionDetailsTempEntityAsInactiveById", method = RequestMethod.POST)
    public void markCommissionQuestionDetailsTempEntityAsInactiveById(Long id) {
        saveQuestion9CommissionsService.markCommissionQuestionDetailsTempEntityAsInactiveById(id);
    }

    @RequestMapping(value = "/saveCommissionQuestionDetailsTempEntity", method = RequestMethod.POST)
    public void saveCommissionQuestionDetailsTempEntity(Long commissionId, String details) {
        saveQuestion9CommissionsService.saveCommissionQuestionDetailsTempEntity(commissionId, details);
    }

    @RequestMapping(value = "/findByCommissionId", method = RequestMethod.GET)
    public List<CommissionQuestionDetailsTempEntity> findByCommissionId(Long commissionId) {
        return saveQuestion9CommissionsService.findByCommissionId(commissionId);
    }

    @RequestMapping(value = "/saveCommissionDetails", method = RequestMethod.POST)
    public CommonCommissionDto saveCommissionDetails(@RequestBody CommissionQuestionDetailsDto commissionQuestionDetailsDto) {
        return saveQuestion9CommissionsService.saveCommissionDetails(commissionQuestionDetailsDto.getTransactionStatus(), commissionQuestionDetailsDto.getTransactionMessage(), commissionQuestionDetailsDto.getCommissionId(), commissionQuestionDetailsDto.getCommissionQuestionDetailsTempEntities());
    }
}