package com.lic.epgs.notifydomain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.notifydomain.model.NotifyDomainModel;
import com.lic.epgs.notifydomain.service.NotifyDomainService;

@RestController
@RequestMapping("/notifyDomain")
public class NotifyDomainController {

	@Autowired
	private NotifyDomainService notifyDomainService;

	@GetMapping("/{demandNo}/{collectionNo}/{refNo}")
	public NotifyDomainModel getNotifyDomain(@PathVariable String demandNo, @PathVariable String collectionNo,
			@PathVariable String refNo) {
		return notifyDomainService.findByDemandNoAndCollectionNoAndRefNo(demandNo, collectionNo, refNo);
	}

}