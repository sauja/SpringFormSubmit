package com.cogentinfo.abc_insurance.model.policy.vehicle;

import com.cogentinfo.abc_insurance.model.policy.Policy;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.List;


@Entity
@PrimaryKeyJoinColumn(name = "id")
public class VehiclePolicy extends Policy {
    @OneToMany
    private List<VehicleDetails> vehicleDetails;

}
