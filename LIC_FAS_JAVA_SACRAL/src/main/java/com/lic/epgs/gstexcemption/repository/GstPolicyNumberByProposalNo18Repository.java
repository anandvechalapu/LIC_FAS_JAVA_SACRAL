package com.lic.epgs.gstexcemption.repository;

import com.lic.epgs.gstexcemption.dto.GstPolicyNumberDto;
import com.lic.epgs.gstexcemption.dto.CommonResponseDto;

/**
 * Repository class for retrieving the GST policy number details.
 */
public interface GstPolicyNumberByProposalNo18Repository {

    /**
     * Retrieves the GST policy number details by policy number.
     *
     * @param policyNo The policy number.
     * @return The CommonResponseDto object containing either a List of GstPolicyNumberDto
     *     objects or a single GstPolicyNumberDto object.
     */
    CommonResponseDto gstPolicyNumberByProposalNo(GstPolicyNumberDto policyNo);
}