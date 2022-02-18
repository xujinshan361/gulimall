package com.xujinshan.gulimall.product.dao;

import com.xujinshan.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xujinshan
 * @email xujinshan361@163.com
 * @date 2022-02-18 22:21:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
