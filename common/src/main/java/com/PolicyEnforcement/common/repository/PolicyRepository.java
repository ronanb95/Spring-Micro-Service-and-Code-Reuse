package com.PolicyEnforcement.common.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.PolicyEnforcement.common.models.Policy;

@Repository
public interface PolicyRepository extends MongoRepository<Policy, String> {
    

}
