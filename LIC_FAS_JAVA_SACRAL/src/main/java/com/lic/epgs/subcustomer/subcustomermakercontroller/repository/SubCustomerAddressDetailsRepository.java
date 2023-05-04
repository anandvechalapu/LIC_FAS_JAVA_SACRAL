import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.subcustomer.subcustomermakercontroller.dto.SubCustomerAddressDetailsDto;

public interface SubCustomerAddressDetailsRepository extends JpaRepository<SubCustomerAddressDetailsDto, Long> {

    SubCustomerAddressDetailsDto findBySubAddressIdAndSubCustomerId(Long subAddressId, Long subCustomerId);

}