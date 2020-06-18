package com.hsuhau.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsuhau.common.utils.PageUtils;
import com.hsuhau.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author hsuhau
 * @email hsuhau@foxmail.com
 * @date 2020-06-19 01:29:03
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

