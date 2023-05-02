@Entity
@Table(name="group_customer_basic_details_temp_entity")
public class GroupCustomerBasicDetailsTempEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_customer_id")
    private Integer groupCustomerId;

    @Column(name = "group_status")
    private String groupStatus;

    @Column(name = "workflow_status")
    private String workflowStatus;

    @Column(name = "rejection_remarks")
    private String rejectionRemarks;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_on")
    private LocalDateTime modifiedOn;

    @Column(name = "is_active")
    private Boolean isActive;

}

@Entity
@Table(name="address_details_entity")
public class AddressDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer addressId;

    @Column(name = "temp_address_id")
    private Integer tempAddressId;

    @Column(name = "address_line_1")
    private String addressLine1;

    @Column(name = "address_line_2")
    private String addressLine2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "pin_code")
    private String pinCode;

}

@Entity
@Table(name="contact_detail_entity")
public class ContactDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_person_id")
    private Integer contactPersonId;

    @Column(name = "temp_contact_person_id")
    private Integer tempContactPersonId;

    @Column(name = "name")
    private String name;

    @Column(name = "designation")
    private String designation;

    @Column(name = "mobile_no")
    private String mobileNo;

    @Column(name = "email")
    private String email;

}

@Entity
@Table(name="customer_notes_entity")
public class CustomerNotesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id")
    private Integer noteId;

    @Column(name = "temp_note_id")
    private Integer tempNoteId;

    @Column(name = "notes")
    private String notes;

}