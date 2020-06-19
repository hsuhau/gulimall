package com.hsuhau.gulimall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hsuhau.gulimall.coupon.entity.CouponEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hsuhau
 * @email hsuhau@foxmail.com
 * @date 2020-06-19 08:56:57
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
