@Entity
@Table(name = "common_trust_dto")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class CommonTrustDto extends AbstractAuditingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "trust_code")
    private String trustCode;

    @Column(name = "unit_code")
    private String unitCode;

    @Column(name = "status")
    private String status;

    @Column(name = "transaction_message")
    private String transactionMessage;

}