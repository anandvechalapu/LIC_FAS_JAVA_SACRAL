package com.lic.epgs.gstexcemption.controller;

import com.lic.epgs.gstexcemption.dto.GstPolicyNumberDto;
import com.lic.epgs.gstexcemption.dto.CommonResponseDto;
import com.lic.epgs.gstexcemption.service.GstPolicyNumberByProposalNo18Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gstPolicyNumber")
public class GstPolicyNumberByProposalNo18Controller {

    @Autowired
    private GstPolicyNumberByProposalNo18Service gstPolicyNumberService;

    @GetMapping("/{policyNo}")
    public CommonResponseDto gstPolicyNumberByProposalNo(@PathVariable GstPolicyNumberDto policyNo) {
        return gstPolicyNumberService.gstPolicyNumberByProposalNo(policyNo);
    }
}