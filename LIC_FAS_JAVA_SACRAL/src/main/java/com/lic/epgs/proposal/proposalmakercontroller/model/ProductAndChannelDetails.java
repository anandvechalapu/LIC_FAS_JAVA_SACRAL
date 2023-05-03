package com.lic.epgs.proposal.proposalmakercontroller.model;

import java.io.Serializable;

/**
 * Model class for product and channel details associated with a given lead.
 */
public class ProductAndChannelDetails implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    private String product;
    private String channel;
 
    public ProductAndChannelDetails() {
    }
 
    public ProductAndChannelDetails(String product, String channel) {
        this.product = product;
        this.channel = channel;
    }
 
    public String getProduct() {
        return product;
    }
 
    public void setProduct(String product) {
        this.product = product;
    }
 
    public String getChannel() {
        return channel;
    }
 
    public void setChannel(String channel) {
        this.channel = channel;
    }
 
    @Override
    public String toString() {
        return "ProductAndChannelDetails [product=" + product + ", channel=" + channel + "]";
    }
}