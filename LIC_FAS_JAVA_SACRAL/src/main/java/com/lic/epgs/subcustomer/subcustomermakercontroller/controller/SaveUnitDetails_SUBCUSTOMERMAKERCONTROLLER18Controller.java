package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.CustomerUnitOfficeTempEntity;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.SaveUnitDetails_SUBCUSTOMERMAKERCONTROLLER18Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class SaveUnitDetails_SUBCUSTOMERMAKERCONTROLLER18Controller {

    @Autowired
    private SaveUnitDetails_SUBCUSTOMERMAKERCONTROLLER18Service saveUnitDetails_subcustomermakercontroller18Service;

    @GetMapping("/subcustomer/subcustomermakercontroller/findByCustomerIdAndSubCustomerIdAndSourceUnitIdAndChannelColorCodeAndChannelUserIdAndFromDateAndToDateAndCreatedByAndModifiedByAndActiveState")
    public ResponseEntity<CustomerUnitOfficeTempEntity> findByCustomerIdAndSubCustomerIdAndSourceUnitIdAndChannelColorCodeAndChannelUserIdAndFromDateAndToDateAndCreatedByAndModifiedByAndActiveState(
            @RequestParam Long customerId,
            @RequestParam Long subCustomerId,
            @RequestParam String sourceUnitId,
            @RequestParam String channelColorCode,
            @RequestParam String channelUserId,
            @RequestParam LocalDateTime fromDate,
            @RequestParam LocalDateTime toDate,
            @RequestParam String createdBy,
            @RequestParam String modifiedBy,
            @RequestParam Boolean activeState
    ) {
        CustomerUnitOfficeTempEntity customerUnitOfficeTempEntity = saveUnitDetails_subcustomermakercontroller18Service.findByCustomerIdAndSubCustomerIdAndSourceUnitIdAndChannelColorCodeAndChannelUserIdAndFromDateAndToDateAndCreatedByAndModifiedByAndActiveState(
                customerId,
                subCustomerId,
                sourceUnitId,
                channelColorCode,
                channelUserId,
                fromDate,
                toDate,
                createdBy,
                modifiedBy,
                activeState
        );
        return new ResponseEntity<>(customerUnitOfficeTempEntity, HttpStatus.OK);
    }

    @PostMapping("/subcustomer/subcustomermakercontroller/findByCustomerIdAndSubCustomerIdAndSourceUnitIdAndChannelColorCodeAndChannelUserIdAndFromDateAndToDateAndCreatedByAndModifiedByAndActiveStateIn")
    public ResponseEntity<List<CustomerUnitOfficeTempEntity>> findByCustomerIdAndSubCustomerIdAndSourceUnitIdAndChannelColorCodeAndChannelUserIdAndFromDateAndToDateAndCreatedByAndModifiedByAndActiveStateIn(
            @RequestParam Long customerId,
            @RequestParam Long subCustomerId,
            @RequestParam String sourceUnitId,
            @RequestParam String channelColorCode,
            @RequestParam String channelUserId,
            @RequestParam LocalDateTime fromDate,
            @RequestParam LocalDateTime toDate,
            @RequestParam String createdBy,
            @RequestParam String modifiedBy,
            @RequestParam Boolean[] activeState
    ) {
        List<CustomerUnitOfficeTempEntity> customerUnitOfficeTempEntities = saveUnitDetails_subcustomermakercontroller18Service.findByCustomerIdAndSubCustomerIdAndSourceUnitIdAndChannelColorCodeAndChannelUserIdAndFromDateAndToDateAndCreatedByAndModifiedByAndActiveStateIn(
                customerId,
                subCustomerId,
                sourceUnitId,
                channelColorCode,
                channelUserId,
                fromDate,
                toDate,
                createdBy,
                modifiedBy,
                activeState
        );
        return new ResponseEntity<>(customerUnitOfficeTempEntities, HttpStatus.OK);
    }

    @PostMapping("/subcustomer/subcustomermakercontroller/saveAll")
    public ResponseEntity<List<CustomerUnitOfficeTempEntity>> saveAll(@RequestBody List<CustomerUnitOfficeTempEntity> customerUnitOfficeTempEntities){
        List<CustomerUnitOfficeTempEntity> savedCustomer