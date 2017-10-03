package com.cogentinfo.abc_insurance.model;

import com.cogentinfo.abc_insurance.model.policy.Policy;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
public class Cart {
    @Id
    @Getter @Setter String id;
    @OneToMany
    @Getter @Setter List<Policy> policyList;

    public Cart()
    {
        this.id= UUID.randomUUID().toString();
    }
}
