package com.lic.epgs.stampduty.service;

import com.lic.epgs.stampduty.model.StampDuty;
import com.lic.epgs.stampduty.repository.SaveStampDutyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveStampDutyService {

    @Autowired
    private SaveStampDutyRepository saveStampDutyRepository;

    public StampDuty save(StampDuty stampDuty) {
        return saveStampDutyRepository.save(stampDuty);
    }
}

package com.lic.epgs.stampduty.controller;

import com.lic.epgs.stampduty.model.StampDuty;
import com.lic.epgs.stampduty.service.GetExistingLoadStampDutyService;
import com.lic.epgs.stampduty.service.SaveStampDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/stampduty")
public class StampDutyController {

    @Autowired
    private GetExistingLoadStampDutyService getExistingLoadStampDutyService;

    @Autowired
    private SaveStampDutyService saveStampDutyService;

    @GetMapping("/get")
    public Optional<StampDuty> getStampDutyByRoleAndUnitOfficeCode(@RequestParam("role") String role, @RequestParam("unitOfficeCode") String unitOfficeCode) {
        return getExistingLoadStampDutyService.findByRoleAndUnitOfficeCode(role, unitOfficeCode);
    }

    @PostMapping("/save")
    public StampDuty saveStampDuty(@RequestBody StampDuty stampDuty) {
        return saveStampDutyService.save(stampDuty);
    }

}