environment

package com.lic.epgs.trust.repository;

import com.lic.epgs.trust.entity.BankAccountDetailsEntity;
import com.lic.epgs.trust.entity.BankAccountDetailsTempEntity;
import com.lic.epgs.trust.entity.ContactDetailsTempEntity;
import com.lic.epgs.trust.dto.TrustDetailsDto;
import com.lic.epgs.trust.entity.TrustDetailsTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrustRepository extends JpaRepository<TrustDetailsTempEntity, Long> {

    TrustDetailsTempEntity findByTrustId(Long trustId);

    List<BankAccountDetailsTempEntity> findByTrustIdAndIsActive(Long trustId, Boolean isActive);

    BankAccountDetailsEntity save(BankAccountDetailsEntity bankAccountDetailsEntity);

    List<ContactDetailsTempEntity> findContactDetailsTempEntityByTrustIdAndIsActive(Long trustId, Boolean isActive);

    TrustDetailsTempEntity save(TrustDetailsTempEntity trustDetailsTempEntity);

    TrustDetailsTempEntity saveTrustDetails(TrustDetailsDto trustDetailsDto, String role);

}