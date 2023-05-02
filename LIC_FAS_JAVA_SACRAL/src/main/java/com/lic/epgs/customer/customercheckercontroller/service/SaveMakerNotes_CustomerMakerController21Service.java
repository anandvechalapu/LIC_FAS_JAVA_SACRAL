package com.lic.epgs.customer.customercheckercontroller.service;

import com.lic.epgs.customer.customercheckercontroller.repository.SaveMakerNotes_CustomerMakerController21Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SaveMakerNotes_CustomerMakerController21Service {

    @Autowired
    private SaveMakerNotes_CustomerMakerController21Repository saveMakerNotes_customerMakerController21Repository;

    public Optional<SaveMakerNotes_CustomerMakerController21> getNoteById(Long noteId) {
        return saveMakerNotes_customerMakerController21Repository.findByNoteId(noteId);
    }

}