package com.tenant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wu Zicong
 * @create 2021-12-22 9:37
 */
@RestController
@RequestMapping("/tenant")
public class TenantController {
    @GetMapping("/demo")
    public String demo(){
        return "hello";
    }
}
