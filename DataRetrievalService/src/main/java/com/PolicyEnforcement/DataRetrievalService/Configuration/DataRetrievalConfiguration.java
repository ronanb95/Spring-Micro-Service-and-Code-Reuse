package com.PolicyEnforcement.DataRetrievalService.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DataRetrievalConfiguration {

    @Value("${token}")
    String token;
    
    @Bean
    RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.basicAuthentication(token, "").build();
    }

}
