package com.hsuhau.gulimall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hsuhau.gulimall.member.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hsuhau
 * @email hsuhau@foxmail.com
 * @date 2020-06-19 08:59:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
