package com.PolicyEnforcement.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.PolicyEnforcement.common.models.Policy;
import com.PolicyEnforcement.common.service.OPAService;
import com.PolicyEnforcement.common.service.PolicyService;

@Component
@RestController
public class AdminServiceController {

    @Autowired
    PolicyService policyService;

    @Autowired
    OPAService opaService;

    @PostMapping(value = "/policy", consumes=MediaType.TEXT_PLAIN_VALUE) //Using plain text for ease of use when creating a policy
    public ResponseEntity<?> createPolicy(@RequestBody String policyObject){
       
        Policy policy = new Policy();
        policy.setCode(policyObject);
        Policy createdPolicy = policyService.createPolicy(policy);
        opaService.sendPolicyToOPA(createdPolicy);

        return ResponseEntity.ok(createdPolicy.getId());
     
    }
    
    
}
