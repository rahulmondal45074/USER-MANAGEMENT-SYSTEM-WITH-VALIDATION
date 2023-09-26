package com.example.JobProject1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanBag {

    @Bean
    public List<User> getUserSource(){
        return new ArrayList<>();
    }
}
