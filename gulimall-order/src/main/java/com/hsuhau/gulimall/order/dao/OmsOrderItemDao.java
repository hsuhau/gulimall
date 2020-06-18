package com.hsuhau.gulimall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hsuhau.gulimall.order.entity.OmsOrderItemEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author hsuhau
 * @email hsuhau@foxmail.com
 * @date 2020-06-19 06:21:58
 */
@Mapper
public interface OmsOrderItemDao extends BaseMapper<OmsOrderItemEntity> {
	
}
