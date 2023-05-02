package com.lic.epgs.group.groupcustomercheckercontroller.service;

import com.lic.epgs.group.groupcustomercheckercontroller.entity.SaveNotesDetail;
import com.lic.epgs.group.groupcustomercheckercontroller.repository.SaveNotesDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SaveNotesDetailsService {

    @Autowired
    SaveNotesDetailsRepository saveNotesDetailsRepository;

    public Optional<SaveNotesDetail> getNotesById(Long notesId) {
        return saveNotesDetailsRepository.findByNotesId(notesId);
    }

    public void deleteNotesById(Long notesId) {
        saveNotesDetailsRepository.deleteByNotesId(notesId);
    }

    public void updateNotes(Long notesId, String notes) {
        saveNotesDetailsRepository.updateNotes(notesId, notes);
    }
}