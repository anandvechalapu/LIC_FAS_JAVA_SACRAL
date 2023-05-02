package com.lic.epgs.group.groupcustomercheckercontroller.controller;

import com.lic.epgs.group.groupcustomercheckercontroller.entity.SaveNotesDetail;
import com.lic.epgs.group.groupcustomercheckercontroller.service.SaveNotesDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/notes")
public class SaveNotesDetailsController {

    @Autowired
    private SaveNotesDetailsService saveNotesDetailsService;

    @GetMapping("/{id}")
    public Optional<SaveNotesDetail> getNotesById(@PathVariable Long id) {
        return saveNotesDetailsService.getNotesById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteNotesById(@PathVariable Long id) {
        saveNotesDetailsService.deleteNotesById(id);
    }

    @PutMapping("/{id}")
    public void updateNotes(@PathVariable Long id, @RequestBody String notes) {
        saveNotesDetailsService.updateNotes(id, notes);
    }

}