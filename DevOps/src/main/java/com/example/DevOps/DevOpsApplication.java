package com.example.DevOps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevOpsApplication {
    private static final Logger logger = LoggerFactory.getLogger(DevOpsApplication.class);

    public static void main(String[] args) {
        logger.info("main method");
        SpringApplication.run(DevOpsApplication.class, args);
    }

}
