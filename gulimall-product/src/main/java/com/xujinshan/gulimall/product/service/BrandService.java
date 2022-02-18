package com.xujinshan.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xujinshan.common.utils.PageUtils;
import com.xujinshan.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author xujinshan
 * @email xujinshan361@163.com
 * @date 2022-02-18 22:21:03
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

