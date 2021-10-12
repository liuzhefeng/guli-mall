package com.zfliu.gulimallproduct.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zfliu.common.utils.PageUtils;
import com.zfliu.gulimallproduct.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author zfliu
 * @email zfliu@gmail.com
 * @date 2021-10-12 11:20:01
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

