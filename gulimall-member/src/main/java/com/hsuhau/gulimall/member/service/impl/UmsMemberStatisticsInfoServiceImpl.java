package com.hsuhau.gulimall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsuhau.common.utils.PageUtils;
import com.hsuhau.common.utils.Query;
import com.hsuhau.gulimall.member.dao.UmsMemberStatisticsInfoDao;
import com.hsuhau.gulimall.member.entity.UmsMemberStatisticsInfoEntity;
import com.hsuhau.gulimall.member.service.UmsMemberStatisticsInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("umsMemberStatisticsInfoService")
public class UmsMemberStatisticsInfoServiceImpl extends ServiceImpl<UmsMemberStatisticsInfoDao, UmsMemberStatisticsInfoEntity> implements UmsMemberStatisticsInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberStatisticsInfoEntity> page = this.page(
                new Query<UmsMemberStatisticsInfoEntity>().getPage(params),
                new QueryWrapper<UmsMemberStatisticsInfoEntity>()
        );

        return new PageUtils(page);
    }

}