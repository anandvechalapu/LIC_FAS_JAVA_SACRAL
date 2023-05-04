package com.lic.epgs.trust.model;

import lombok.Data;

@Data
public class TrustDetails {

    private String trustId;
    private TrustDetailsDto trustDetails;
    private Iterable<BankAccountDetailsEntity> bankAccountDetails;
    private Iterable<ContactDetailEntity> contactDetails;

}