@Entity
@Table(name = "lms_lead_basic_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
public class LmsLeadBasicDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lead_name")
    private String leadName;

    @Column(name = "lms_lead_number")
    private String lmsLeadNumber;

    @Column(name = "lead_contact_number")
    private String leadContactNumber;

    @Column(name = "pan")
    private String pan;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "customer_code")
    private String customerCode;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "trust_name")
    private String trustName;

    @Column(name = "product")
    private String product;

    @Column(name = "sub_product")
    private String subProduct;

    @Column(name = "line_of_business")
    private String lineOfBusiness;

    @Column(name = "number_of_lives")
    private int numberOfLives;

    @Column(name = "premium_expected")
    private int premiumExpected;

    @Column(name = "unit_office_id")
    private String unitOfficeId;

    @Column(name = "mo_code")
    private String moCode;

    @Column(name = "mo_name")
    private String moName;

    @Column(name = "intermediary_code")
    private String intermediaryCode;

    @Column(name = "intermediary_name")
    private String intermediaryName;

    @Column(name = "intermediary_contact_number")
    private String intermediaryContactNumber;

    @Column(name = "lead_source_type")
    private String leadSourceType;

    @Column(name = "lead_source_name")
    private String leadSourceName;

}