package com.cogentinfo.abc_insurance.model.policy.vehicle;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class VehicleHistory {
    @Id
    @Getter @Setter private String id;
    @Getter @Setter private String description;

    public VehicleHistory()
    {
        this.id= UUID.randomUUID().toString();
    }
}
