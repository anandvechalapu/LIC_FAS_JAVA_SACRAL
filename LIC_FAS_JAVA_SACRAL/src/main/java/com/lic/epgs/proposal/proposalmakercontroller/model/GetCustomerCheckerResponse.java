package com.lic.epgs.proposal.proposalmakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GetCustomerCheckerResponse {

    @Id
    private Long trustId;
    private String trustName;
    private String trustLocation;
    private String trustCountry;
    private String trustEmail;

    public GetCustomerCheckerResponse(){
    }

    public GetCustomerCheckerResponse(Long trustId, String trustName, String trustLocation, String trustCountry, String trustEmail){
        this.trustId = trustId;
        this.trustName = trustName;
        this.trustLocation = trustLocation;
        this.trustCountry = trustCountry;
        this.trustEmail = trustEmail;
    }

    public Long getTrustId() {
        return trustId;
    }

    public void setTrustId(Long trustId) {
        this.trustId = trustId;
    }

    public String getTrustName() {
        return trustName;
    }

    public void setTrustName(String trustName) {
        this.trustName = trustName;
    }

    public String getTrustLocation() {
        return trustLocation;
    }

    public void setTrustLocation(String trustLocation) {
        this.trustLocation = trustLocation;
    }

    public String getTrustCountry() {
        return trustCountry;
    }

    public void setTrustCountry(String trustCountry) {
        this.trustCountry = trustCountry;
    }

    public String getTrustEmail() {
        return trustEmail;
    }

    public void setTrustEmail(String trustEmail) {
        this.trustEmail = trustEmail;
    }

}