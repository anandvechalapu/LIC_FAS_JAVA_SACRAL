package com.lic.epgs.commission.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="commissions")
public class Commission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commissionDetailsId;

    private String commissionId;
    private String commissionName;
    private String commissionNotes;
    private int commissionQuestions;
    
    public Long getCommissionDetailsId() {
        return commissionDetailsId;
    }

    public void setCommissionDetailsId(Long commissionDetailsId) {
        this.commissionDetailsId = commissionDetailsId;
    }

    public String getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(String commissionId) {
        this.commissionId = commissionId;
    }

    public String getCommissionName() {
        return commissionName;
    }

    public void setCommissionName(String commissionName) {
        this.commissionName = commissionName;
    }

    public String getCommissionNotes() {
        return commissionNotes;
    }

    public void setCommissionNotes(String commissionNotes) {
        this.commissionNotes = commissionNotes;
    }

    public int getCommissionQuestions() {
        return commissionQuestions;
    }

    public void setCommissionQuestions(int commissionQuestions) {
        this.commissionQuestions = commissionQuestions;
    }

}