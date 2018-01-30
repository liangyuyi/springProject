package com.liangyuyi.config;

import com.liangyuyi.spring.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liangyuyi on 2018/1/28
 */
@Configuration
public class AppConfig {
    @Bean(name = "helloBean")
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
