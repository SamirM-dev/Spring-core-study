package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {
    @Pointcut("execution(* org.example.service.*.*(..))")
    public void pointCutMethod(){}

    @Before("pointCutMethod()")
    public void loggingBefore(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] methodArgs = joinPoint.getArgs();
        System.out.println("[BEFORE] Вызван метод: " + methodName + " с аргументами: " + Arrays.toString(methodArgs));
    }

    @Around("pointCutMethod()")
    public Object runningTime(ProceedingJoinPoint joinPoint) throws Throwable{
        String methodName = joinPoint.getSignature().getName();
        long startTime = System.currentTimeMillis();
        Object result=null;
        try {
            result = joinPoint.proceed();
        }
        finally {
            long runTime = System.currentTimeMillis()-startTime;
            System.out.println("[AROUND] Метод " + methodName + " выполнялся " + runTime + " мс");
        }
        return result;
    }

    @AfterThrowing(pointcut = "pointCutMethod()",throwing = "ex")
    public void loggingAfterThrowing(JoinPoint joinPoint,Exception ex){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[AFTER_THROWING] Метод " + methodName + " выбросил исключение: " + ex.getMessage());
    }

}
