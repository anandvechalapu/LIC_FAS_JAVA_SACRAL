package com.lic.epgs.gstexcemption.controller;

import com.lic.epgs.gstexcemption.model.IssuedBy22GstExcemption;
import com.lic.epgs.gstexcemption.service.IssuedBy22GstExcemptionService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gst-excemption")
public class IssuedBy22GstExcemptionController {

    private final IssuedBy22GstExcemptionService issuedBy22GstExcemptionService;

    public IssuedBy22GstExcemptionController(IssuedBy22GstExcemptionService issuedBy22GstExcemptionService) {
        this.issuedBy22GstExcemptionService = issuedBy22GstExcemptionService;
    }

    @GetMapping
    public List<IssuedBy22GstExcemption> findAll(){
        return issuedBy22GstExcemptionService.findAll();
    }

    @GetMapping("/{id}")
    public IssuedBy22GstExcemption findById(@PathVariable Long id){
        return issuedBy22GstExcemptionService.findById(id).orElse(null);
    }

    @GetMapping("/name/{name}")
    public List<IssuedBy22GstExcemption> findByName(@PathVariable String name){
        return issuedBy22GstExcemptionService.findByName(name);
    }

    @GetMapping("/description/{description}")
    public List<IssuedBy22GstExcemption> findByDescription(@PathVariable String description){
        return issuedBy22GstExcemptionService.findByDescription(description);
    }

    @GetMapping("/issuer/{issuer}")
    public List<IssuedBy22GstExcemption> findByIssuer(@PathVariable String issuer){
        return issuedBy22GstExcemptionService.findByIssuer(issuer);
    }

    @PostMapping
    public void save(@RequestBody IssuedBy22GstExcemption gstExcemption){
        issuedBy22GstExcemptionService.save(gstExcemption);
    }
}