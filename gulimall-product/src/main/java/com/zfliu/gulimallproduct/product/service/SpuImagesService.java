package com.zfliu.gulimallproduct.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zfliu.common.utils.PageUtils;
import com.zfliu.gulimallproduct.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author zfliu
 * @email zfliu@gmail.com
 * @date 2021-10-12 11:20:01
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

