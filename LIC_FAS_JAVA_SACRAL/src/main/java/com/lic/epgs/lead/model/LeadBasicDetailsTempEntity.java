@Entity
@Table(name = "lead_basic_details_temp")
public class LeadBasicDetailsTempEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lead_id")
	private Long leadId;
	
	@Column(name = "lead_number")
	private String leadNumber;
	
	@Column(name = "lead_status")
	private String leadStatus;
	
	@Column(name = "lead_sub_status")
	private String leadSubStatus;
	
	@Column(name = "workflow_status")
	private String workflowStatus;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "modified_on")
	private Date modifiedOn;
	
	// getters and setters
}

@Entity
@Table(name = "lead_product_details_temp")
public class LeadProductDetailsTempEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lead_id")
	private Long leadId;
	
	@Column(name = "product_type")
	private String productType;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_on")
	private Date createdOn;
	
	@Column(name = "modified_on")
	private Date modifiedOn;
	
	// getters and setters
}

@Entity
@Table(name = "lead_channel_details_temp")
public class LeadChannelDetailsTempEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lead_id")
	private Long leadId;
	
	@Column(name = "channel_name")
	private String channelName;
	
	@Column(name = "channel_code")
	private String channelCode;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_on")
	private Date createdOn;
	
	@Column(name = "modified_on")
	private Date modifiedOn;
	
	// getters and setters
}

@Entity
@Table(name = "lead_notes_active_temp")
public class LeadNotesActiveTempEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lead_id")
	private Long leadId;
	
	@Column(name = "note_name")
	private String noteName;
	
	@Column(name = "note_type")
	private String noteType;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_on")
	private Date createdOn;
	
	@Column(name = "modified_on")
	private Date modifiedOn;
	
	// getters and setters

}

@Entity
@Table(name = "transaction_response")
public class TransactionResponse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lead_id")
	private Long leadId;
	
	@Column(name = "transaction_status")
	private String transactionStatus;
	
	@Column(name = "transaction_message")
	private String transactionMessage;
	
	// getters and setters
}

@Entity
@Table(name = "lead_response")
public class LeadResponse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lead_id")
	private Long leadId;
	
	@Column(name = "