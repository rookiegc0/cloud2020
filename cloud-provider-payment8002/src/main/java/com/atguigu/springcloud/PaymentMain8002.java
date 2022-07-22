package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created on 2022/7/19.
 *
 * @author Chen Gao
 */
@SpringBootApplication
@EnableEurekaClient
//@ComponentScan(basePackages = {"com.atguigu.springcloud.dao"})
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
