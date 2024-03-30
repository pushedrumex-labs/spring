package com.laboratory.spring.aop.packagebased;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PackageAOPTest {

    @Autowired
    PackageAOP packageAOP;

    @Test
    void packageAOP() {
        packageAOP.test();
    }

}
