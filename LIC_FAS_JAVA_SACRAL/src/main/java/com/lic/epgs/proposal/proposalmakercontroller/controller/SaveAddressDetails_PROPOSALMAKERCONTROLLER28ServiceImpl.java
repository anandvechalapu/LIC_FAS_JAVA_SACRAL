@Service
public class SaveAddressDetails_PROPOSALMAKERCONTROLLER28ServiceImpl implements SaveAddressDetails_PROPOSALMAKERCONTROLLER28Service {

    private final SaveAddressDetails_PROPOSALMAKERCONTROLLER28Repository saveAddressDetails_PROPOSALMAKERCONTROLLER28Repository;

    public SaveAddressDetails_PROPOSALMAKERCONTROLLER28ServiceImpl(SaveAddressDetails_PROPOSALMAKERCONTROLLER28Repository saveAddressDetails_PROPOSALMAKERCONTROLLER28Repository) {
        this.saveAddressDetails_PROPOSALMAKERCONTROLLER28Repository = saveAddressDetails_PROPOSALMAKERCONTROLLER28Repository;
    }

    @Override
    public MPHAddressDetailsTempEntity findByAddressDetailsDto(MPHAddressDetailsDto addressDetailsDto) {
        return saveAddressDetails_PROPOSALMAKERCONTROLLER28Repository.findByAddressDetailsDto(addressDetailsDto);
    }

    @Override
    public int updateStatusAndMessageByAddressDetailsDto(String status, String message, MPHAddressDetailsDto addressDetailsDto) {
        return saveAddressDetails_PROPOSALMAKERCONTROLLER28Repository.updateStatusAndMessageByAddressDetailsDto(status, message, addressDetailsDto);
    }

    @Override
    public int deleteByAddressDetailsDto(MPHAddressDetailsDto addressDetailsDto) {
        return saveAddressDetails_PROPOSALMAKERCONTROLLER28Repository.deleteByAddressDetailsDto(addressDetailsDto);
    }

}

package com.lic.epgs.proposal.proposalmakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.MPHAddressDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.model.MPHAddressDetailsTempEntity;
import com.lic.epgs.proposal.proposalmakercontroller.service.SaveAddressDetails_PROPOSALMAKERCONTROLLER28Service;

@RestController
public class SaveAddressDetails_PROPOSALMAKERCONTROLLER28Controller {
	
	@Autowired
	private SaveAddressDetails_PROPOSALMAKERCONTROLLER28Service saveAddressDetails_PROPOSALMAKERCONTROLLER28Service;
	
	@PostMapping("/saveAddressDetails_PROPOSALMAKERCONTROLLER28")
	public MPHAddressDetailsTempEntity saveAddressDetails_PROPOSALMAKERCONTROLLER28(@RequestBody MPHAddressDetailsDto addressDetailsDto) {
		return saveAddressDetails_PROPOSALMAKERCONTROLLER28Service.findByAddressDetailsDto(addressDetailsDto);
	}

}