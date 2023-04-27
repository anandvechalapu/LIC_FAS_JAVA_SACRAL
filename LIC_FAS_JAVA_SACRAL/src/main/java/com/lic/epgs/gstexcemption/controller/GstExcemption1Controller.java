package com.lic.epgs.gstexcemption.controller;

import com.lic.epgs.gstexcemption.model.GstExcemption1;
import com.lic.epgs.gstexcemption.service.GstExcemption1Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gstexcemption1")
public class GstExcemption1Controller {

    @Autowired
    private GstExcemption1Service gstExcemption1Service;

    @PostMapping
    public GstExcemption1 addGstExcemption1(@RequestBody GstExcemption1 gstExcemption1) {
        return gstExcemption1Service.saveGstExcemption1(gstExcemption1);
    }

}