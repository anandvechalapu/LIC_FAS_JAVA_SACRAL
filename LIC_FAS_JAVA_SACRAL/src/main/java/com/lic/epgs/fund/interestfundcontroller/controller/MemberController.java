package com.lic.epgs.fund.interestfundcontroller.controller;

import java.util.List;
import java.util.Optional;

import com.lic.epgs.fund.interestfundcontroller.entity.Member;
import com.lic.epgs.fund.interestfundcontroller.service.PolicyMemberViewMembersByPolicyNoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    PolicyMemberViewMembersByPolicyNoService policyMemberViewMembersByPolicyNoService;

    @GetMapping("/{policyNo}")
    public List<Member> findMembersByPolicyNo(@PathVariable String policyNo) {
        return policyMemberViewMembersByPolicyNoService.findMembersByPolicyNo(policyNo);
    }

    @GetMapping("/{policyNo}/{memberId}")
    public Optional<Member> findMemberByPolicyNo(@PathVariable String policyNo, @PathVariable Long memberId) {
        return policyMemberViewMembersByPolicyNoService.findMemberByPolicyNo(policyNo, memberId);
    }

}