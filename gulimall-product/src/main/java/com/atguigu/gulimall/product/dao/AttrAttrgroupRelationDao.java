package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrAttrgroupRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 属性&属性分组关联
 * 
 * @author kite
 * @email fhx210114@gmail.com
 * @date 2020-09-24 19:30:42
 */
@Mapper
public interface AttrAttrgroupRelationDao extends BaseMapper<AttrAttrgroupRelationEntity> {

    void deleteBatChRelation(@Param("entities") List<AttrAttrgroupRelationEntity> entities);
}
