package com.xujinshan.gulimall.coupon.dao;

import com.xujinshan.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author xujinshan
 * @email xujinshan361@163.com
 * @date 2022-02-19 13:46:20
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
