package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author kite
 * @email fhx210114@gmail.com
 * @date 2020-09-26 11:41:54
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
