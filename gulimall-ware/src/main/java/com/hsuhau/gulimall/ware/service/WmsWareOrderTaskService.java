package com.hsuhau.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hsuhau.common.utils.PageUtils;
import com.hsuhau.gulimall.ware.entity.WmsWareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author hsuhau
 * @email hsuhau@foxmail.com
 * @date 2020-06-19 06:23:51
 */
public interface WmsWareOrderTaskService extends IService<WmsWareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

