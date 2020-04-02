/**
 * SharingWork Project
 * BaseService.java
 * Copyright © Citynow Inc. All rights reserved.
 */
package com.quan.nguyen.demo.core.service;

import org.springframework.stereotype.Service;

/**
 * BaseService.java
 */
@Service
public abstract class BaseService<I,O> implements IService<I,O>  {
    @Override
    public O execute(I input) {
        try {
            preExec(input);
            return runExec(input);
        } catch (Exception e){
            throw new RuntimeException("Error Code");
        } finally {

        }
    }

    abstract void preExec(I input);

    abstract O runExec(I input);
}
