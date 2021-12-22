package com.tenant.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Wu Zicong
 * @create 2021-12-22 14:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {

    private Long id;

    private String deptName;

    private String tenantId;
}
