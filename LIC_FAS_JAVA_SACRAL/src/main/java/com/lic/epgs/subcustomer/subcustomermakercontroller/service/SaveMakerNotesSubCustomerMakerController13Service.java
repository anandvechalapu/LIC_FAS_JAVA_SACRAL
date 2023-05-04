package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerMakerController13;
import com.lic.epgs.subcustomer.subcustomermakercontroller.repository.SaveMakerNotesSubCustomerMakerController13Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SaveMakerNotesSubCustomerMakerController13Service {

    private SaveMakerNotesSubCustomerMakerController13Repository saveMakerNotesSubCustomerMakerController13Repository;

    public SaveMakerNotesSubCustomerMakerController13Service(SaveMakerNotesSubCustomerMakerController13Repository saveMakerNotesSubCustomerMakerController13Repository) {
        this.saveMakerNotesSubCustomerMakerController13Repository = saveMakerNotesSubCustomerMakerController13Repository;
    }

    public SubCustomerMakerController13 findBySubCustomerIdAndGCTFlagAndNoteContents(String subCustomerId, String gctFlag, String noteContents) {
        return saveMakerNotesSubCustomerMakerController13Repository.findBySubCustomerIdAndGCTFlagAndNoteContents(subCustomerId, gctFlag, noteContents);
    }

    public void deleteBySubCustomerIdAndGCTFlagAndNoteContents(String subCustomerId, String gctFlag, String noteContents) {
        saveMakerNotesSubCustomerMakerController13Repository.deleteBySubCustomerIdAndGCTFlagAndNoteContents(subCustomerId, gctFlag, noteContents);
    }

    public void updateNoteContentsBySubCustomerIdAndGCTFlag(String subCustomerId, String gctFlag, String noteContents) {
        saveMakerNotesSubCustomerMakerController13Repository.updateNoteContentsBySubCustomerIdAndGCTFlag(subCustomerId, gctFlag, noteContents);
    }

    public void saveNoteContentsBySubCustomerIdAndGCTFlag(String subCustomerId, String gctFlag, String noteContents) {
        saveMakerNotesSubCustomerMakerController13Repository.saveNoteContentsBySubCustomerIdAndGCTFlag(subCustomerId, gctFlag, noteContents);
    }

}