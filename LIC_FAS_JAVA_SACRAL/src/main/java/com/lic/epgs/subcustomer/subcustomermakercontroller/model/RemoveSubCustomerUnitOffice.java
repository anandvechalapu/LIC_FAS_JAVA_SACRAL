package com.lic.epgs.subcustomer.subcustomermakercontroller.model;

import javax.persistence.*;

@Entity
@Table(name = "remove_sub_customer_unit_office")
public class RemoveSubCustomerUnitOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sub_customer_id")
    private Long subCustomerId;

    @Column(name = "unit_office_id")
    private Long unitOfficeId;

    public RemoveSubCustomerUnitOffice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubCustomerId() {
        return subCustomerId;
    }

    public void setSubCustomerId(Long subCustomerId) {
        this.subCustomerId = subCustomerId;
    }

    public Long getUnitOfficeId() {
        return unitOfficeId;
    }

    public void setUnitOfficeId(Long unitOfficeId) {
        this.unitOfficeId = unitOfficeId;
    }
}