package com.PolicyEnforcement.EnforcementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PolicyEnforcement.common.service.OPAService;

@Component
@RestController
public class EnforcementServiceController {
    
    @Autowired
    OPAService opaService;

    @GetMapping(value="/test", consumes="application/json")
    ResponseEntity<?> getPolicyEvaulation(@RequestBody Object query){
        return ResponseEntity.ok("something");
    } 



   
}
