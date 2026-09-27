package com.probestack.forgestudio.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.probestack.forgestudio.design.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Query Lens")
                                .description("Database query performance intelligence platform for the ForgeSphere  ecosystem. Captures slow queries from all databases, analyzes execution  plans, detects anti-patterns (N+1, full scans, missing indexes), and  provides ranked optimization recommendations with projected impact.  Turns 3-hour debugging sessions into 30-second decisions. Zero code  changes required — pure observability on top of existing databases. ")
                                .contact(
                                        new Contact()
                                                .name("ForgeSphere Database Reliability")
                                                .email("querylens@forgesphere.example.com")
                                )
                                .version("1.0.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                )
                )
        ;
    }
}
