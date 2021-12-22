package com.tenant.util;

/**
 * @author Wu Zicong
 * @create 2021-10-29 15:02
 */
public class TenantUtil {
    private final static ThreadLocal<String> tenantThread = new ThreadLocal<>();

    public static void setTenantThread(String id){
        tenantThread.set(id);
    }
    public static String getTenantThread(){
       return tenantThread.get();
    }
    public static void remove(){
        tenantThread.remove();
    }
}
