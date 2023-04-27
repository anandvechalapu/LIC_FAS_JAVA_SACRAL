package com.lic.epgs.deposittransfer.service;

import com.lic.epgs.deposittransfer.dto.ApiResponseDto;
import com.lic.epgs.deposittransfer.dto.DepositTransferNotesDto;
import com.lic.epgs.deposittransfer.repository.DepositTransferNotesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.validation.ConstraintViolationException;
import java.time.LocalDateTime;
import java.util.logging.Level;

@Service
public class DepositTransferNotesService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepositTransferNotesRepository.class);

    @PersistenceContext
    private EntityManager entityManager;

    public ApiResponseDto saveDepositnote(DepositTransferNotesDto depositTransferNotesDto) throws ConstraintViolationException, PersistenceException {
        ApiResponseDto apiResponseDto = new ApiResponseDto();
        try {
            depositTransferNotesDto.setCreatedOn(LocalDateTime.now());
            depositTransferNotesDto.setIsActive(true);
            entityManager.persist(depositTransferNotesDto);
            apiResponseDto.setTransactionStatus("SUCCESS");
            apiResponseDto.setTransactionMessage("Successfully saved deposit transfer note");
            apiResponseDto.setTransferId(depositTransferNotesDto.getTransferId());
        } catch (ConstraintViolationException e) {
            LOGGER.error(e.getMessage(), e);
            apiResponseDto.setTransactionStatus("ERROR");
            apiResponseDto.setTransactionMessage(e.getMessage());
        } catch (PersistenceException e) {
            LOGGER.error(e.getMessage(), e);
            apiResponseDto.setTransactionStatus("ERROR");
            apiResponseDto.setTransactionMessage(e.getMessage());
        }
        return apiResponseDto;
    }
}