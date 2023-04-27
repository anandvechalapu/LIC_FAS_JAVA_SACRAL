package com.lic.epgs.gstexcemption.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.gstexcemption.model.GstPolicyNumber;
import com.lic.epgs.gstexcemption.service.GstPolicyNumber17Gstexcemption9Service;

@RestController
@RequestMapping("/api/gstExcemption")
public class GstPolicyNumber17Gstexcemption9Controller {

    @Autowired
    private GstPolicyNumber17Gstexcemption9Service gstPolicyNumber17Gstexcemption9Service;

    @GetMapping("/gstPolicyNumber")
    public List<GstPolicyNumber> getAllGstPolicyNumbers(){
        return gstPolicyNumber17Gstexcemption9Service.findAll();
    }

    @GetMapping("/gstPolicyNumber/{id}")
    public GstPolicyNumber getGstPolicyNumberById(@PathVariable Long id){
        return gstPolicyNumber17Gstexcemption9Service.findById(id);
    }

    @GetMapping("/gstPolicyNumber/gstPolicyNumber/{gstPolicyNumber}")
    public GstPolicyNumber getGstPolicyNumberByGstPolicyNumber(@PathVariable String gstPolicyNumber){
        return gstPolicyNumber17Gstexcemption9Service.findByGstPolicyNumber(gstPolicyNumber);
    }

    @GetMapping("/gstPolicyNumber/gstCode/{gstCode}")
    public GstPolicyNumber getGstPolicyNumberByGstCode(@PathVariable String gstCode){
        return gstPolicyNumber17Gstexcemption9Service.findByGstCode(gstCode);
    }

    @GetMapping("/gstPolicyNumber/gstNumber/{gstNumber}")
    public GstPolicyNumber getGstPolicyNumberByGstNumber(@PathVariable String gstNumber){
        return gstPolicyNumber17Gstexcemption9Service.findByGstNumber(gstNumber);
    }

    @GetMapping("/gstPolicyNumber/gstType/{gstType}")
    public GstPolicyNumber getGstPolicyNumberByGstType(@PathVariable String gstType){
        return gstPolicyNumber17Gstexcemption9Service.findByGstType(gstType);
    }

    @GetMapping("/gstPolicyNumber/authority/{authority}")
    public GstPolicyNumber getGstPolicyNumberByAuthority(@PathVariable String authority){
        return gstPolicyNumber17Gstexcemption9Service.findByAuthority(authority);
    }

    @GetMapping("/gstPolicyNumber/status/{status}")
    public GstPolicyNumber getGstPolicyNumberByStatus(@PathVariable String status){
        return gstPolicyNumber17Gstexcemption9Service.findByStatus(status);
    }

    @GetMapping("/gstPolicyNumber/teamCode/{teamCode}")
    public GstPolicyNumber getGstPolicyNumberByTeamCode(@PathVariable String teamCode){
        return gstPolicyNumber17Gstexcemption9Service.findByTeamCode(teamCode);
    }

    @GetMapping("/gstPolicyNumber/user/{user}")
    public GstPolicyNumber getGstPolicyNumberByUser(@PathVariable String user){
        return gstPolicyNumber17Gstexcemption9Service.findByUser(user);
    }

}