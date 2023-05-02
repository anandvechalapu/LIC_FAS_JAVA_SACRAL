package com.lic.epgs.group.groupcustomerdetailscontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupBankAccountDetails;

public interface GroupBankAccountDetailsRepository extends JpaRepository<GroupBankAccountDetails, Long> {

    GroupBankAccountDetails findByGroupCustomerId(long groupCustomerId);

    void save(GroupBankAccountDetails groupBankAccountDetails);

    void delete(GroupBankAccountDetails groupBankAccountDetails);

    void deleteByGroupCustomerId(long groupCustomerId);

}