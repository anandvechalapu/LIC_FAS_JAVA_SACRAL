@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "customer_code")
    private String customerCode;

    @Column(name = "group_id")
    private long groupId;

}