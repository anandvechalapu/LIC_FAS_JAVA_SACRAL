package com.lic.epgs.commission.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lic.epgs.commission.model.Commission;
import com.lic.epgs.commission.repository.CommissionRepository;

@Service
public class CommissionService {

    @Autowired
    private CommissionRepository commissionRepository;

    public Commission findByCommissionIdAndCommissionDetailsId(String commissionId, Long commissionDetailsId){
        return commissionRepository.findByCommissionIdAndCommissionDetailsId(commissionId, commissionDetailsId);
    }

    public Commission save(Commission commission){
        return commissionRepository.save(commission);
    }

    public Commission update(Commission commission){
        return commissionRepository.update(commission);
    }

    public void addCommissionNotesAndQuestions(Commission commission){
        commissionRepository.addCommissionNotesAndQuestions(commission);
    }

}