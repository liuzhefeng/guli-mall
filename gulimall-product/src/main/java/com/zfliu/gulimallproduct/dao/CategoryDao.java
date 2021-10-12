package com.zfliu.gulimallproduct.dao;

import com.zfliu.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zfliu
 * @email 111@gmail.com
 * @date 2021-10-11 16:47:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
