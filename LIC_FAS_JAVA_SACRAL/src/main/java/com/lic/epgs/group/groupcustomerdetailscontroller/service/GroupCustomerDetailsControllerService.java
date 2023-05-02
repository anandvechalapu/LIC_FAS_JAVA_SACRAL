package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import com.lic.epgs.group.groupcustomerdetailscontroller.dto.CommonResponseDto;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupCustomerDetailsControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupCustomerDetailsControllerService {

    @Autowired
    private GroupCustomerDetailsControllerRepository groupCustomerDetailsControllerRepository;

    public List<CommonResponseDto> getGroupBasicDetails_GROUP_CUSTOMER_DETAILS_CONTROLLER(Long groupId, int pageCount, int limit){
        return groupCustomerDetailsControllerRepository.getGroupBasicDetails_GROUP_CUSTOMER_DETAILS_CONTROLLER(groupId, pageCount, limit);
    }

}