package com.cogentinfo.abc_insurance.model.policy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Coverage {

    @Id
    @Getter @Setter private String id;

    public Coverage()
    {
        this.id= UUID.randomUUID().toString();
    }
}
