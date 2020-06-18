package com.hsuhau.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsuhau.common.utils.PageUtils;
import com.hsuhau.gulimall.order.entity.OmsRefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author hsuhau
 * @email hsuhau@foxmail.com
 * @date 2020-06-19 06:21:58
 */
public interface OmsRefundInfoService extends IService<OmsRefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

