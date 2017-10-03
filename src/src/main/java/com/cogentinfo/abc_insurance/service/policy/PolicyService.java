package com.cogentinfo.abc_insurance.service.policy;

import com.cogentinfo.abc_insurance.model.policy.Policy;

public interface PolicyService {
    void addPolicy();
    void modifyPolicy(Policy policy);
    Policy getPolicy();
    void deletePolicy(Policy policy);
}
