import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.proposal.proposalmakercontroller.entity.Address;

public interface RemoveAddressDetailsRepository extends JpaRepository<Address, Long> {
    Address deleteAddressByAddressIdAndProposalIdAndModifiedBy(Long addressId, Long proposalId, String modifiedBy);
}