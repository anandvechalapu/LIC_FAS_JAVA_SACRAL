package com.lic.epgs.gstexcemption.service;

import com.lic.epgs.gstexcemption.model.IssuedBy22GstExcemption;
import com.lic.epgs.gstexcemption.repository.IssuedBy22GstExcemptionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IssuedBy22GstExcemptionService {

    @Autowired
    private IssuedBy22GstExcemptionRepository issuedBy22GstExcemptionRepository;

    public List<IssuedBy22GstExcemption> findAll() {
        return issuedBy22GstExcemptionRepository.findAll();
    }

    public Optional<IssuedBy22GstExcemption> findById(Long id) {
        return issuedBy22GstExcemptionRepository.findById(id);
    }

    public List<IssuedBy22GstExcemption> findByName(String name) {
        return issuedBy22GstExcemptionRepository.findByName(name);
    }

    public List<IssuedBy22GstExcemption> findByDescription(String description) {
        return issuedBy22GstExcemptionRepository.findByDescription(description);
    }

    public List<IssuedBy22GstExcemption> findByIssuer(String issuer) {
        return issuedBy22GstExcemptionRepository.findByIssuer(issuer);
    }

    public void save(IssuedBy22GstExcemption gstExcemption) {
        issuedBy22GstExcemptionRepository.save(gstExcemption);
    }
}