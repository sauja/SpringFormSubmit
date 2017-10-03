package com.cogentinfo.abc_insurance.model;

import com.cogentinfo.abc_insurance.model.order.Orders;
import com.cogentinfo.abc_insurance.model.policy.Policy;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "User_Details")
public class UserDetails implements Serializable{
    @Id
    @Getter @Setter private String id;

    @Getter @Setter private String firstName;
    @Getter @Setter private String lastName;
    @Getter @Setter private Date dateOfBirth;
    @Getter @Setter private String mobile;
    @OneToMany
    @Getter @Setter private Map<String,Address> addressMap;
    @OneToMany
    @Getter @Setter private List<Policy> policyList;
    @OneToMany
    @Getter @Setter private List<Orders> orderList;
    @OneToOne
    @Getter @Setter private Cart cart;
   /* @OneToOne
    @JoinColumn(name = "User_Address")

    @Getter @Setter private Address homeAddress;
    /*@OneToMany
    @Column(name = "billing Address")
    @Getter @Setter private Address billingAddress;*/
    public UserDetails()
    {
        this.id= UUID.randomUUID().toString();
    }
}
