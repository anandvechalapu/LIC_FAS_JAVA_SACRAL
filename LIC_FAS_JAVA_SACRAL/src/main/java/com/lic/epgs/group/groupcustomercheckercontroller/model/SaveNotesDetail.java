package com.lic.epgs.group.groupcustomercheckercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SaveNotesDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notesId;
    private String notes;

    public Long getNotesId() {
        return notesId;
    }

    public void setNotesId(Long notesId) {
        this.notesId = notesId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}