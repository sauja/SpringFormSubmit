package com.cogentinfo.abc_insurance.model.order;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Orders {
    @Id
    @Getter @Setter private String id;

    public Orders() {
        this.id = UUID.randomUUID().toString();
    }
}
