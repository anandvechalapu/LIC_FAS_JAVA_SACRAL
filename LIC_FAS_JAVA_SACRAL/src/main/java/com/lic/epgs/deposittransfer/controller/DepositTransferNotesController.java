package com.lic.epgs.deposittransfer.controller;

import com.lic.epgs.deposittransfer.dto.ApiResponseDto;
import com.lic.epgs.deposittransfer.dto.DepositTransferNotesDto;
import com.lic.epgs.deposittransfer.service.DepositTransferNotesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepositTransferNotesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepositTransferNotesService.class);

    @Autowired
    private DepositTransferNotesService depositTransferNotesService;

    @PostMapping(value = "/saveDepositNote")
    public ResponseEntity<ApiResponseDto> saveDepositNote(@RequestBody DepositTransferNotesDto depositTransferNotesDto) {
        ApiResponseDto apiResponseDto = depositTransferNotesService.saveDepositnote(depositTransferNotesDto);
        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }

}