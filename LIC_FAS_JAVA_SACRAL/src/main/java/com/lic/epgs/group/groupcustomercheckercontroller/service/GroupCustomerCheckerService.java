package com.lic.epgs.group.groupcustomercheckercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.group.groupcustomercheckercontroller.dto.GroupCustomerBasicDetailsDto;
import com.lic.epgs.group.groupcustomercheckercontroller.entity.AddressDetailsEntity;
import com.lic.epgs.group.groupcustomercheckercontroller.entity.GroupCustomerBasicDetailsEntity;
import com.lic.epgs.group.groupcustomercheckercontroller.entity.GroupCustomerBasicDetailsTempEntity;
import com.lic.epgs.group.groupcustomercheckercontroller.repository.GroupCustomerCheckerRepository;

@Service
public class GroupCustomerCheckerService {
	
	@Autowired
	private GroupCustomerCheckerRepository groupCustomerCheckerRepository;
	
	public GroupCustomerBasicDetailsTempEntity findByGroupCustomerIdAndIsActiveTrue(String groupCustomerId) {
		return groupCustomerCheckerRepository.findByGroupCustomerIdAndIsActiveTrue(groupCustomerId);
	}
	
	public AddressDetailsEntity findByGroupCustomerIdAndIsActiveTrue(String newEntityGroupCustomerId) {
		return groupCustomerCheckerRepository.findByGroupCustomerIdAndIsActiveTrue(newEntityGroupCustomerId);
	}
	
	public GroupCustomerBasicDetailsEntity save(GroupCustomerBasicDetailsEntity groupCustomerBasicDetailsEntity) {
		return groupCustomerCheckerRepository.save(groupCustomerBasicDetailsEntity);
	}
	
	public GroupCustomerBasicDetailsDto getGroupCustomerDetails(String groupCustomerId){
		Optional<GroupCustomerBasicDetailsEntity> groupCustomerBasicDetailsEntity = groupCustomerCheckerRepository.findById(groupCustomerId);
		
		GroupCustomerBasicDetailsDto groupCustomerBasicDetailsDto = new GroupCustomerBasicDetailsDto();
		if(groupCustomerBasicDetailsEntity.isPresent()){
			groupCustomerBasicDetailsDto.setGroupCustomerId(groupCustomerBasicDetailsEntity.get().getGroupCustomerId());
			groupCustomerBasicDetailsDto.setGroupCustomerName(groupCustomerBasicDetailsEntity.get().getGroupCustomerName());
			groupCustomerBasicDetailsDto.setGroupCustomerType(groupCustomerBasicDetailsEntity.get().getGroupCustomerType());
			groupCustomerBasicDetailsDto.setGroupCustomerDescription(groupCustomerBasicDetailsEntity.get().getGroupCustomerDescription());
			groupCustomerBasicDetailsDto.setGroupCustomerStatus(groupCustomerBasicDetailsEntity.get().getGroupCustomerStatus());
			groupCustomerBasicDetailsDto.setIsActive(groupCustomerBasicDetailsEntity.get().getIsActive());
			groupCustomerBasicDetailsDto.setIsPrimaryContact(groupCustomerBasicDetailsEntity.get().getIsPrimaryContact());
		}
		return groupCustomerBasicDetailsDto;
	}	
}