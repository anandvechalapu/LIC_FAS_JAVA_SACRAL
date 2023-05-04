@Entity
@Table(name = "sub_customer_maker_controller")
public class SubCustomerMakerController {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "sub_customer_name")
	private String subCustomerName;
	
	@Column(name = "sub_customer_status")
	private String subCustomerStatus;
	
	@Column(name = "sub_customer_workflow_status")
	private String subCustomerWorkFlowStatus;
	
	@Column(name = "sub_customer_mapped_details")
	private String subCustomerMappedDetails;
	
	@Column(name = "sub_customer_feedback")
	private Boolean subCustomerFeedback;
	
	public SubCustomerMakerController() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getSubCustomerName() {
		return subCustomerName;
	}
	
	public void setSubCustomerName(String subCustomerName) {
		this.subCustomerName = subCustomerName;
	}
	
	public String getSubCustomerStatus() {
		return subCustomerStatus;
	}
	
	public void setSubCustomerStatus(String subCustomerStatus) {
		this.subCustomerStatus = subCustomerStatus;
	}
	
	public String getSubCustomerWorkFlowStatus() {
		return subCustomerWorkFlowStatus;
	}
	
	public void setSubCustomerWorkFlowStatus(String subCustomerWorkFlowStatus) {
		this.subCustomerWorkFlowStatus = subCustomerWorkFlowStatus;
	}
	
	public String getSubCustomerMappedDetails() {
		return subCustomerMappedDetails;
	}
	
	public void setSubCustomerMappedDetails(String subCustomerMappedDetails) {
		this.subCustomerMappedDetails = subCustomerMappedDetails;
	}
	
	public Boolean getSubCustomerFeedback() {
		return subCustomerFeedback;
	}
	
	public void setSubCustomerFeedback(Boolean subCustomerFeedback) {
		this.subCustomerFeedback = subCustomerFeedback;
	}
	
}