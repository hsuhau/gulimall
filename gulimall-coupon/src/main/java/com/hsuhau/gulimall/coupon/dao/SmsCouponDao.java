package com.hsuhau.gulimall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hsuhau.gulimall.coupon.entity.SmsCouponEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hsuhau
 * @email hsuhau@foxmail.com
 * @date 2020-06-19 06:29:14
 */
@Mapper
public interface SmsCouponDao extends BaseMapper<SmsCouponEntity> {
	
}
