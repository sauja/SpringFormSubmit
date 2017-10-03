package com.cogentinfo.abc_insurance.model.policy.health;

import com.cogentinfo.abc_insurance.model.policy.Policy;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name = "id")

public class HealthPolicy extends Policy {

}
