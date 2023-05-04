@Repository
package com.lic.epgs.trust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.trust.model.TrustDocumentDetails;

@Repository
public interface TrustDocumentDetailsRepository extends JpaRepository<TrustDocumentDetails, Long> {
  List<TrustDocumentDetails> findByTrustId(Long trustId);
}