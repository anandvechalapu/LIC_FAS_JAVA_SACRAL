package com.lic.epgs.customer.customercheckercontroller.controller;

import com.lic.epgs.customer.customercheckercontroller.model.SaveMakerNotes_CustomerMakerController21;
import com.lic.epgs.customer.customercheckercontroller.service.SaveMakerNotes_CustomerMakerController21Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/notes")
public class SaveMakerNotes_CustomerMakerController21Controller {

    @Autowired
    private SaveMakerNotes_CustomerMakerController21Service saveMakerNotes_customerMakerController21Service;

    @GetMapping("/{noteId}")
    public Optional<SaveMakerNotes_CustomerMakerController21> getNoteById(@PathVariable Long noteId){
        return saveMakerNotes_customerMakerController21Service.getNoteById(noteId);
    }

    @PostMapping
    public SaveMakerNotes_CustomerMakerController21 saveNote(@RequestBody SaveMakerNotes_CustomerMakerController21 note){
        return saveMakerNotes_customerMakerController21Service.saveNote(note);
    }

}