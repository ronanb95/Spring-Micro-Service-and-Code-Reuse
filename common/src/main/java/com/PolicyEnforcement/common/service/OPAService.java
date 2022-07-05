package com.PolicyEnforcement.common.service;

import org.springframework.stereotype.Service;

import com.PolicyEnforcement.common.models.Policy;
import com.bisnode.opa.client.OpaClient;
import com.bisnode.opa.client.policy.OpaPolicy;
import com.bisnode.opa.client.policy.OpaPolicyApi;
import com.bisnode.opa.client.query.OpaQueryApi;

@Service
public class OPAService {

    OpaPolicyApi policyClient = OpaClient.builder()
                                     .opaConfiguration("http://localhost:8181")
                                     .build();
    
    OpaQueryApi queryClient = OpaClient.builder()
                                .opaConfiguration("http://localhost:8181")
                                .build();


    public void sendPolicyToOPA(Policy policy){
        OpaPolicy opaPolicy = new OpaPolicy(policy.getId(), policy.getCode());
        policyClient.createOrUpdatePolicy(opaPolicy);
    }

}
