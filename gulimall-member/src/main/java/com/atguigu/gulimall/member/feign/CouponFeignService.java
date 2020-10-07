package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Kite
 * @date 2020/9/27
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
//TODO 梵蒂冈
    @RequestMapping("coupon/coupon/member/coupon")
    public R findCoupon();


}
