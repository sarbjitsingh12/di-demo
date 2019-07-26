package com.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    public static final String hello = "HELLO!!!-- From Original Greeting Service impl";

    @Override
    public String sayGreeting() {
        return hello;
    }
}
