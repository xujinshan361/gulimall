package com.xujinshan.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xujinshan.gulimall.product.entity.BrandEntity;
import com.xujinshan.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");
        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brand_id.forEach((item)-> System.out.println(item));
    }

}
