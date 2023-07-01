package com.mimaraslan.app;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsPipelineSpringBootApplication {


    static Logger logger = LoggerFactory.getLogger(DevopsPipelineSpringBootApplication.class);

    @PostConstruct
    public void getInitInfo(){
        logger.info("===> App started... <===");
    }


    public static void main(String[] args) {
        logger.info("===> App executed... <===");
        SpringApplication.run(DevopsPipelineSpringBootApplication.class, args);
    }

}
