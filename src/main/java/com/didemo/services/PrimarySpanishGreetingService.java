package com.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary //this primary won't cause conflict cause when spring see this, the profile is not active
//in the application file so it doesn't see that
public class PrimarySpanishGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    //Don't need to autowire this because it is a constructor based dependency Injection and it autowires automatically
    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
