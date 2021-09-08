package com.czetsuyatech.xray.core.config;

import com.amazonaws.xray.javax.servlet.AWSXRayServletFilter;
import javax.servlet.Filter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

  @Bean
  public Filter TracingFilter() {
    return new AWSXRayServletFilter("spring-aws-xray-training");
  }
}

