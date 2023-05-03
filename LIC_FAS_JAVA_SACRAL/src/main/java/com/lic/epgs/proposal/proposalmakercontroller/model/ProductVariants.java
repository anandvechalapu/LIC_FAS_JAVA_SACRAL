package com.lic.epgs.proposal.proposalmakercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LineOfBusinessList")
public class ProductVariants {

    private Integer lineOfBusinessId;

    public Integer getLineOfBusinessId() {
        return lineOfBusinessId;
    }

    public void setLineOfBusinessId(Integer lineOfBusinessId) {
        this.lineOfBusinessId = lineOfBusinessId;
    }
}