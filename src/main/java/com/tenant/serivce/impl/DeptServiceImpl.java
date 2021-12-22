package com.tenant.serivce.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tenant.entity.pojo.Dept;
import com.tenant.mapper.DeptMapper;
import com.tenant.serivce.DeptService;
import org.springframework.stereotype.Service;

/**
 * @author Wu Zicong
 * @create 2021-12-22 15:00
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {
}
