/**
 * Demo Project
 * CommonController.java
 * Copyright © Citynow Inc. All rights reserved.
 */
package com.quan.nguyen.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CommonController.java
 */
@RestController
@RequestMapping("/api/hello")
//@ConditionalOnExpression("#{'${hotel.code}'.equals('common')}")
@ConditionalOnProperty(name=Constant.HOTEL_CODE_ENV, havingValue=Constant.HOTEL_CODE_COMMON, matchIfMissing = true)
public class CommonController {
    @GetMapping("")
    String hello(){
        return "Hello common";
    }
}
