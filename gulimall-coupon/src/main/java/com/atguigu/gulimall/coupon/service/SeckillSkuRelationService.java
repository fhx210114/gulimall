package com.atguigu.gulimall.coupon.service;

import com.atguigu.common.to.SkuReductionTo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author kite
 * @email fhx210114@gmail.com
 * @date 2020-09-25 14:11:51
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);


}

