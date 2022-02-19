package com.xujinshan.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.整合mybatis-plus
 *      1)导入依赖
 *      2)配置
 *          配置数据源
 *              导入数据库的依赖
 *              在application.yml 配置数据源相关信息
 *          配置mybatis-plus
 *              使用MapperScan
 *
 *
 */
@MapperScan("com.xujinshan.gulimall.product.dao")
@EnableDiscoveryClient //开启Nacos 服务注册与发现
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
