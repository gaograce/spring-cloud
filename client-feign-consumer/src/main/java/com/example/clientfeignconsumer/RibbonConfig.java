package com.example.clientfeignconsumer;

//import com.netflix.loadbalancer.IRule;
//import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//新版本不使用ribbon了
@Configuration
public class RibbonConfig {
    /*@Bean
    public IRule getRibbonRule() {
        return new RandomRule();
    }*/
}
