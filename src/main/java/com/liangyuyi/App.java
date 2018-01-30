package com.liangyuyi;

import com.liangyuyi.config.AppConfig;
import com.liangyuyi.dependenceIn.OutputHelper;
import com.liangyuyi.spring.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liangyuyi on 2018/1/25
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld obj = (HelloWorld)context.getBean("helloBean");
        obj.printHello();

        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld obj1 = (HelloWorld)context1.getBean("helloBean");
        obj1.setName("liangyuyi2");
        obj1.printHello();

        ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");
        OutputHelper outputHelper = (OutputHelper)context2.getBean("outputHelper");
        outputHelper.generatorOutput();
    }
}
