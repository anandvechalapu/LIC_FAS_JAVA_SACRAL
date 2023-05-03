package com.lic.epgs.lead.model;

import java.util.List;

public class ViewLeadLead23 {
    
    private CommonLeadDto leadBasicDetails;
    private List<ProductDetailsDto> productDetails;
    private List<ChannelDetailsDto> channelDetails;
    private List<ActivityDetailsDto> activityDetails;
    private String rejectionRemarks;

    public CommonLeadDto getLeadBasicDetails() {
        return leadBasicDetails;
    }

    public void setLeadBasicDetails(CommonLeadDto leadBasicDetails) {
        this.leadBasicDetails = leadBasicDetails;
    }

    public List<ProductDetailsDto> getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(List<ProductDetailsDto> productDetails) {
        this.productDetails = productDetails;
    }

    public List<ChannelDetailsDto> getChannelDetails() {
        return channelDetails;
    }

    public void setChannelDetails(List<ChannelDetailsDto> channelDetails) {
        this.channelDetails = channelDetails;
    }

    public List<ActivityDetailsDto> getActivityDetails() {
        return activityDetails;
    }

    public void setActivityDetails(List<ActivityDetailsDto> activityDetails) {
        this.activityDetails = activityDetails;
    }

    public String getRejectionRemarks() {
        return rejectionRemarks;
    }

    public void setRejectionRemarks(String rejectionRemarks) {
        this.rejectionRemarks = rejectionRemarks;
    }
    
}