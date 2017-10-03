package com.cogentinfo.abc_insurance.repository;

import com.cogentinfo.abc_insurance.model.policy.vehicle.VehiclePolicy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiclePolicyRepo extends CrudRepository<VehiclePolicy,String> {
}
