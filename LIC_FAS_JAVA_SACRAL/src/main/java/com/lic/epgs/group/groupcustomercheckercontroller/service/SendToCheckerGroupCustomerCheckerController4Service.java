package com.lic.epgs.group.groupcustomercheckercontroller.service;

import com.lic.epgs.group.groupcustomercheckercontroller.model.SendToCheckerGroupCustomerCheckerController4;
import com.lic.epgs.group.groupcustomercheckercontroller.repository.SendToCheckerGroupCustomerCheckerController4Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SendToCheckerGroupCustomerCheckerController4Service {

    @Autowired
    private SendToCheckerGroupCustomerCheckerController4Repository sendToCheckerGroupCustomerCheckerController4Repository;

    public void save(SendToCheckerGroupCustomerCheckerController4 sendToCheckerGroupCustomerCheckerController4) {
        sendToCheckerGroupCustomerCheckerController4Repository.save(sendToCheckerGroupCustomerCheckerController4);
    }

    public void delete(SendToCheckerGroupCustomerCheckerController4 sendToCheckerGroupCustomerCheckerController4) {
        sendToCheckerGroupCustomerCheckerController4Repository.delete(sendToCheckerGroupCustomerCheckerController4);
    }

    public void validateAndSave(SendToCheckerGroupCustomerCheckerController4 sendToCheckerGroupCustomerCheckerController4) {
        // Perform validation on sendToCheckerGroupCustomerCheckerController4
        // object
        if (sendToCheckerGroupCustomerCheckerController4.validate()) {
            sendToCheckerGroupCustomerCheckerController4Repository.save(sendToCheckerGroupCustomerCheckerController4);
        }
    }

    public void updateAllRelatedTables(SendToCheckerGroupCustomerCheckerController4 sendToCheckerGroupCustomerCheckerController4) {
        // Update all related tables
        List<SendToCheckerGroupCustomerCheckerController4> relatedTables = sendToCheckerGroupCustomerCheckerController4Repository.findAll();
        for (SendToCheckerGroupCustomerCheckerController4 table : relatedTables) {
            table.update(sendToCheckerGroupCustomerCheckerController4);
            sendToCheckerGroupCustomerCheckerController4Repository.save(table);
        }
    }
}