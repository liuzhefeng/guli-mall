package com.zfliu.gulimallmember.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zfliu.common.utils.PageUtils;
import com.zfliu.gulimallmember.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author zfliu
 * @email zfliu@gmail.com
 * @date 2021-10-12 11:29:31
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

