package com.mimaraslan.app;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsPipelineSpringBootApplicationTests {

    static Logger logger = LoggerFactory.getLogger(DevopsPipelineSpringBootApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test executeing...");
    }

}
