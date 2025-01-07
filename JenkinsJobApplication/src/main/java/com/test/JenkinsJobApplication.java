package com.test;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsJobApplication {
    private static final Logger logger = LoggerFactory.getLogger(JenkinsJobApplication.class);

    @PostConstruct
    public void init() {
        logger.info("welcome to jenkins...!");
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsJobApplication.class, args);
    }

}
