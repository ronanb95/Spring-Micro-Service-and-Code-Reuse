package com.PolicyEnforcement.DataRetrievalService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.PolicyEnforcement.DataRetrievalService.models.Bitcoin;
import com.PolicyEnforcement.DataRetrievalService.models.CoinGeckoResponse;

@Service
public class CoinDeskPriceService {

    @Value("${coin.gecko.endpoint}")
    String coinGeckoUrl;
    
    @Autowired
    RestTemplate restTemplate;

    Logger logger = LoggerFactory.getLogger(CoinDeskPriceService.class);


    Bitcoin getCoinPrices() throws Exception{

        Bitcoin currentPrice = null;

        ResponseEntity<CoinGeckoResponse> response = getPricesFromCoinDesk();
        if(response == null){
           throw new Exception("Response was null");
        }
        currentPrice = response.getBody().getBitcoin();
        logger.info("Returning usd bitcoin price at {}", currentPrice.getUsd());

        return currentPrice;
    }
    
    ResponseEntity<CoinGeckoResponse> getPricesFromCoinDesk(){

        ResponseEntity<CoinGeckoResponse> response;
        try{
            response = restTemplate.exchange(coinGeckoUrl, HttpMethod.GET, null, CoinGeckoResponse.class);
        } catch (Exception e){
            logger.info("The following error occurred while fetching data {}", e.getMessage());
            return null;
        }
        return response;
    }  
}
