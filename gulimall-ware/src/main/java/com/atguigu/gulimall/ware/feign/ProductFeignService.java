package com.atguigu.gulimall.ware.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Kite
 * @date 2020/10/27
 */
@FeignClient("gulimall-product")
public interface ProductFeignService {

    /**
     * 查询指定商品
     * @param skuId
     * @return
     */
    @GetMapping("/product/spuinfo/info/{skuId}")
    public R info(@PathVariable("skuId") Long skuId);
}
