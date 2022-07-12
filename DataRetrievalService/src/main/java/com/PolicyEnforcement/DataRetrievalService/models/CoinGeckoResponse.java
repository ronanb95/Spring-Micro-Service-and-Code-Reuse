package com.PolicyEnforcement.DataRetrievalService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoinGeckoResponse {

    @JsonProperty("bitcoin")
    Bitcoin bitcoin;
    
}
