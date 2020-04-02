/**
 * demo Project
 * Test1Controller.java
 * Copyright © Citynow Inc. All rights reserved.
 */
package com.quan.nguyen.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test1Controller.java
 */
@RestController
@RequestMapping("/api/hello")
//@ConditionalOnExpression("#{'${hotel.code}'.equals('002')}")
@ConditionalOnProperty(name=Constant.HOTEL_CODE_ENV, havingValue=Constant.HOTEL_CODE_TOKYO)
public class Test1Controller {

    @GetMapping("")
    String hello(){
        return "Hello Tokyo";
    }
}