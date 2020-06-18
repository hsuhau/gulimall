package com.hsuhau.gulimall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hsuhau.gulimall.coupon.entity.SmsCouponHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author hsuhau
 * @email hsuhau@foxmail.com
 * @date 2020-06-19 06:29:14
 */
@Mapper
public interface SmsCouponHistoryDao extends BaseMapper<SmsCouponHistoryEntity> {
	
}
