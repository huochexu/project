package com.practice.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.PostConstruct;

/**
 * @ProjectName: student-demo
 * @Package: com.practice.boot
 * @ClassName: ApplicationBoot
 * @Author: dong
 * @Description: ${description}
 * @Date: 2019/9/11 19:51
 * @Version: 1.0
 */
@ImportResource(locations = {"classpath:spring/*/*.xml"})
@ComponentScan( basePackages = {"com.practice.*"})
@MapperScan("com.practice.common.mapper")
@Component("student-demo-app")
@Configuration
@SpringBootApplication
@Slf4j
public class ApplicationBoot {
    @PostConstruct
    public void start() {
        log.info("student-demo-app ApplicationBoot");
    }
}
