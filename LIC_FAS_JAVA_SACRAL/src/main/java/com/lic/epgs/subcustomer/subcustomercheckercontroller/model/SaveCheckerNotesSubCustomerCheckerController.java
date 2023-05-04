package com.lic.epgs.subcustomer.subcustomercheckercontroller.model;

import javax.persistence.*;

@Entity
@Table(name = "save_checker_notes_sub_customer_checker_controller")
public class SaveCheckerNotesSubCustomerCheckerController {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sub_customer")
    private String subCustomer;

    @Column(name = "notes")
    private String notes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubCustomer() {
        return subCustomer;
    }

    public void setSubCustomer(String subCustomer) {
        this.subCustomer = subCustomer;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}