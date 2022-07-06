package com.PolicyEnforcement.DataRetrievalService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataRetrievalController {

    @Autowired
    JustEatService justEatService;

    @GetMapping(value="/justeat")
    public ResponseEntity<?> getListOfRestaurants(){

        ArrayList<String> response = justEatService.getAvailableFoodsForPostcode("ec4m");
        return ResponseEntity.ok(response);
    }

    
}
