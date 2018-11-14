package com.example.springbootapollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableApolloConfig
@SpringBootApplication
public class SpringbootapolloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootapolloApplication.class, args);
    }
}
