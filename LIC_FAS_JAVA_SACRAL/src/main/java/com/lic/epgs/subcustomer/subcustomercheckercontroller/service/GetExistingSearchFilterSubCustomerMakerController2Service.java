package com.lic.epgs.subcustomer.subcustomercheckercontroller.service;

import com.lic.epgs.subcustomer.subcustomercheckercontroller.model.SubCustomer;
import com.lic.epgs.subcustomer.subcustomercheckercontroller.repository.GetExistingSearchFilterSubCustomerMakerController2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class GetExistingSearchFilterSubCustomerMakerController2Service {

    @Autowired
    private GetExistingSearchFilterSubCustomerMakerController2Repository getExistingSearchFilterSubCustomerMakerController2Repository;

    public List<SubCustomer> findByCustomerCode(String customerCode) {
        return getExistingSearchFilterSubCustomerMakerController2Repository.findByCustomerCode(customerCode);
    }

    public List<SubCustomer> findByCustomerName(String customerName) {
        return getExistingSearchFilterSubCustomerMakerController2Repository.findByCustomerName(customerName);
    }

    public List<SubCustomer> findByCustomerType(String customerType) {
        return getExistingSearchFilterSubCustomerMakerController2Repository.findByCustomerType(customerType);
    }

    public List<SubCustomer> findByPan(String pan) {
        return getExistingSearchFilterSubCustomerMakerController2Repository.findByPan(pan);
    }

    public List<SubCustomer> findByStartDate(Date startDate) {
        return getExistingSearchFilterSubCustomerMakerController2Repository.findByStartDate(startDate);
    }

    public List<SubCustomer> findByEndDate(Date endDate) {
        return getExistingSearchFilterSubCustomerMakerController2Repository.findByEndDate(endDate);
    }

    public List<SubCustomer> findByRoleType(String roleType) {
        return getExistingSearchFilterSubCustomerMakerController2Repository.findByRoleType(roleType);
    }

    public List<SubCustomer> findByUnitCode(String unitCode) {
        return getExistingSearchFilterSubCustomerMakerController2Repository.findByUnitCode(unitCode);
    }

    public List<SubCustomer> findBySubCustomerStatus(String subCustomerStatus) {
        return getExistingSearchFilterSubCustomerMakerController2Repository.findBySubCustomerStatus(subCustomerStatus);
    }

    public List<SubCustomer> findAllOrderedByCustomerCode() {
        return getExistingSearchFilterSubCustomerMakerController2Repository.findAllOrderedByCustomerCode();
    }

    public List<SubCustomer> findByMultipleFields(String customerCode,
                                                 String customerName,
                                                 String customerType,
                                                 String pan,
                                                 Date startDate,
                                                 Date endDate,
                                                 String roleType,
                                                 String unitCode,
                                                 String subCustomerStatus) {
        return getExistingSearchFilterSubCustomerMakerController2Repository.findByMultipleFields(customerCode,
                customerName,
                customerType,
                pan,
                startDate,
                endDate,
                roleType,
                unitCode,
                subCustomerStatus);
    }

}