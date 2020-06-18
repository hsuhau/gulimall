package com.hsuhau.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsuhau.common.utils.PageUtils;
import com.hsuhau.gulimall.member.entity.UmsMemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author hsuhau
 * @email hsuhau@foxmail.com
 * @date 2020-06-19 06:25:46
 */
public interface UmsMemberReceiveAddressService extends IService<UmsMemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

