package com.kob.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // 允许跨域访问的路径
                .allowedOrigins("http://localhost:8080")  // 允许跨域请求的来源
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")  // 允许请求的方法
                .maxAge(3600)  // 预检请求的有效期
                .allowCredentials(true)  // 是否允许发送cookie
                .allowedHeaders("*");  // 允许头部设置
    }
}
