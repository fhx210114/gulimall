package com.atguigu.gulimall.product;


import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.atguigu.gulimall.product.service.BrandService;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GulimallProductApplicationTests {


    @Autowired
    BrandService brandService;

//    @Autowired
//    OSSClient ossClient;




    @Test
    public  void update() throws FileNotFoundException {
            // Endpoint以杭州为例，其它Region请按实际情况填写。
         String endpoint = "oss-cn-beijing.aliyuncs.com";
        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
        String accessKeyId = "LTAI4G9j9eehHMmFKB1ciJu9";
        String accessKeySecret = "TrSy4RYMGAIKWLh8U80oSLT4OUj6T0";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
         //上传文件流。
        InputStream inputStream = new FileInputStream("C:\\Users\\86185\\Pictures\\Camera Roll\\RUbeN8NHFbwRkkH4-AuKbQ.jpg");
        ossClient.putObject("gulimall-kites", "Raa", inputStream);
        // 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("上传成功");
    }
    @Test
    void contextLoads() {


//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setName("苹果");
////        brandEntity.setName("苹果");
////        brandService.save(brandEntity);
////
////        System.out.println("保存成功");
//        brandService.updateById(brandEntity);


//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
//
//        list.forEach(
//                (item)->{
//                    System.out.println(item);
//                }
//        );




    }

}
