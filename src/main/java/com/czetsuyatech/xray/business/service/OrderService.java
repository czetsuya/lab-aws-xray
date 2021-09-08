package com.czetsuyatech.xray.business.service;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import org.springframework.stereotype.Service;

@Service
@XRayEnabled
public class OrderService {

  public void order() {
    System.out.println("order taken");
  }
}