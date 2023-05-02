package com.lic.epgs.group.groupcustomercheckercontroller.controller;

import com.lic.epgs.group.groupcustomercheckercontroller.SendToMakerGroupCustomerCheckerController;
import com.lic.epgs.group.groupcustomercheckercontroller.service.SendToMakerGroupCustomerCheckerControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/groupcustomercheckercontroller")
public class SendToMakerGroupCustomerCheckerControllerController {

    @Autowired
    private SendToMakerGroupCustomerCheckerControllerService sendToMakerGroupCustomerCheckerControllerService;

    @GetMapping("/groupStatus/{groupStatus}")
    public List<SendToMakerGroupCustomerCheckerController> findByGroupStatus(@PathVariable("groupStatus") String groupStatus) {
        return sendToMakerGroupCustomerCheckerControllerService.findByGroupStatus(groupStatus);
    }

    @PutMapping("/update")
    public int updateSendToMakerGroupCustomerCheckerController(@RequestParam("activeStatus") String activeStatus,
                                                              @RequestParam("modifiedBy") String modifiedBy,
                                                              @RequestParam("modifiedOn") Date modifiedOn,
                                                              @RequestParam("groupStatus") String groupStatus) {
        return sendToMakerGroupCustomerCheckerControllerService.updateSendToMakerGroupCustomerCheckerController(activeStatus, modifiedBy, modifiedOn, groupStatus);
    }

    @PostMapping("/insert")
    public int insertSendToMakerGroupCustomerCheckerController(@RequestParam("groupStatus") String groupStatus,
                                                              @RequestParam("activeStatus") String activeStatus,
                                                              @RequestParam("modifiedBy") String modifiedBy,
                                                              @RequestParam("modifiedOn") Date modifiedOn) {
        return sendToMakerGroupCustomerCheckerControllerService.insertSendToMakerGroupCustomerCheckerController(groupStatus, activeStatus, modifiedBy, modifiedOn);
    }

}