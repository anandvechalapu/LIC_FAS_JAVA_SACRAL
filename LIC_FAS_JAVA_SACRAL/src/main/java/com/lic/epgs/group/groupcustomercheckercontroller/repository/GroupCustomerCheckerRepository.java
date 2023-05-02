import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.group.groupcustomercheckercontroller.dto.GroupCustomerBasicDetailsDto;
import com.lic.epgs.group.groupcustomercheckercontroller.entity.AddressDetailsEntity;
import com.lic.epgs.group.groupcustomercheckercontroller.entity.GroupCustomerBasicDetailsEntity;
import com.lic.epgs.group.groupcustomercheckercontroller.entity.GroupCustomerBasicDetailsTempEntity;

@Repository
public interface GroupCustomerCheckerRepository extends JpaRepository<GroupCustomerBasicDetailsEntity, Long> {
 
    public GroupCustomerBasicDetailsTempEntity findByGroupCustomerIdAndIsActiveTrue(String groupCustomerId);

    public AddressDetailsEntity findByGroupCustomerIdAndIsActiveTrue(String newEntityGroupCustomerId);

    public GroupCustomerBasicDetailsEntity save(GroupCustomerBasicDetailsEntity groupCustomerBasicDetailsEntity);
}