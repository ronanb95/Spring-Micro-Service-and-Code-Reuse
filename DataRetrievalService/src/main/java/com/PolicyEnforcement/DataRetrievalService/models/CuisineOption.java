package com.PolicyEnforcement.DataRetrievalService.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CuisineOption {

    @JsonProperty("Name")
    String name;

    @JsonProperty("SeoName")
    String seoName;

    @JsonProperty("Total")
    int total;
    
}
