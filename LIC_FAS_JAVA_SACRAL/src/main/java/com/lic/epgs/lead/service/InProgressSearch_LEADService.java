package com.lic.epgs.lead.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.lead.entity.InProgressSearch_LEAD;
import com.lic.epgs.lead.repository.InProgressSearch_LEADRepository;

@Service
public class InProgressSearch_LEADService {

    @Autowired
    InProgressSearch_LEADRepository inProgressSearch_LEADRepository;

    public InProgressSearch_LEAD findByUnitCodeAndUser(String unitCode, String user) {
        return inProgressSearch_LEADRepository.findByUnitCodeAndUser(unitCode, user);
    }

    public List<InProgressSearch_LEAD> getLeadDataByUnitCodeAndUser(String unitCode, String user) {
        return inProgressSearch_LEADRepository.getLeadDataByUnitCodeAndUser(unitCode, user);
    }

}