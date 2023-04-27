package com.lic.epgs.deposittransfer.controller;

import com.lic.epgs.deposittransfer.model.ExistingDepositNotes;
import com.lic.epgs.deposittransfer.service.ExistingDepositNotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/deposittransfer")
public class ExistingDepositNotesController {

    @Autowired
    private ExistingDepositNotesService existingDepositNotesService;

    @GetMapping("/existingdepositnotes")
    public List<ExistingDepositNotes> getExistingDepositNotes_DepositTransfer(@RequestParam("transferId") String transferId) {
        return existingDepositNotesService.getExistingDepositNotes_DepositTransfer(transferId);
    }
}