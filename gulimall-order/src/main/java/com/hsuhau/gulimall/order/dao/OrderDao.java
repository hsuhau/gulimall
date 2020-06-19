package com.hsuhau.gulimall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hsuhau.gulimall.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hsuhau
 * @email hsuhau@foxmail.com
 * @date 2020-06-19 09:01:32
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
