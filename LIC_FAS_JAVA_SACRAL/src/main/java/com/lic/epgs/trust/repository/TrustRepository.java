package com.lic.epgs.trust.repository;

import com.lic.epgs.trust.dto.TrustDetailsDto;
import com.lic.epgs.trust.entity.BankAccountDetailsEntity;
import com.lic.epgs.trust.entity.ContactDetailEntity;
import com.lic.epgs.trust.entity.TrustDetailsTempEntity;
import org.springframework.data.repository.CrudRepository;

public interface TrustRepository extends CrudRepository<TrustDetailsTempEntity, Long> {

    /**
     * Retrieves a TrustDetailsTempEntity associated with the trustId from the trustDetailsTempRepository
     *
     * @param trustId trust id
     * @return trust details temp entity
     */
    TrustDetailsTempEntity findByTrustId(String trustId);

    /**
     * Saves the modified TrustDetailsTempEntity in the trustDetailsTempRepository
     *
     * @param trustDetailsTempEntity trust details temp entity
     * @return saved trust details temp entity
     */
    TrustDetailsTempEntity save(TrustDetailsTempEntity trustDetailsTempEntity);

    /**
     * Retrieves all BankAccountDetailsTempEntity objects associated with the trustId from the bankAccountDetailsTempRepository
     *
     * @param trustId trust id
     * @return list of bank account details temp entity
     */
    Iterable<BankAccountDetailsEntity> findAllByTrustId(String trustId);

    /**
     * Saves all modified BankAccountDetailsTempEntity objects in the bankAccountDetailsTempRepository
     *
     * @param bankAccountDetailsTempEntities list of bank account details temp entity
     * @return saved list of bank account details temp entity
     */
    Iterable<BankAccountDetailsEntity> saveAll(Iterable<BankAccountDetailsEntity> bankAccountDetailsTempEntities);

    /**
     * Retrieves all ContactDetailsTempEntity objects associated with the trustId from the contactDetailsTempRepository
     *
     * @param trustId trust id
     * @return list of contact details temp entity
     */
    Iterable<ContactDetailEntity> findAllByTrustId(Long trustId);

    /**
     * Saves all modified ContactDetailsTempEntity objects in the contactDetailsTempRepository
     *
     * @param contactDetailsTempEntities list of contact details temp entity
     * @return saved list of contact details temp entity
     */
    Iterable<ContactDetailEntity> saveAll(Iterable<ContactDetailEntity> contactDetailsTempEntities);

}