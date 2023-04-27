package com.lic.epgs.commission.service;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.repository.LoadQuestionMaster6CommissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadQuestionMaster6CommissionService {

    @Autowired
    LoadQuestionMaster6CommissionRepository loadQuestionMaster6CommissionRepository;

    public List<CommonCommissionDto> getQuestionMaster6CommissionDetails(){
        return loadQuestionMaster6CommissionRepository.loadQuestionMaster();
    }

}