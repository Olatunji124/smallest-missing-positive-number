package com.ThreelineTest.RestApi.service;

import com.ThreelineTest.RestApi.model.CardDTO;
import com.ThreelineTest.RestApi.model.CardValidationPayload;
import com.ThreelineTest.RestApi.model.HitCountDTO;
import com.ThreelineTest.RestApi.model.HitCountPayload;
import org.springframework.stereotype.Service;

@Service
public class CardValidationService {

    //verify card
    public CardDTO validateCard(){

        //set values (hard code) for each payload field
        CardValidationPayload payload = new CardValidationPayload();
        payload.setScheme("visa");
        payload.setType("debit");
        payload.setBank("UBS");

        //return the expected result
        return new CardDTO(true, payload);
    }

    //number of hits
    public HitCountDTO hitCount(){

        //set values (hard code) for each payload field
        HitCountPayload countPayload = new HitCountPayload();
        countPayload.setVariableOne(5);
        countPayload.setVariableTwo(4);
        countPayload.setVariableThree(1);

        //return the expected result
        return new HitCountDTO(true, 1,3,133, countPayload);
    }
}
