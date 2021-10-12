package com.zfliu.gulimallproduct;

import com.zfliu.gulimallproduct.entity.BrandEntity;
import com.zfliu.gulimallproduct.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("第一品牌");
        brandEntity.setLogo("www.baidu.com");
        brandEntity.setName("爆米花");
        brandEntity.setFirstLetter("B");
        brandEntity.setShowStatus(1);
        brandEntity.setSort(1);
        brandService.save(brandEntity);
        System.out.println("保存成功。。。。。。");
    }

    @Test
    void update() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(13L);
        brandEntity.setDescript("第二品牌");
        brandEntity.setSort(1);
        brandService.updateById(brandEntity);
        System.out.println("修改成功。。。。。。");
    }

    @Test
    void delete() {
        brandService.removeById(14L);
        System.out.println("删除成功。。。。。。");
    }

    @Test
    void query() {
        List<BrandEntity> list = brandService.list();
        for (BrandEntity brandEntity : list) {
            System.out.println(brandEntity);
        }
        System.out.println("查询成功。。。。。。");
    }
}
