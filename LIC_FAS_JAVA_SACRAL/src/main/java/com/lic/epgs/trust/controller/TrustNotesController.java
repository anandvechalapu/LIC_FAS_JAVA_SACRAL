package com.lic.epgs.trust.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.TrustNotes;
import com.lic.epgs.trust.service.TrustNotesService;

@RestController
@RequestMapping("/api/v1/trustNotes")
public class TrustNotesController {
 
    @Autowired
    private TrustNotesService trustNotesService;
 
    @GetMapping("/{trustId}")
    public ResponseEntity<Optional<TrustNotes>> findByTrustId(@PathVariable("trustId") Long trustId) {
        Optional<TrustNotes> trustNotes = trustNotesService.findByTrustId(trustId);
        if (trustNotes == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(trustNotes, HttpStatus.OK);
    }
 
    @PostMapping("/")
    public ResponseEntity<TrustNotes> saveTrustNotes(@RequestBody TrustNotes trustNotes) {
        try {
            TrustNotes savedTrustNotes = trustNotesService.saveTrustNotes(trustNotes);
            return new ResponseEntity<>(savedTrustNotes, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
 
    @PutMapping("/")
    public ResponseEntity<TrustNotes> updateTrustNotes(@RequestBody TrustNotes trustNotes) {
        try {
            TrustNotes updatedTrustNotes = trustNotesService.updateTrustNotes(trustNotes);
            return new ResponseEntity<>(updatedTrustNotes, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
 
    @DeleteMapping("/")
    public ResponseEntity<Void> deleteTrustNotes(@RequestBody TrustNotes trustNotes) {
        try {
            trustNotesService.deleteTrustNotes(trustNotes);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}