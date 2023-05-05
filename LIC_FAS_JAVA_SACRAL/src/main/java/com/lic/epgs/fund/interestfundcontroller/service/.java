package com.lic.epgs.fund.interestfundcontroller.service;

import com.lic.epgs.fund.interestfundcontroller.entity.Member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PolicyMemberViewMembersByPolicyNoService {

    List<Member> findMembersByPolicyNo(String policyNo);
    Optional<Member> findMemberByPolicyNo(String policyNo);
    
}