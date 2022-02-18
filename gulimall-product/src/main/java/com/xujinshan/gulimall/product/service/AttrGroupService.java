package com.xujinshan.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xujinshan.common.utils.PageUtils;
import com.xujinshan.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author xujinshan
 * @email xujinshan361@163.com
 * @date 2022-02-18 22:21:03
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

