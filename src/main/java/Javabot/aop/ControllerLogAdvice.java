package Javabot.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Slf4j
@Aspect
@Component
public class ControllerLogAdvice {

    @Pointcut("execution(public * Javabot.controller.*.*())")
    public void callController(){

    }
    @Before("callController()")
    public void beforeController(JoinPoint joinPoint){
        List<String> args = Arrays.stream(joinPoint.getArgs())
                .map(Object::toString)
                .toList();
        log.info("Call{} with args{}", joinPoint.getSignature().getName(), args);
    }


}
