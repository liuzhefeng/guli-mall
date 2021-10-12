package com.zfliu.gulimallorder.order.dao;

import com.zfliu.gulimallorder.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zfliu
 * @email zfliu@gmail.com
 * @date 2021-10-12 11:15:47
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
