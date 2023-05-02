@Entity
@Table(name = "send_to_maker_group_customer_checker_controller")
public class SendToMakerGroupCustomerCheckerController {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column(name = "group_status")
    private String groupStatus;
 
    @Column(name = "active_status")
    private String activeStatus;
 
    @Column(name = "modified_by")
    private String modifiedBy;
 
    @Column(name = "modified_on")
    private Date modifiedOn;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getGroupStatus() {
        return groupStatus;
    }
 
    public void setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus;
    }
 
    public String getActiveStatus() {
        return activeStatus;
    }
 
    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }
 
    public String getModifiedBy() {
        return modifiedBy;
    }
 
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
 
    public Date getModifiedOn() {
        return modifiedOn;
    }
 
    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}