package com.suixingpay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: newsoringcloud
 * @description:
 * @author: zheng_y
 * @create: 2019-03-05 14:10
 **/
@SpringBootApplication
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/foo")
    public String hi(){
        return foo;
    }
}