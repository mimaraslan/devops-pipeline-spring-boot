package com.mimaraslan;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppMainTests {

    static Logger logger = LoggerFactory.getLogger(AppMainTests.class);

    @Test
    void contextLoads() {
        logger.info("===> Test executeing... <===");
    }

}
