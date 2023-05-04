package com.lic.epgs.trust.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9")
public class ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String criteria;

    public ExistingTrustOtherCriteriaSearch_TRUSTMANAGEMENTCONTROLLER9() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

}