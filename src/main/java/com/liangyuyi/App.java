package com.liangyuyi;

import com.liangyuyi.spring.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liangyuyi on 2018/1/25
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld obj = (HelloWorld)context.getBean("helloBean");
        obj.printHello();
    }
}
