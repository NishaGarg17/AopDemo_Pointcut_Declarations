package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyDemoLoggingAspect {

	@Pointcut("execution(* com.luv2code.aopdemo.*.*.*(..))")
	private void forDaoPackage() {
	}
	
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n==========>>> Executing @Before Advice on addAccount()");
	}
	@Before("forDaoPackage()")
	public void performApiAnalytics() {
		System.out.println("\n==========>>> Executing @Before Performing API Analytics()");
	}

}
