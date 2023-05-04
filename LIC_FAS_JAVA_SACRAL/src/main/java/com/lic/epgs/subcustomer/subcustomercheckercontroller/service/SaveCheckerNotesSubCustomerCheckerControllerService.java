package com.lic.epgs.subcustomer.subcustomercheckercontroller.service;

import com.lic.epgs.subcustomer.subcustomercheckercontroller.repository.SaveCheckerNotesSubCustomerCheckerControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SaveCheckerNotesSubCustomerCheckerControllerService {

    @Autowired
    private SaveCheckerNotesSubCustomerCheckerControllerRepository saveCheckerNotesSubCustomerCheckerControllerRepository;

    public SaveCheckerNotesSubCustomerCheckerController findBySubCustomer(String subCustomer) {
        return saveCheckerNotesSubCustomerCheckerControllerRepository.findBySubCustomer(subCustomer);
    }

    public void deleteBySubCustomer(String subCustomer) {
        saveCheckerNotesSubCustomerCheckerControllerRepository.deleteBySubCustomer(subCustomer);
    }

    public SaveCheckerNotesSubCustomerCheckerController save(SaveCheckerNotesSubCustomerCheckerController saveCheckerNotesSubCustomerCheckerController) {
        return saveCheckerNotesSubCustomerCheckerControllerRepository.save(saveCheckerNotesSubCustomerCheckerController);
    }

}