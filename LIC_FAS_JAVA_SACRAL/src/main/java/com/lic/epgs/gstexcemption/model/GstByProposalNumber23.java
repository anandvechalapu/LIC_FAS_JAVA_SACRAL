@Entity
@Table(name = "GST_BY_PROPOSAL_NUMBER_23")
@Getter
@Setter
@NoArgsConstructor
public class GstByProposalNumber23 implements Serializable {
 
    private static final long serialVersionUID = 1L;
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column(name = "proposal_number")
    private Long proposalNumber;
 
    @Column(name = "type_of_client")
    private String typeOfClient;
 
    @Column(name = "gst_exemption_category")
    private Integer gstExemptionCategory;
 
    @Column(name = "status")
    private Integer status;
 
}