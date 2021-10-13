package com.zfliu.gulimallcoupon.coupon.dao;

import com.zfliu.gulimallcoupon.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 *
 * @author zfliu
 * @email zfliu@gmail.com
 * @date 2021-10-12 10:59:17
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {

}
