package com.xujinshan.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableDiscoveryClient // 开启Nacos 服务注册发现
@SpringBootApplication
/**
 * 使用nacos作为配置中心进行统一管理
 *  1.引入依赖
 *  2.创建一个bootstrap.properties 文件并写应用名和配置中心地址
 *  3.需要给配置中心默认添加一个数据集(data ID :)gulimall-coupon.properties
 *  默认规则：应用名.properties
 *  4.给应用名.properties 添加任何配置
 *  5.动态获取配置
 *      @RefreshScope动态刷新配置
 *       @Value ("${}")获取配置值
 *   配置中心有的优先使用配置中心，如果配置中心和本地都配置了相同的，则优先使用配置中心的
 *
 * 细节：
 * 1.命名空间：
 *      默认public (保留空间)，默认新增的配置都是在public空间
 *      1.开发，测试，生产：利用命名空间来做环境隔离
 *      注意：在bootstrap.properties ；配置需要哪个命名空间下的配置
 *      spring.cloud.nacos.config.namespace=0fb180a5-ea7d-44e0-8af9-5467af6f3314
 *      2.每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，
 *      只加载自己下面的命名空间。
 *
 * 2.配置集：所有配置的集合
 * 3. 配置集ID：类似文件名
 *   Data ID：类似文件名
 *
 * 4.配置分组
 *   默认所有的配置集都属于：DEFAULT_GROUP
 *
 * 每个微服务有自己的命名空间，使用配置分组区分环境，dev环境，test环境，prod环境
 * 3.
 */
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
