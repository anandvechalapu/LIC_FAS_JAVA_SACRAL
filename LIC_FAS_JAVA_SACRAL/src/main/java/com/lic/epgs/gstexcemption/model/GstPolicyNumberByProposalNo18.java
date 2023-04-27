package com.lic.epgs.gstexcemption.model;

import com.lic.epgs.gstexcemption.dto.GstPolicyNumberDto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "gst_policy_number")
public class GstPolicyNumberByProposalNo18 implements Serializable {

    @Id
    @Column(name = "policy_number")
    private GstPolicyNumberDto policyNumber;

    @Column(name = "description")
    private String description;

    public GstPolicyNumberByProposalNo18() {
    }

    public GstPolicyNumberDto getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(GstPolicyNumberDto policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}