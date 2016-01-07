package com.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class PostConstructAspect {

    @Around("@annotation(javax.annotation.PostConstruct)")
    public void myAdvice(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("This is before " + jp.getSignature().getName() + "()");
        jp.proceed();
    }
}