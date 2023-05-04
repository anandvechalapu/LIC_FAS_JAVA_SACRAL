package com.lic.epgs.trust.service;

import com.lic.epgs.trust.dto.TrustDetailsDto;
import com.lic.epgs.trust.entity.BankAccountDetailsEntity;
import com.lic.epgs.trust.entity.ContactDetailEntity;
import com.lic.epgs.trust.entity.TrustDetailsTempEntity;
import com.lic.epgs.trust.repository.TrustRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrustService {

    @Autowired
    private TrustRepository trustRepository;

    /**
     * Retrieves a TrustDetailsTempEntity associated with the trustId from the trustDetailsTempRepository
     *
     * @param trustId trust id
     * @return trust details temp entity
     */
    public TrustDetailsTempEntity getTrustDetailsTemp(String trustId) {
        return trustRepository.findByTrustId(trustId);
    }

    /**
     * Saves the modified TrustDetailsTempEntity in the trustDetailsTempRepository
     *
     * @param trustDetailsTempEntity trust details temp entity
     * @return saved trust details temp entity
     */
    public TrustDetailsTempEntity saveTrustDetailsTemp(TrustDetailsTempEntity trustDetailsTempEntity) {
        return trustRepository.save(trustDetailsTempEntity);
    }

    /**
     * Retrieves all BankAccountDetailsTempEntity objects associated with the trustId from the bankAccountDetailsTempRepository
     *
     * @param trustId trust id
     * @return list of bank account details temp entity
     */
    public Iterable<BankAccountDetailsEntity> getBankAccountDetailsTemp(String trustId) {
        return trustRepository.findAllByTrustId(trustId);
    }

    /**
     * Saves all modified BankAccountDetailsTempEntity objects in the bankAccountDetailsTempRepository
     *
     * @param bankAccountDetailsTempEntities list of bank account details temp entity
     * @return saved list of bank account details temp entity
     */
    public Iterable<BankAccountDetailsEntity> saveBankAccountDetailsTemp(Iterable<BankAccountDetailsEntity> bankAccountDetailsTempEntities) {
        return trustRepository.saveAll(bankAccountDetailsTempEntities);
    }

    /**
     * Retrieves all ContactDetailsTempEntity objects associated with the trustId from the contactDetailsTempRepository
     *
     * @param trustId trust id
     * @return list of contact details temp entity
     */
    public Iterable<ContactDetailEntity> getContactDetailsTemp(Long trustId) {
        return trustRepository.findAllByTrustId(trustId);
    }

    /**
     * Saves all modified ContactDetailsTempEntity objects in the contactDetailsTempRepository
     *
     * @param contactDetailsTempEntities list of contact details temp entity
     * @return saved list of contact details temp entity
     */
    public Iterable<ContactDetailEntity> saveContactDetailsTemp(Iterable<ContactDetailEntity> contactDetailsTempEntities) {
        return trustRepository.saveAll(contactDetailsTempEntities);
    }

}