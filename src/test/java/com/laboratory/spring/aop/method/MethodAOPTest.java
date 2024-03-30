package com.laboratory.spring.aop.method;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MethodAOPTest {

    @Autowired
    MethodAOP methodAOP;

    @Test
    void methodAOP() {
        methodAOP.test();
    }

}