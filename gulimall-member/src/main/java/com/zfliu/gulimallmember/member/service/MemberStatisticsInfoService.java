package com.zfliu.gulimallmember.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zfliu.common.utils.PageUtils;
import com.zfliu.gulimallmember.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author zfliu
 * @email zfliu@gmail.com
 * @date 2021-10-12 11:29:31
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

