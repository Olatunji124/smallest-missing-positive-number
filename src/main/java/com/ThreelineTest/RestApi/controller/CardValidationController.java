package com.ThreelineTest.RestApi.controller;

import com.ThreelineTest.RestApi.exception.InvalidAuthorizationException;
import com.ThreelineTest.RestApi.exception.InvalidRequestException;
import com.ThreelineTest.RestApi.model.CardDTO;
import com.ThreelineTest.RestApi.model.HitCountDTO;
import com.ThreelineTest.RestApi.service.CardValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("card-scheme")
@RestController
public class CardValidationController {

    private final CardValidationService cardValidationService;

    @Autowired
    public CardValidationController(CardValidationService cardValidationService){
        this.cardValidationService = cardValidationService;
    }

    //initialize header values
    private String key = "test_20191123132233";
    private String time = "1617953042";
    private String hash = "4n+F7tDHDaFCoPkDDCtHMX6fvNIolyzMLFONT5c4XSYBg7VYFg1uMDYW7b3wDOs+rKL4QjaY2A100Jufsg1XFA==";
    String auth =  "3line"+" "+hash;

    //verify card
    //reads inputs in headers
    @GetMapping("/verify/234564562")
    public CardDTO verifyCard(@RequestHeader(value = "appKey", required = true) String appKey,
                              @RequestHeader(value = "timeStamp", required = true) String timeStamp,
                              @RequestHeader(value = "authorization", required = true) String authorization) {

        //check for the presence of headers, else display an error
        if(appKey.equals("") || timeStamp.equals("") || authorization.equals("")) {
            throw new InvalidRequestException();

            //compare the values, else display error for unmatched fields
        } else if(!appKey.equals(key) || !timeStamp.equals(time) || !authorization.equals(auth)) {
            throw new InvalidAuthorizationException();
        }
        //response after necessary checks
        return cardValidationService.validateCard();
    }

    //number of hits
    @GetMapping("/{start}/{limit}")
    public HitCountDTO  hitCount(@PathVariable(name = "start") int start,
                                 @PathVariable(name = "limit") int limit,
                                 @RequestHeader(value = "appKey") String appKey,
                                 @RequestHeader(value = "timeStamp") String timeStamp,
                                 @RequestHeader(value = "authorization") String authorization) {

        //check for the presence of headers, else display an error
        if (appKey.equals("") || timeStamp.equals("") || authorization.equals("")) {
            throw new InvalidRequestException();

            //compare the values, else display error for unmatched fields
        } else if(!appKey.equals(key) || !timeStamp.equals(time) || !authorization.equals(auth)) {
            throw new InvalidAuthorizationException();
        }
        //response after necessary checks
        return cardValidationService.hitCount();
    }
}
