package org.dmitrysulman.spring.stepik.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* get*())")
    public void allGetMethods2() {}

    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {}
}
