import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.customer.customermakercontroller.model.CustomerUnitOfficeDto;

public interface SaveUnitDetails_CustomerMakerController22Repository extends JpaRepository<CustomerUnitOfficeDto, Long> {
	
	public CustomerUnitOfficeDto findByCustomerId(Long customerId);
	
	public CustomerUnitOfficeDto findByCustomerUnitOfficeId(Long customerUnitOfficeId);
	
	public void markAsInactiveByCustomerUnitOfficeId(Long customerUnitOfficeId);
	
	public void saveWithSameCreatedByUser(CustomerUnitOfficeDto customerUnitOfficeDto);
	
	public void saveWithCreateOnTimestamp(CustomerUnitOfficeDto customerUnitOfficeDto);
	
	public void saveWithChannelColorCode(CustomerUnitOfficeDto customerUnitOfficeDto);
	
	public void saveWithChannelUserId(CustomerUnitOfficeDto customerUnitOfficeDto);
	
	public void saveWithIsActiveStatus(CustomerUnitOfficeDto customerUnitOfficeDto);
	
	public void saveForEachServicingUnitId(CustomerUnitOfficeDto customerUnitOfficeDto);
	
	public CustomerUnitOfficeDto saveAndReturnNewCustomerUnitOfficeDto(CustomerUnitOfficeDto customerUnitOfficeDto);
}