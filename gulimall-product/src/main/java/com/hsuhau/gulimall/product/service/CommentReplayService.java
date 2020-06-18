package com.hsuhau.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsuhau.common.utils.PageUtils;
import com.hsuhau.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author hsuhau
 * @email hsuhau@foxmail.com
 * @date 2020-06-19 01:29:03
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

