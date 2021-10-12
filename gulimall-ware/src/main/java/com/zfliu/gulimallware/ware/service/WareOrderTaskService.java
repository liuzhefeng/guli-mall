package com.zfliu.gulimallware.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zfliu.common.utils.PageUtils;
import com.zfliu.gulimallware.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author zfliu
 * @email zfliu@gmail.com
 * @date 2021-10-12 11:22:45
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

