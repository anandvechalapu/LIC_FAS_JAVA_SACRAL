package com.lic.epgs.trust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.trust.model.TrustNotes;

public interface SaveTrustNotesRepository extends JpaRepository<TrustNotes, Long> {

    TrustNotes findByTrustId(Long trustId);
    TrustNotes saveTrustNotes(TrustNotes trustNotes);
    TrustNotes updateTrustNotes(TrustNotes trustNotes);
    void deleteTrustNotes(TrustNotes trustNotes);

}