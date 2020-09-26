package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author kite
 * @email fhx210114@gmail.com
 * @date 2020-09-26 10:53:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
