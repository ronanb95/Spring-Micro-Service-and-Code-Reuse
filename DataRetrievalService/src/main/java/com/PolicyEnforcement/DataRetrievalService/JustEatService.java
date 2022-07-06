package com.PolicyEnforcement.DataRetrievalService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.PolicyEnforcement.DataRetrievalService.models.CuisineOption;
import com.PolicyEnforcement.DataRetrievalService.models.JustEatResponse;

@Service
public class JustEatService {

    @Value("${just.eat.endpoint}")
    String baseUrl;
    
    @Autowired
    RestTemplate restTemplate;

    ArrayList<String> getAvailableFoodsForPostcode(String postcode){

        ArrayList<String> availableFoods = new ArrayList<>();

        ResponseEntity<JustEatResponse> response= getJustEatResponse(postcode);
        if(response == null){
            return availableFoods;
        }
        
        ArrayList<CuisineOption> options = response.getBody().getMetaData().getCuisineDetails();
        for(CuisineOption option: options){
            availableFoods.add(option.getName());
            availableFoods.add(option.getSeoName());
        }

        return availableFoods;
    }
    
    ResponseEntity<JustEatResponse> getJustEatResponse(String postcode){

        String url = baseUrl + postcode;
        ResponseEntity<JustEatResponse> response;
        try{
            response = restTemplate.exchange(url, HttpMethod.GET, null, JustEatResponse.class);
        } catch (Exception e){
            return null;
        }
        return response;
    }  
}
