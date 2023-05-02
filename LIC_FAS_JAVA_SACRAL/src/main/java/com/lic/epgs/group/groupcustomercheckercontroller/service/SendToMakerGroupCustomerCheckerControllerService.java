package com.lic.epgs.group.groupcustomercheckercontroller.service;

import com.lic.epgs.group.groupcustomercheckercontroller.SendToMakerGroupCustomerCheckerController;
import com.lic.epgs.group.groupcustomercheckercontroller.repository.SendToMakerGroupCustomerCheckerControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SendToMakerGroupCustomerCheckerControllerService {

    @Autowired
    private SendToMakerGroupCustomerCheckerControllerRepository sendToMakerGroupCustomerCheckerControllerRepository;

    public List<SendToMakerGroupCustomerCheckerController> findByGroupStatus(String groupStatus) {
        return sendToMakerGroupCustomerCheckerControllerRepository.findByGroupStatus(groupStatus);
    }

    public int updateSendToMakerGroupCustomerCheckerController(String activeStatus, String modifiedBy, Date modifiedOn, String groupStatus) {
        return sendToMakerGroupCustomerCheckerControllerRepository.updateSendToMakerGroupCustomerCheckerController(activeStatus, modifiedBy, modifiedOn, groupStatus);
    }

    public int insertSendToMakerGroupCustomerCheckerController(String groupStatus, String activeStatus, String modifiedBy, Date modifiedOn) {
        return sendToMakerGroupCustomerCheckerControllerRepository.insertSendToMakerGroupCustomerCheckerController(groupStatus, activeStatus, modifiedBy, modifiedOn);
    }

}