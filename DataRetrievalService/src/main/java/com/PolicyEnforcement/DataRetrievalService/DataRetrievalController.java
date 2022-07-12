package com.PolicyEnforcement.DataRetrievalService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.PolicyEnforcement.DataRetrievalService.models.Bitcoin;

@Controller
public class DataRetrievalController {

    @Autowired
    CoinDeskPriceService coinDeskPriceService;

    @GetMapping(value="/coinprices")
    public ResponseEntity<?> getListOfRestaurants(){

        Bitcoin response;
        try {
            response = coinDeskPriceService.getCoinPrices();
            return ResponseEntity.ok(response);
        } catch (Exception e) {
           return ResponseEntity.badRequest().body("The following error occurred : " + e.getMessage());
        }
        
    }

    
}
