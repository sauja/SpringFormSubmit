package com.cogentinfo.abc_insurance.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@NamedQueries({
        @NamedQuery(name = "Users.findAll",query = "select u from UserLogin u"),
        @NamedQuery(name = "Users.findByEmail", query = "select u from UserLogin u where u.email=:pEmail")
})
@Table(name = "User_Login")
public class UserLogin implements Serializable{
    @Id
    @Getter @Setter private String id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING )
    @Getter @Setter private Roles role=Roles.CUSTOMER;
    @Getter @Setter private String email;
    @Getter @Setter private String password;
    @OneToOne
    @Getter @Setter private UserDetails userDetails;
    @OneToOne
    @Getter @Setter Cart cart;
    public UserLogin()
    {
        this.id= UUID.randomUUID().toString();
    }
}
