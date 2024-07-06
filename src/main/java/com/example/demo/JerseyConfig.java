package com.example.demo;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/resource")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(UserApiService.class);
    }
}