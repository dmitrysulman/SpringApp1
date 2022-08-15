package org.dmitrysulman.spring.stepik.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethods() {}

//    @Before("execution(public void org.dmitrysulman.spring.stepik.aop.UniLibrary.getBook())")
//    @Before("execution(public void get*(String))")
//    @Before("execution(public void get*(*))")
//    @Before("execution(public void getBook(org.dmitrysulman.spring.stepik.aop.Book, ..))")
//    @Before("execution(public void get*(..))")
    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: get book or magazine attempt");
    }

//    @Before("execution(* get*())")
    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: Security check.");
    }

    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: return book attempt");
    }

    @AfterReturning(value = "execution(* testMethod())", returning = "testString")
    private void afterReturningTestMethodAdvice(StringBuilder testString) {
        System.out.println("After returning " + testString);
        testString.append(" HE!!");
    }

    @AfterThrowing(value = "execution(* testMethod())", throwing = "exception")
    private void afterThrowingTestMethodAdvice(Throwable exception) {
        System.out.println("EXCEPTION! " + exception);
    }
}