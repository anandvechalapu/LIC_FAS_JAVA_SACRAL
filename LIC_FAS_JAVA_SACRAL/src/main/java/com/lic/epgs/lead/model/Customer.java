@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Customer {
 
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long customerId;
 
   @Column(name = "customer_code")
   private String customerCode;
 
   @Column(name = "customer_name")
   private String customerName;
 
   @Column(name = "pan")
   private String PAN;
 
   @Column(name = "customer_type")
   private String customerType;
 
   @Column(name = "customer_status")
   private String customerStatus;
 
   @Column(name = "industry_type")
   private String industryType;
 
   @Column(name = "customer_entity")
   private String customerEntity;
 
}