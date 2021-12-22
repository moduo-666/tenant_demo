package com.tenant.entity.properties;

/**
 * 租户属性
 * @author Wu Zicong
 * @create 2021-12-21 10:49
 */
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.List;

@Data
@Component
//读取配置文件tenant内容
@ConfigurationProperties(prefix = "tenant")
public class TenantProperties {

    /**
     * 是否开启租户模式
     */
    private Boolean enable;

    /**
     * 需要排除的多租户的表
     */
    private List<String> ignoreTables;

    /**
     * 多租户字段名称
     */
    private String column;

    /**
     * 排除不进行租户隔离的sql
     * 样例全路径：vip.mate.system.mapper.UserMapper.findList
     */
    private List<String> ignoreSqls;
}

