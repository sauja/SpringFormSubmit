package com.cogentinfo.abc_insurance.model.policy.vehicle;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class VehicleDetails {
    @Id
    @Getter @Setter String id;

    @OneToMany
    private List<VehicleHistory> vehicleHistoryList;
    public VehicleDetails() {
        this.id = UUID.randomUUID().toString();
    }

    @Getter @Setter String make;
    @Getter @Setter String modelNo;
    @Getter @Setter String year;
    @Temporal(TemporalType.TIMESTAMP)
    @Getter @Setter Date dateOfPurchase;

}
