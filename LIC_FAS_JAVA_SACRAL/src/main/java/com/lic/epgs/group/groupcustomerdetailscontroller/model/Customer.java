@Entity
@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@PackageName("com.lic.epgs.group.groupcustomerdetailscontroller.model")
public class Customer {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column(name = "customer_code")
    private String customerCode;
 
    @Column(name = "customer_name")
    private String customerName;
 
    @Column(name = "customer_status")
    private String customerStatus;
 
    @Column(name = "trust_name")
    private String trustName;
 
    @Column(name = "trust_id")
    private String trustId;
}