@Entity
@Table(name = "commission")
public class Commission implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "workflow_status")
    private String workflowStatus;
    
    @Column(name = "modified_by")
    private String modifiedBy;
    
    @Column(name = "modified_on")
    private LocalDateTime modifiedOn;
    
    // getters and setters

}