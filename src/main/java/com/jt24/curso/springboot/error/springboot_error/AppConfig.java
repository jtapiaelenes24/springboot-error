package com.jt24.curso.springboot.error.springboot_error;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jt24.curso.springboot.error.springboot_error.models.domain.User;

@Configuration
public class AppConfig {

    @Bean
    List<User> users() {

        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Marge", "Simpson"));
        users.add(new User(2L, "Homer", "Simpson"));
        users.add(new User(3L, "Bart", "Simpson"));
        users.add(new User(4L, "Lisa", "Simpson"));
        users.add(new User(5L, "Maggie", "Simpson"));

        return users;

    }

}
