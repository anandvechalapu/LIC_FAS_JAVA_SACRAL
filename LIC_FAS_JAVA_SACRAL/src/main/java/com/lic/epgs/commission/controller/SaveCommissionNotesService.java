@Service
public class SaveCommissionNotesService {

    @Autowired
    private SaveCommissionNotesRepository saveCommissionNotesRepository;

    public void saveCommissionNotes(CommissionNotes commissionNotes) {
        saveCommissionNotesRepository.save(commissionNotes);
    }

}

package com.lic.epgs.commission.controller;

import com.lic.epgs.commission.model.CommissionNotes;
import com.lic.epgs.commission.service.LoadCommissionNotesService;
import com.lic.epgs.commission.service.SaveCommissionNotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commission/notes")
public class CommissionController {

    @Autowired
    private LoadCommissionNotesService loadCommissionNotesService;

    @Autowired
    private SaveCommissionNotesService saveCommissionNotesService;

    @GetMapping("/{commissionId}")
    public List<CommissionNotes> getCommissionNotesByCommissionId(@PathVariable Integer commissionId) {
        return loadCommissionNotesService.getCommissionNotesByCommissionId(commissionId);
    }

    @PostMapping
    public void saveCommissionNotes(@RequestBody CommissionNotes commissionNotes) {
        saveCommissionNotesService.saveCommissionNotes(commissionNotes);
    }

}