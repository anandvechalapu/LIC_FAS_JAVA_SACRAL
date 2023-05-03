package com.lic.epgs.notifydomain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.notifydomain.entity.NotifyDomainEntity;
import com.lic.epgs.notifydomain.repository.NotifyDomainRepository;

@Service
public class NotifyDomainService {

	@Autowired
	private NotifyDomainRepository notifyDomainRepository;

	public NotifyDomainEntity findByDemandNoAndCollectionNoAndRefNo(String demandNo, String collectionNo,
			String refNo) {
		return notifyDomainRepository.findByDemandNoAndCollectionNoAndRefNo(demandNo, collectionNo, refNo);
	}

}