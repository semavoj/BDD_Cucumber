package com.cucumberspringboot.plants;

import com.cucumberspringboot.plants.data.Plant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Configuration
@ComponentScan("com.cucumberspringboot.plants")
public class Config {

    @Bean
    @Scope(SCOPE_CUCUMBER_GLUE)
    public Plant getPlant() {
        return new Plant();
    }
}