package com.PolicyEnforcement.DataRetrievalService.models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaData {
    
    @JsonProperty("CuisineDetails")
    ArrayList<CuisineOption> cuisineDetails;
}
