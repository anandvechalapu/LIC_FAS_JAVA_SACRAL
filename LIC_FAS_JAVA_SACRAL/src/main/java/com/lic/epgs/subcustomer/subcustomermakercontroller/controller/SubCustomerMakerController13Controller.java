package com.lic.epgs.subcustomer.subcustomermakercontroller.controller;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.SubCustomerMakerController13;
import com.lic.epgs.subcustomer.subcustomermakercontroller.service.SaveMakerNotesSubCustomerMakerController13Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subcustomer/makercontroller/save")
public class SubCustomerMakerController13Controller {

    @Autowired
    SaveMakerNotesSubCustomerMakerController13Service saveMakerNotesSubCustomerMakerController13Service;

    @GetMapping
    public ResponseEntity<SubCustomerMakerController13> findBySubCustomerIdAndGCTFlagAndNoteContents(@RequestParam String subCustomerId, @RequestParam String gctFlag, @RequestParam String noteContents) {
        SubCustomerMakerController13 notes = saveMakerNotesSubCustomerMakerController13Service.findBySubCustomerIdAndGCTFlagAndNoteContents(subCustomerId, gctFlag, noteContents);
        return new ResponseEntity<>(notes, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteBySubCustomerIdAndGCTFlagAndNoteContents(@RequestParam String subCustomerId, @RequestParam String gctFlag, @RequestParam String noteContents) {
        saveMakerNotesSubCustomerMakerController13Service.deleteBySubCustomerIdAndGCTFlagAndNoteContents(subCustomerId, gctFlag, noteContents);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Void> updateNoteContentsBySubCustomerIdAndGCTFlag(@RequestParam String subCustomerId, @RequestParam String gctFlag, @RequestParam String noteContents) {
        saveMakerNotesSubCustomerMakerController13Service.updateNoteContentsBySubCustomerIdAndGCTFlag(subCustomerId, gctFlag, noteContents);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> saveNoteContentsBySubCustomerIdAndGCTFlag(@RequestParam String subCustomerId, @RequestParam String gctFlag, @RequestParam String noteContents) {
        saveMakerNotesSubCustomerMakerController13Service.saveNoteContentsBySubCustomerIdAndGCTFlag(subCustomerId, gctFlag, noteContents);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}