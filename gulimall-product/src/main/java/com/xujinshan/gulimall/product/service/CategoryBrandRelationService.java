package com.xujinshan.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xujinshan.common.utils.PageUtils;
import com.xujinshan.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author xujinshan
 * @email xujinshan361@163.com
 * @date 2022-02-18 22:21:03
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

