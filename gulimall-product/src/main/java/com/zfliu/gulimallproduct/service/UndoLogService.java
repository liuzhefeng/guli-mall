package com.zfliu.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zfliu.common.utils.PageUtils;
import com.zfliu.gulimallproduct.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author zfliu
 * @email 111@gmail.com
 * @date 2021-10-11 16:47:02
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

