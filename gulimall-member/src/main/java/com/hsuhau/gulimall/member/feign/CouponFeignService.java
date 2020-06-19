package com.hsuhau.gulimall.member.feign;

import com.hsuhau.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author hsuhau
 * @date 2020/6/19 9:23
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @GetMapping("/coupon/coupon/member/list")
    R memberCoupons();
}
