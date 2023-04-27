@Entity
@Table(name="commission")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdOn", "modifiedOn"}, 
        allowGetters = true)
public class Commission implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commissionId;

    @NotBlank
    private String status;

    @NotBlank
    private String workflowStatus;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdOn;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date modifiedOn;

    @Column(nullable = false)
    private String modifiedBy;
    
    @Column(nullable = false)
    private Boolean isActive;
    
    //Getters and Setters

}