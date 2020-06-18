package com.hsuhau.gulimall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsuhau.common.utils.PageUtils;
import com.hsuhau.common.utils.Query;
import com.hsuhau.gulimall.order.dao.OmsOrderOperateHistoryDao;
import com.hsuhau.gulimall.order.entity.OmsOrderOperateHistoryEntity;
import com.hsuhau.gulimall.order.service.OmsOrderOperateHistoryService;
import org.springframework.stereotype.Service;

import java.util.Map;


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