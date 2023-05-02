package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import com.lic.epgs.group.groupcustomerdetailscontroller.dtos.CommonResponseDto;

public interface RemoveGroupCustomerBankRepository {
    CommonResponseDto removeGroupCustomerBank(String groupCustomerId, String bankAccountId);
}