package com.lic.epgs.subcustomer.subcustomermakercontroller.service;

import com.lic.epgs.subcustomer.subcustomermakercontroller.model.CustomerUnitOfficeTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface SaveUnitDetails_SUBCUSTOMERMAKERCONTROLLER18Service {
    CustomerUnitOfficeTempEntity findByCustomerIdAndSubCustomerIdAndSourceUnitIdAndChannelColorCodeAndChannelUserIdAndFromDateAndToDateAndCreatedByAndModifiedByAndActiveState(Long customerId, Long subCustomerId, String sourceUnitId, String channelColorCode, String channelUserId, LocalDateTime fromDate, LocalDateTime toDate, String createdBy, String modifiedBy, Boolean activeState);
    List<CustomerUnitOfficeTempEntity> findByCustomerIdAndSubCustomerIdAndSourceUnitIdAndChannelColorCodeAndChannelUserIdAndFromDateAndToDateAndCreatedByAndModifiedByAndActiveStateIn(Long customerId, Long subCustomerId, String sourceUnitId, String channelColorCode, String channelUserId, LocalDateTime fromDate, LocalDateTime toDate, String createdBy, String modifiedBy, Boolean[] activeState);
    List<CustomerUnitOfficeTempEntity> saveAll(List<CustomerUnitOfficeTempEntity> customerUnitOfficeTempEntities);
}