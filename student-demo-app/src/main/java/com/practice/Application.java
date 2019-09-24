package com.practice;

import com.practice.boot.ApplicationBoot;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ProjectName: profiledemo
 * @Package: com.pds
 * @ClassName: app
 * @Author: dong
 * @Description: ${description}
 * @Date: 2019/9/9 12:57
 * @Version: 1.0
 */
@SpringBootApplication
@Slf4j
public class Application {
    public static void main(String[] args) {
        try {
            ConfigurableApplicationContext ctx = SpringApplication.run(ApplicationBoot.class, args);
            String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
            for (String profile : activeProfiles) {
                log.info("Spring Boot 使用profile为:{}" , profile);
            }
        } catch (Throwable t) {
            log.error("启动失败", t);
            throw t;
        }
    }
}
