package com.xujinshan.gulimall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xujinshan.common.utils.PageUtils;
import com.xujinshan.common.utils.Query;

import com.xujinshan.gulimall.order.dao.OmsOrderOperateHistoryDao;
import com.xujinshan.gulimall.order.entity.OmsOrderOperateHistoryEntity;
import com.xujinshan.gulimall.order.service.OmsOrderOperateHistoryService;


@Service("omsOrderOperateHistoryService")
public class OmsOrderOperateHistoryServiceImpl extends ServiceImpl<OmsOrderOperateHistoryDao, OmsOrderOperateHistoryEntity> implements OmsOrderOperateHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsOrderOperateHistoryEntity> page = this.page(
                new Query<OmsOrderOperateHistoryEntity>().getPage(params),
                new QueryWrapper<OmsOrderOperateHistoryEntity>()
        );

        return new PageUtils(page);
    }

}