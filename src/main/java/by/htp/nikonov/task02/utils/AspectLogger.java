package by.htp.nikonov.task02.utils;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class AspectLogger {
	
	@Pointcut("execution(* by.htp.nikonov.task02.service.impl.*.*(..))")
	public void serviceMethod() {}
	
	@Pointcut("execution(* by.htp.nikonov.task02.DAO.impl.*.*(..))")
	public void daoMethod() {}
	
	@Before("serviceMethod() || daoMethod()")
	public void logginBeforeServiceMethod(JoinPoint point) {
			
		Logger logger= Logger.getLogger(point.getSignature().getDeclaringType());
		logger.info(point.getSignature().getName()+": started");				
				
	}
	
	@After("serviceMethod()  || daoMethod()")
	public void logginAfterServiceMethod(JoinPoint point) {
			
		Logger logger= Logger.getLogger(point.getSignature().getDeclaringType());
		logger.info(point.getSignature().getName()+": finished");				
				
	}

}
