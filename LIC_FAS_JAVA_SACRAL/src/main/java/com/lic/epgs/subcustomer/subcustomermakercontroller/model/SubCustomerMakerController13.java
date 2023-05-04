package com.lic.epgs.subcustomer.subcustomermakercontroller.model;

import javax.persistence.*;

@Entity
@Table(name = "SubCustomerMakerController13")
public class SubCustomerMakerController13 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subCustomerId")
    private String subCustomerId;

    @Column(name = "gctFlag")
    private String gctFlag;

    @Column(name = "noteContents")
    private String noteContents;

    @Column(name = "active")
    private boolean active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubCustomerId() {
        return subCustomerId;
    }

    public void setSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
    }

    public String getGctFlag() {
        return gctFlag;
    }

    public void setGctFlag(String gctFlag) {
        this.gctFlag = gctFlag;
    }

    public String getNoteContents() {
        return noteContents;
    }

    public void setNoteContents(String noteContents) {
        this.noteContents = noteContents;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}