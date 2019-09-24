package com.practice.configuration;

import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: student-demo
 * @Package: com.practice.configuration
 * @ClassName: Web
 * @Author: dong
 * @Description: 保留 Druid 对 SQL 方面的监控
 * @Date: 2019/9/11 19:53
 * @Version: 1.0
 */
@Configuration
public class WebConfiguration {
    @Bean
    public ServletRegistrationBean<StatViewServlet> druidServlet() {
        ServletRegistrationBean<StatViewServlet> srb = new ServletRegistrationBean<StatViewServlet>(
                new com.alibaba.druid.support.http.StatViewServlet(), "/druid/*");
        return srb;
    }
}
