package com.lic.epgs.customer.customermakercontroller.model;

import javax.persistence.*;

@Entity
@Table(name = "customer_maker_controller")
public class CustomerMakerController {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "maker_name")
    private String makerName;

    @Column(name = "maker_notes")
    private String makerNotes;

    @Column(name = "maker_date")
    private String makerDate;

    public CustomerMakerController() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }

    public String getMakerNotes() {
        return makerNotes;
    }

    public void setMakerNotes(String makerNotes) {
        this.makerNotes = makerNotes;
    }

    public String getMakerDate() {
        return makerDate;
    }

    public void setMakerDate(String makerDate) {
        this.makerDate = makerDate;
    }

}