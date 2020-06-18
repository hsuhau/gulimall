package com.hsuhau.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsuhau.common.utils.PageUtils;
import com.hsuhau.common.utils.Query;
import com.hsuhau.gulimall.ware.dao.WmsWareSkuDao;
import com.hsuhau.gulimall.ware.entity.WmsWareSkuEntity;
import com.hsuhau.gulimall.ware.service.WmsWareSkuService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("wmsWareSkuService")
public class WmsWareSkuServiceImpl extends ServiceImpl<WmsWareSkuDao, WmsWareSkuEntity> implements WmsWareSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsWareSkuEntity> page = this.page(
                new Query<WmsWareSkuEntity>().getPage(params),
                new QueryWrapper<WmsWareSkuEntity>()
        );

        return new PageUtils(page);
    }

}