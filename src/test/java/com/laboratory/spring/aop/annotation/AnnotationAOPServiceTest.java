package com.laboratory.spring.aop.annotation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnnotationAOPServiceTest {

    @Autowired
    AnnotationAOPService annotationAopService;

    @Test
    void annotationAOP() {
        annotationAopService.test();
    }

}