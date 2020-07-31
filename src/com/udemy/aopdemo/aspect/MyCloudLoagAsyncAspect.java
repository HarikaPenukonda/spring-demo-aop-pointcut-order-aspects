package com.udemy.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyCloudLoagAsyncAspect {
	
	@Before("com.udemy.aopdemo.aspect.AopExpressions.forDaoPackageNoGetterSetter()") // Apply pointcut declaration to advice
	public void LogToClundAsync() 
	{
		System.out.println("\n===> Logging to Cloud in async fashion ");
		
	}

}
