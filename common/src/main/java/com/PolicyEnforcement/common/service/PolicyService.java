package com.PolicyEnforcement.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.PolicyEnforcement.common.models.Policy;
import com.PolicyEnforcement.common.repository.PolicyRepository;

public class PolicyService {
    
    @Autowired
    PolicyRepository policyRepository;

    @Autowired
    MongoTemplate mongoTemplate;

    public Policy createPolicy(Policy policy){
        return mongoTemplate.save(policy); 
    }

}