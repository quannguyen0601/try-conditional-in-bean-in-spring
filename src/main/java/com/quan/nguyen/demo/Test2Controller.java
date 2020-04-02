/**
 * Quan demo Project
 * Test2Controller.java
 * Copyright © QuanNguyen. All rights reserved.
 */
package com.quan.nguyen.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test2Controller.java
 */

@RestController
@RequestMapping("/api/hello")
//@ConditionalOnExpression("#{'${hotel.code}'.equals('001')}")
@ConditionalOnProperty(name=Constant.HOTEL_CODE_ENV, havingValue=Constant.HOTEL_CODE_OSAKA)
public class Test2Controller {
    @Value("${hotel.code}")
    private String hotelCode;
    @GetMapping("")
    String hello(){
        return "Hello Osaka";
    }

}

