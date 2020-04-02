/**
 * SharingWork Project
 * IService.java
 * Copyright © QuanNguyen Inc. All rights reserved.
 */
package com.quan.nguyen.demo.core.service;

/**
 * IService.java
 */
public interface IService<I,O> {
    O execute(I input);
}
