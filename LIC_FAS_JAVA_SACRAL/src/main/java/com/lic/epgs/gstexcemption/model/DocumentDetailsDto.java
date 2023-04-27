@Entity
@Table(name = "document_details")
public class DocumentDetailsDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documentId;

    @Column
    private Long gstExemptionId;

    @Column
    private boolean existingCondition1;

    @Column
    private boolean existingCondition2;

    @Column
    private Timestamp createdAt;

    @Column
    private Timestamp updatedAt;

    // Getters and setters
    // ...
}