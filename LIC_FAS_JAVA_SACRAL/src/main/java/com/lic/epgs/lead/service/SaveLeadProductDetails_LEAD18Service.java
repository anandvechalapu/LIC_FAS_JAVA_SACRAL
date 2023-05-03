package com.lic.epgs.lead.service;

import com.lic.epgs.lead.dto.CommonLeadDto;
import com.lic.epgs.lead.dto.LeadProductDetailsDto;
import com.lic.epgs.lead.entity.LeadProductDetailsTempEntity;
import com.lic.epgs.lead.repository.SaveLeadProductDetails_LEAD18Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveLeadProductDetails_LEAD18Service {

    @Autowired
    private SaveLeadProductDetails_LEAD18Repository saveLeadProductDetails_LEAD18Repository;

    public LeadProductDetailsTempEntity save(LeadProductDetailsDto leadProductDetailsDto) {
        return saveLeadProductDetails_LEAD18Repository.save(leadProductDetailsDto);
    }

    public CommonLeadDto saveAndReturnCommonLeadDto(LeadProductDetailsDto leadProductDetailsDto) {
        LeadProductDetailsTempEntity leadProductDetailsTempEntity = saveLeadProductDetails_LEAD18Repository.save(leadProductDetailsDto);
        CommonLeadDto commonLeadDto = new CommonLeadDto();
        commonLeadDto.setLeadId(leadProductDetailsTempEntity.getLeadId());
        commonLeadDto.setProductId(leadProductDetailsTempEntity.getProductId());
        commonLeadDto.setLeadProductStatus(leadProductDetailsTempEntity.getLeadProductStatus());
        return commonLeadDto;
    }

}