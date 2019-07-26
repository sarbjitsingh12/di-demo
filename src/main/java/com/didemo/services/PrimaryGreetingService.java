package com.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"}) //if you have 2 primary and you wanna do profile, you have to have 2 profile in each of the
//classes and active whichever one you wanna run in the properties file using spring.profiles.active="en" or "es" in this case and set equals to what you wanna get
public class PrimaryGreetingService implements GreetingService {
    private GreetingRepository greetingRepository;

    //Don't need to autowire this because it is a constructor based dependency Injection and it autowires automatically
    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
