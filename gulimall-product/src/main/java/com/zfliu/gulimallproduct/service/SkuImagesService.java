package com.zfliu.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zfliu.common.utils.PageUtils;
import com.zfliu.gulimallproduct.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author zfliu
 * @email 111@gmail.com
 * @date 2021-10-11 16:47:03
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
