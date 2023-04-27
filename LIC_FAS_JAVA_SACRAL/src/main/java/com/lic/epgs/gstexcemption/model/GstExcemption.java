@Entity
@Table(name="gst_excemption")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GstExcemption implements Serializable  {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gst_excemption_id")
    private Long gstExcemptionId;
 
    @Column(name = "gst_excemption_status")
    private String gstExcemptionStatus;
 
    @Column(name = "created_by")
    private Long createdBy;
 
    @Column(name = "modified_by")
    private Long modifiedBy;
 
    @Column(name = "created_date")
    private LocalDateTime createdDate;
 
    @Column(name = "modified_date")
    @LastModifiedDate
    private LocalDateTime modifiedDate;
 
    @Column(name = "work_flow_status")
    private String workFlowStatus;
 
    @Column(name = "rejection_remarks")
    private String rejectionRemarks;
 
    @OneToMany(mappedBy="gstExcemption",cascade=CascadeType.ALL,orphanRemoval=true)
    private List<GstExcemptionNote> gstExcemptionNote;
 
    @OneToMany(mappedBy="gstExcemption",cascade=CascadeType.ALL,orphanRemoval=true)
    private List<GstExcemptionDocument> gstExcemptionDocument;
 
}