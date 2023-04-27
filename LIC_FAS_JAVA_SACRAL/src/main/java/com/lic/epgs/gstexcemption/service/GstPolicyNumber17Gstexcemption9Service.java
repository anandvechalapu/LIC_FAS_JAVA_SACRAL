package com.lic.epgs.gstexcemption.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.gstexcemption.model.GstPolicyNumber;
import com.lic.epgs.gstexcemption.repository.GstPolicyNumber17Gstexcemption9Repository;

@Service
public class GstPolicyNumber17Gstexcemption9Service {

    @Autowired
    private GstPolicyNumber17Gstexcemption9Repository gstPolicyNumber17Gstexcemption9Repository;

    public List<GstPolicyNumber> findAll(){
        return gstPolicyNumber17Gstexcemption9Repository.findAll();
    }

    public GstPolicyNumber findById(Long id){
        return gstPolicyNumber17Gstexcemption9Repository.findById(id);
    }

    public GstPolicyNumber findByGstPolicyNumber(String gstPolicyNumber){
        return gstPolicyNumber17Gstexcemption9Repository.findByGstPolicyNumber(gstPolicyNumber);
    }

    public GstPolicyNumber findByGstCode(String gstCode){
        return gstPolicyNumber17Gstexcemption9Repository.findByGstCode(gstCode);
    }

    public GstPolicyNumber findByGstNumber(String gstNumber){
        return gstPolicyNumber17Gstexcemption9Repository.findByGstNumber(gstNumber);
    }

    public GstPolicyNumber findByGstType(String gstType){
        return gstPolicyNumber17Gstexcemption9Repository.findByGstType(gstType);
    }

    public GstPolicyNumber findByAuthority(String authority){
        return gstPolicyNumber17Gstexcemption9Repository.findByAuthority(authority);
    }

    public GstPolicyNumber findByStatus(String status){
        return gstPolicyNumber17Gstexcemption9Repository.findByStatus(status);
    }

    public GstPolicyNumber findByTeamCode(String teamCode){
        return gstPolicyNumber17Gstexcemption9Repository.findByTeamCode(teamCode);
    }

    public GstPolicyNumber findByUser(String user){
        return gstPolicyNumber17Gstexcemption9Repository.findByUser(user);
    }

}