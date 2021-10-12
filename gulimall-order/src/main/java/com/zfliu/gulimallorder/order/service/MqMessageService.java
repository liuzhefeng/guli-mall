package com.zfliu.gulimallorder.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zfliu.common.utils.PageUtils;
import com.zfliu.gulimallorder.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author zfliu
 * @email zfliu@gmail.com
 * @date 2021-10-12 11:15:47
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

