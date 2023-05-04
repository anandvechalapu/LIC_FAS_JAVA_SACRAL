import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.trust.entity.TrustAddressDetails;

public interface TrustAddressDetailsRepository extends JpaRepository<TrustAddressDetails, Long> {

    @Query("UPDATE TrustAddressDetails t SET t.addressId = ?1, t.modifiedBy = ?2, t.createdBy = ?3, t.trustId = ?4, t.addressLine1 = ?5, t.addressLine2 = ?6, t.city = ?7, t.state = ?8, t.zipCode = ?9, t.isActive = ?10 WHERE t.addressId = ?1")
    @Modifying
    void updateAddressDetails(Long addressId, String modifiedBy, String createdBy, Long trustId, String addressLine1, String addressLine2, String city, String state, String zipCode, Boolean isActive);

}