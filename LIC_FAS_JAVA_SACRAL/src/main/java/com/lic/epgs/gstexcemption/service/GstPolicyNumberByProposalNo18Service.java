package com.lic.epgs.gstexcemption.service;

import com.lic.epgs.gstexcemption.dto.GstPolicyNumberDto;
import com.lic.epgs.gstexcemption.dto.CommonResponseDto;
import com.lic.epgs.gstexcemption.repository.GstPolicyNumberByProposalNo18Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GstPolicyNumberByProposalNo18Service {

    @Autowired
    private GstPolicyNumberByProposalNo18Repository gstPolicyNumberRepository;

    /**
     * Retrieves the GST policy number details by policy number.
     *
     * @param policyNo The policy number.
     * @return The CommonResponseDto object containing either a List of GstPolicyNumberDto
     *     objects or a single GstPolicyNumberDto object.
     */
    public CommonResponseDto gstPolicyNumberByProposalNo(GstPolicyNumberDto policyNo) {
        return gstPolicyNumberRepository.gstPolicyNumberByProposalNo(policyNo);
    }

}