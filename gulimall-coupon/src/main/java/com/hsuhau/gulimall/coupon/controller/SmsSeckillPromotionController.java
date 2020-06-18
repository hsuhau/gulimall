package com.hsuhau.gulimall.coupon.controller;

import com.hsuhau.common.utils.PageUtils;
import com.hsuhau.common.utils.R;
import com.hsuhau.gulimall.coupon.entity.SmsSeckillPromotionEntity;
import com.hsuhau.gulimall.coupon.service.SmsSeckillPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;



/**
 * 秒杀活动
 *
 * @author hsuhau
 * @email hsuhau@foxmail.com
 * @date 2020-06-19 06:29:14
 */
@RestController
@RequestMapping("coupon/smsseckillpromotion")
public class SmsSeckillPromotionController {
    @Autowired
    private SmsSeckillPromotionService smsSeckillPromotionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsSeckillPromotionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SmsSeckillPromotionEntity smsSeckillPromotion = smsSeckillPromotionService.getById(id);

        return R.ok().put("smsSeckillPromotion", smsSeckillPromotion);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SmsSeckillPromotionEntity smsSeckillPromotion){
		smsSeckillPromotionService.save(smsSeckillPromotion);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SmsSeckillPromotionEntity smsSeckillPromotion){
		smsSeckillPromotionService.updateById(smsSeckillPromotion);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		smsSeckillPromotionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
