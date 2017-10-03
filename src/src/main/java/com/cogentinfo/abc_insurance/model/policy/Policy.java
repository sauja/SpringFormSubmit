package com.cogentinfo.abc_insurance.model.policy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Policy{
    @Id
    @Getter @Setter String id;
    @Getter @Setter String name;
    @Enumerated(EnumType.STRING )
    @Getter @Setter PolicyType policyType;
    @OneToMany
    @Getter @Setter List<Coverage> coverageList;
    public Policy()
    {
        this.id= UUID.randomUUID().toString();
    }
}
