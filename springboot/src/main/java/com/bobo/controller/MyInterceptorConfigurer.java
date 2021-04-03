package com.bobo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyInterceptorConfigurer implements WebMvcConfigurer {

    @Autowired
    MyInteceptor myInteceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //这种方式会拦截所有请求
        registry.addInterceptor(myInteceptor);
    }
}