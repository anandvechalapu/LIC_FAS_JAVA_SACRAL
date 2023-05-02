package com.lic.epgs.customer.customercheckercontroller.repository;

import com.lic.epgs.customer.customercheckercontroller.model.CommonResponseDto;
import com.lic.epgs.customer.customercheckercontroller.model.CustomerBasicDetailsDto;

public interface RejectCustomerCheckerControllerRepository {

    CommonResponseDto rejectCustomer(CustomerBasicDetailsDto customerBasicDetailsDto);

}