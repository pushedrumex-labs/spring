package com.laboratory.spring.aop.beanname;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class BeanNameAspect {

    // 대상: 이름이 NameAOP 으로 끝나는 빈
    @Pointcut("bean(*NameAOP)")
    private void beanName() {
    }

    @Before("beanName()")
    private void before(JoinPoint joinPoint) {
        log.info("BeanNameAOP before {}", joinPoint.getSignature().toShortString());
    }

}
