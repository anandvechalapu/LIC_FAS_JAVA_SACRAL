@Entity
@Table(name = "group_member_customer_details")
public class GroupMemberCustomerDetails implements Serializable {
 
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "group_customer_id")
  private Long groupCustomerId;

  @Column(name = "customer_id")
  private Long customerId;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getGroupCustomerId() {
    return groupCustomerId;
  }

  public void setGroupCustomerId(Long groupCustomerId) {
    this.groupCustomerId = groupCustomerId;
  }

  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

}