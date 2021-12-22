package com.tenant.controller;
import com.tenant.entity.pojo.Dept;
import com.tenant.serivce.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Wu Zicong
 * @create 2021-12-22 14:52
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @GetMapping("/select")
    public String selectDept(){
        List<Dept> list = deptService.list();
        return list.toString();
    }
}
