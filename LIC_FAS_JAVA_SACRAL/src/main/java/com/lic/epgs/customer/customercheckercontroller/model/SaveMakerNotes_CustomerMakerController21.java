package com.lic.epgs.customer.customercheckercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SaveMakerNotes_CustomerMakerController21 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noteId;
    private String noteText;

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }
}