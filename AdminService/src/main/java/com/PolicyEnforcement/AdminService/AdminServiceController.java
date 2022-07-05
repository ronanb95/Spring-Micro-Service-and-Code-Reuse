package com.PolicyEnforcement.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.PolicyEnforcement.common.models.Policy;
import com.PolicyEnforcement.common.service.PolicyService;

@Component
@RestController
public class AdminServiceController {

    @Autowired
    PolicyService policyService;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public void createPolicy(){
       
        Policy policy = new Policy();
        policy.setCode("some code");
        policy.setCodeExpression("123");

        policyService.createPolicy(policy);
     
    }
    
    
}
