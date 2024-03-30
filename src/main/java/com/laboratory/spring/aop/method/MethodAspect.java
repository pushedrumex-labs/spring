package com.laboratory.spring.aop.method;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class MethodAspect {

    // 대상: com.laboratory.spring.aop.method 에 속한 모든 메소드
    @Pointcut("execution(* com.laboratory.spring.aop.method.*.*(..))")
    private void method() {
    }

    @Before("method()")
    private void before(JoinPoint joinPoint) {
        log.info("MethodAOP before {}", joinPoint.getSignature().toShortString());
    }

}
