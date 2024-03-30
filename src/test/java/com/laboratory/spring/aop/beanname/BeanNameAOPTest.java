package com.laboratory.spring.aop.beanname;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeanNameAOPTest {

    @Autowired
    BeanNameAOP beanNameAOP;

    @Test
    void beanNameAOP() {
        beanNameAOP.test();
    }

}
