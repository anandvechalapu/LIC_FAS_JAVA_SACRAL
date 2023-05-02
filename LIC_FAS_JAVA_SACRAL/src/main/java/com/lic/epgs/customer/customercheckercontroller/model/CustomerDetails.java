@Entity
@Table(name = "customer_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Package(value = "com.lic.epgs.customer.customercheckercontroller.model")
public class CustomerDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerID;

    @Column(name = "basic_details")
    private String basicDetails;

    @Column(name = "unit_office_details")
    private String unitOfficeDetails;

    @Column(name = "bank_account_details")
    private String bankAccountDetails;

    @Column(name = "contact_details")
    private String contactDetails;

    @Column(name = "address_details")
    private String addressDetails;

    @Column(name = "document_details")
    private String documentDetails;

    @Column(name = "trust_details")
    private String trustDetails;

    @Column(name = "group_customer_details")
    private String groupCustomerDetails;

    @Column(name = "customer_notes")
    private String customerNotes;

}