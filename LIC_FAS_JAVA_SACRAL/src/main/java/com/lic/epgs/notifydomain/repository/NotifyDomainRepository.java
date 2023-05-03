package com.lic.epgs.notifydomain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.notifydomain.entity.NotifyDomainEntity;

@Repository
public interface NotifyDomainRepository extends JpaRepository<NotifyDomainEntity, Long> {

	NotifyDomainEntity findByDemandNoAndCollectionNoAndRefNo(String demandNo, String collectionNo, String refNo);

}