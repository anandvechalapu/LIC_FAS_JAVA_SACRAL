package com.lic.epgs.stampduty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.lic.epgs.stampduty.entity.StampDuty;
import com.lic.epgs.stampduty.repository.StampDutyRepository;

@Service
public class StampDutyService {

	@Autowired
	private StampDutyRepository stampDutyRepository;

	public StampDuty findByChallanGrnNo(String challanGrnNo) {
		return stampDutyRepository.findByChallanGrnNo(challanGrnNo);
	}

	public StampDuty findByChallanGrnDate(String challanGrnDate) {
		return stampDutyRepository.findByChallanGrnDate(challanGrnDate);
	}

	public StampDuty findByModifiedDateBetween(String fromDate, String toDate) {
		return stampDutyRepository.findByModifiedDateBetween(fromDate, toDate);
	}

	public StampDuty findByRoleTypeMaker(String roleType) {
		return stampDutyRepository.findByRoleTypeMaker(roleType);
	}

	public StampDuty findByRoleTypeChecker(String roleType) {
		return stampDutyRepository.findByRoleTypeChecker(roleType);
	}

	public StampDuty findByStampDutyStatus(String stampDutyStatus) {
		return stampDutyRepository.findByStampDutyStatus(stampDutyStatus);
	}

	public StampDuty findByUnitOfficeCode(String unitOfficeCode) {
		return stampDutyRepository.findByUnitOfficeCode(unitOfficeCode);
	}

	public List<StampDuty> findByModifiedDateBetweenWithPagination(String fromDate, String toDate, Integer pageCount,
			Integer limit) {
		Pageable pageable = PageRequest.of(pageCount, limit, Sort.by("modifiedDate").descending());
		Page<StampDuty> page = stampDutyRepository.findByModifiedDateBetweenWithPagination(fromDate, toDate, pageable);
		return page.getContent();
	}
}