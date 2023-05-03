package com.lic.epgs.lead.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "common_lead_dto")
public class CommonLeadDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "login_user")
    private String loginUser;

    @Column(name = "transaction_status")
    private String transactionStatus;

    @Column(name = "search_criteria")
    private SearchLeadDto searchCriteria;

    @Column(name = "in_progress_search_validation")
    private boolean inProgressSearchValidation;

    @Column(name = "in_progress_search_maker_validation")
    private boolean inProgressSearchMakerValidation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public SearchLeadDto getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(SearchLeadDto searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public boolean isInProgressSearchValidation() {
        return inProgressSearchValidation;
    }

    public void setInProgressSearchValidation(boolean inProgressSearchValidation) {
        this.inProgressSearchValidation = inProgressSearchValidation;
    }

    public boolean isInProgressSearchMakerValidation() {
        return inProgressSearchMakerValidation;
    }

    public void setInProgressSearchMakerValidation(boolean inProgressSearchMakerValidation) {
        this.inProgressSearchMakerValidation = inProgressSearchMakerValidation;
    }
}