package com.lic.epgs.gstexcemption.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.gstexcemption.model.GstPolicyNumber;

@Repository
public interface GstPolicyNumber17Gstexcemption9Repository extends JpaRepository<GstPolicyNumber, Long> {

    List<GstPolicyNumber> findAll();

    GstPolicyNumber findById(Long id);

    GstPolicyNumber findByGstPolicyNumber(String gstPolicyNumber);

    GstPolicyNumber findByGstCode(String gstCode);

    GstPolicyNumber findByGstNumber(String gstNumber);

    GstPolicyNumber findByGstType(String gstType);

    GstPolicyNumber findByAuthority(String authority);

    GstPolicyNumber findByStatus(String status);

    GstPolicyNumber findByTeamCode(String teamCode);

    GstPolicyNumber findByUser(String user);

}