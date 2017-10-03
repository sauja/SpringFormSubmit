package com.cogentinfo.abc_insurance.repository;

import com.cogentinfo.abc_insurance.model.policy.health.HealthPolicy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthPolicyRepo extends CrudRepository<HealthPolicy,String> {
}
