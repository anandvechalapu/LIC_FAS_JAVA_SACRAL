@Entity
@Table(name = "customer_group_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCustomerGroupDetails_CustomerMakerController {
    @Id
    private String groupCode;
    private String groupName;
    private String groupDescription;
    private String status;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;
}