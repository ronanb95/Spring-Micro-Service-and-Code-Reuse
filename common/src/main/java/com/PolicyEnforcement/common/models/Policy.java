package com.PolicyEnforcement.common.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document("Policy")
public class Policy {
    
    @Id
    String id;  
    String code; //This is only really used to store the code for reference, could remove 
    String codeExpression;

}

