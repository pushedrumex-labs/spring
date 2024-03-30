package com.laboratory.spring.aop.annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class AnnotationAspect {

    // 대상: @AnnotationAOP 애노테이션이 붙은 메서드
    @Pointcut("@annotation(com.laboratory.spring.aop.annotation.AnnotationAOP)")
    private void annotation() {
    }

    @Before("annotation()")
    private void before(JoinPoint joinPoint) {
        log.info("AnnotationAOP before {}", joinPoint.getSignature().toShortString());
    }

}
