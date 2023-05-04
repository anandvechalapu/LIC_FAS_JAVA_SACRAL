package com.lic.epgs.trust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.entity.TrustContactDetails;
import com.lic.epgs.trust.repository.TrustContactDetailsRepository;

@Service
public class TrustContactDetailsService {

    @Autowired
    private TrustContactDetailsRepository trustContactDetailsRepo;

    /**
     * Finds trust contact details by trust ID.
     * 
     * @param trustId The trust ID.
     * @return The trust contact details.
     */
    public TrustContactDetails findByTrustId(Long trustId) {
        return trustContactDetailsRepo.findByTrustId(trustId);
    }

    /**
     * Finds trust contact details by contact person ID.
     * 
     * @param contactPersonId The contact person ID.
     * @return The trust contact details.
     */
    public TrustContactDetails findByContactPersonId(Long contactPersonId) {
        return trustContactDetailsRepo.findByContactPersonId(contactPersonId);
    }

    /**
     * Saves the trust contact details.
     * 
     * @param trustContactDetails The trust contact details.
     * @return The saved trust contact details.
     */
    public TrustContactDetails save(TrustContactDetails trustContactDetails) {
        return trustContactDetailsRepo.save(trustContactDetails);
    }

    /**
     * Updates the trust contact details.
     * 
     * @param trustContactDetails The trust contact details.
     * @return The updated trust contact details.
     */
    public TrustContactDetails update(TrustContactDetails trustContactDetails) {
        return trustContactDetailsRepo.update(trustContactDetails);
    }

    /**
     * Deletes the trust contact details.
     * 
     * @param trustContactDetails The trust contact details.
     */
    public void delete(TrustContactDetails trustContactDetails) {
        trustContactDetailsRepo.delete(trustContactDetails);
    }

}