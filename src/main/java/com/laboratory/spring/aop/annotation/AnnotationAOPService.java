package com.laboratory.spring.aop.annotation;

import org.springframework.stereotype.Service;

@Service
public class AnnotationAOPService {

    @AnnotationAOP
    public void test() {
    }

}
