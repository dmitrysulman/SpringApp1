package org.dmitrysulman.spring.stepik.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.dmitrysulman.spring.stepik.aop.Book;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class SecurityAspect {
    @Before("org.dmitrysulman.spring.stepik.aop.aspects.MyPointcuts.allGetMethods2()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: Security check.");
    }

    @Before("org.dmitrysulman.spring.stepik.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());


        Object[] arguments = joinPoint.getArgs();

        for (Object object : arguments) {
            if (object instanceof Book book) {
                System.out.println(book.getAuthor());
            }
        }

        System.out.println("beforeAddSecurityAdvice: Security check.");
    }
}
