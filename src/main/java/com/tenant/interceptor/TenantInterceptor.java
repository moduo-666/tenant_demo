package com.tenant.interceptor;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.tenant.util.TenantUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 拦截器，拦截tenant_id字段
 * @author Wu Zicong
 * @create 2021-12-21 17:17
 */
@Component
public class TenantInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String tenant = request.getParameter("tenant_id");
        if(StringUtils.isNotBlank(tenant)){
            TenantUtil.setTenantThread(tenant);
        }
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        TenantUtil.remove();
    }
}
