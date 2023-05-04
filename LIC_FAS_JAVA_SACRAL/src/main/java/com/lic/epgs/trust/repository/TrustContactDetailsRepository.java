package com.lic.epgs.trust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.trust.entity.TrustContactDetails;

@Repository
public interface TrustContactDetailsRepository extends JpaRepository<TrustContactDetails, Long> {

    /**
     * Finds trust contact details by trust ID.
     * 
     * @param trustId The trust ID.
     * @return The trust contact details.
     */
    TrustContactDetails findByTrustId(Long trustId);

    /**
     * Finds trust contact details by contact person ID.
     * 
     * @param contactPersonId The contact person ID.
     * @return The trust contact details.
     */
    TrustContactDetails findByContactPersonId(Long contactPersonId);

    /**
     * Saves the trust contact details.
     * 
     * @param trustContactDetails The trust contact details.
     * @return The saved trust contact details.
     */
    TrustContactDetails save(TrustContactDetails trustContactDetails);

    /**
     * Updates the trust contact details.
     * 
     * @param trustContactDetails The trust contact details.
     * @return The updated trust contact details.
     */
    TrustContactDetails update(TrustContactDetails trustContactDetails);

    /**
     * Deletes the trust contact details.
     * 
     * @param trustContactDetails The trust contact details.
     */
    void delete(TrustContactDetails trustContactDetails);

}