package com.tenant.config;

import com.tenant.interceptor.TenantInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * SpringMVC配置类，用于过滤器注入
 * @author Wu Zicong
 * @create 2021-10-14 14:45
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private TenantInterceptor tenantContextHolder;


        @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tenantContextHolder);
    }

}
