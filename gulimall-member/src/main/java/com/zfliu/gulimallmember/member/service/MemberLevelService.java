package com.zfliu.gulimallmember.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zfliu.common.utils.PageUtils;
import com.zfliu.gulimallmember.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author zfliu
 * @email zfliu@gmail.com
 * @date 2021-10-12 11:29:31
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

