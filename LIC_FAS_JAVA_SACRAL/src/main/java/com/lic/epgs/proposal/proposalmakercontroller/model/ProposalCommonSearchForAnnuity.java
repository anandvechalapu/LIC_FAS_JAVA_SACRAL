@Entity
@Table(name = "proposal_common_search_for_annuity")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class ProposalCommonSearchForAnnuity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lead_number")
    private String leadNumber;

    @Column(name = "proposal_number")
    private String proposalNumber;

    @Column(name = "proposal_date")
    private Date proposalDate;

    @Column(name = "proposal_status")
    private String proposalStatus;

    @Column(name = "sub_status")
    private String subStatus;

    @Column(name = "proposal_id")
    private Long proposalId;

    @Column(name = "proposer_name")
    private String proposerName;

    @Column(name = "unit_code")
    private String unitCode;

    @Column(name = "active")
    private Boolean active;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

}