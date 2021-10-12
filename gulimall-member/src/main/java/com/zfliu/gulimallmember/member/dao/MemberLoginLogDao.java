package com.zfliu.gulimallmember.member.dao;

import com.zfliu.gulimallmember.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author zfliu
 * @email zfliu@gmail.com
 * @date 2021-10-12 11:29:31
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
