package com.lic.epgs.group.groupcustomerdetailscontroller.service;

import com.lic.epgs.group.groupcustomerdetailscontroller.model.GroupCustomerDetailsController;
import com.lic.epgs.group.groupcustomerdetailscontroller.repository.GroupCustomerDetailsControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GroupCustomerDetailsControllerService {

    @Autowired
    private GroupCustomerDetailsControllerRepository groupCustomerDetailsControllerRepository;

    public List<GroupCustomerDetailsController> getInProgressCommonSearch_GROUP_CUSTOMER_DETAILS_CONTROLLER(String groupName, String groupCode,
                                                                                                        String groupStatus, String workflowStatus, Integer pageCount,
                                                                                                        Integer limit, Date startDate, Date endDate) {
        return groupCustomerDetailsControllerRepository.getInProgressCommonSearch_GROUP_CUSTOMER_DETAILS_CONTROLLER(groupName, groupCode,
                groupStatus, workflowStatus, pageCount, limit, startDate, endDate);
    }
}