package com.example.springboottest03;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class CustomServletContainer implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        factory.setPort(8081);
        Set<ErrorPage> errorSet = new HashSet<>();
        errorSet.add(new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"));
        factory.setErrorPages(errorSet);
    }
}
