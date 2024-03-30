package com.laboratory.spring.aop.packagebased;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class PackageAspect {

    // 대상: com.laboratory.spring.aop.method 에 속한 모든 클래스
    @Pointcut("within(com.laboratory.spring.aop.packagebased.*)")
    private void withinPackage() {
    }

    @Before("withinPackage()")
    private void before(JoinPoint joinPoint) {
        log.info("PackageAOP before {}", joinPoint.getSignature().toShortString());
    }

}
