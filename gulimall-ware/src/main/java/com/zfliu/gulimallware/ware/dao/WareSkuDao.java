package com.zfliu.gulimallware.ware.dao;

import com.zfliu.gulimallware.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zfliu
 * @email zfliu@gmail.com
 * @date 2021-10-12 11:22:45
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
