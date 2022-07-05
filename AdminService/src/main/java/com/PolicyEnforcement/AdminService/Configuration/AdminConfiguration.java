package com.PolicyEnforcement.AdminService.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.PolicyEnforcement.common.repository.PolicyRepository;
import com.PolicyEnforcement.common.service.PolicyService;

@Configuration
//@EnableMongoRepositories("com.PolicyEnforcement.common.repository.PolicyRepository")
public class AdminConfiguration {

    
    @Bean
    PolicyService policyService(){
        return new PolicyService();
    }
    
}
