package com.PolicyEnforcement.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/policy", method = RequestMethod.POST)
    public void createPolicy(@RequestBody Policy policy){
       
        Policy createdPolicy = policyService.createPolicy(policy);
        opaService.sendPolicyToOPA(createdPolicy);
     
    }
    
    
}
