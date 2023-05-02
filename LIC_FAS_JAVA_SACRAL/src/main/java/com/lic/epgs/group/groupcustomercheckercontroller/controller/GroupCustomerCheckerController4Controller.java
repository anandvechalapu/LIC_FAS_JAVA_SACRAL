package com.lic.epgs.group.groupcustomercheckercontroller.controller;

import com.lic.epgs.group.groupcustomercheckercontroller.model.SendToCheckerGroupCustomerCheckerController4;
import com.lic.epgs.group.groupcustomercheckercontroller.service.SendToCheckerGroupCustomerCheckerController4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groupcustomercheckercontroller")
public class GroupCustomerCheckerController4Controller {

    @Autowired
    private SendToCheckerGroupCustomerCheckerController4Service sendToCheckerGroupCustomerCheckerController4Service;

    @PostMapping("/save")
    public void save(@RequestBody SendToCheckerGroupCustomerCheckerController4 sendToCheckerGroupCustomerCheckerController4) {
        sendToCheckerGroupCustomerCheckerController4Service.validateAndSave(sendToCheckerGroupCustomerCheckerController4);
    }

    @GetMapping("/findAll")
    public List<SendToCheckerGroupCustomerCheckerController4> findAll() {
        return sendToCheckerGroupCustomerCheckerController4Service.findAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody SendToCheckerGroupCustomerCheckerController4 sendToCheckerGroupCustomerCheckerController4) {
        sendToCheckerGroupCustomerCheckerController4Service.updateAllRelatedTables(sendToCheckerGroupCustomerCheckerController4);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        SendToCheckerGroupCustomerCheckerController4 sendToCheckerGroupCustomerCheckerController4 = sendToCheckerGroupCustomerCheckerController4Service.findById(id);
        sendToCheckerGroupCustomerCheckerController4Service.delete(sendToCheckerGroupCustomerCheckerController4);
    }
}