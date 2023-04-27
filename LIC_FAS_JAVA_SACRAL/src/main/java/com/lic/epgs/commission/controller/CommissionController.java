package com.lic.epgs.commission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.model.Commission;
import com.lic.epgs.commission.service.CommissionService;

@RestController
@RequestMapping("/commission")
public class CommissionController {
    
    @Autowired
    private CommissionService commissionService;

    @GetMapping("/{commissionId}/{commissionDetailsId}")
    public Commission getCommission(@PathVariable("commissionId") String commissionId, @PathVariable("commissionDetailsId") Long commissionDetailsId){
        return commissionService.findByCommissionIdAndCommissionDetailsId(commissionId, commissionDetailsId);
    }

    @PostMapping
    public Commission saveCommission(@RequestBody Commission commission){
        return commissionService.save(commission);
    }

    @PutMapping
    public Commission updateCommission(@RequestBody Commission commission){
        return commissionService.update(commission);
    }

    @PutMapping("/addNotesAndQuestions")
    public void addCommissionNotesAndQuestions(@RequestBody Commission commission){
        commissionService.addCommissionNotesAndQuestions(commission);
    }

}