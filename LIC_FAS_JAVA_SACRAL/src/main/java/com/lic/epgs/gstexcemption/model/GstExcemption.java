package com.lic.epgs.gstexcemption.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "gst_excemption")
public class GstExcemption {

    private String gstNo;
    private String unitCode;
    private String proposalNo;
    private List<GstExcemptionDto> gstExcemptionDto;

    public String getGstNo() {
        return gstNo;
    }

    public void setGstNo(String gstNo) {
        this.gstNo = gstNo;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getProposalNo() {
        return proposalNo;
    }

    public void setProposalNo(String proposalNo) {
        this.proposalNo = proposalNo;
    }

    public List<GstExcemptionDto> getGstExcemptionDto() {
        return gstExcemptionDto;
    }

    public void setGstExcemptionDto(List<GstExcemptionDto> gstExcemptionDto) {
        this.gstExcemptionDto = gstExcemptionDto;
    }

}