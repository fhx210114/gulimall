package com.atguigu.gulimall.thirdpaty;






import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.MatchMode;
import com.aliyun.oss.model.PolicyConditions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GulimallThirdPatyApplicationTests {


    @Resource
    OSS ossClient;

    @Value("${spring.cloud.alicloud.oss.endpoint}")
    private String endpoint;

    @Value("${spring.cloud.alicloud.oss.bucket}")
    private String bucket;

    @Value("${spring.cloud.alicloud.access-key}")
    private String accessId;

    @Value("${spring.cloud.alicloud.secret-key}")
    private String accessKeySecret;

    @Test
    public  void update() throws FileNotFoundException {


        InputStream inputStream = new FileInputStream("C:\\Users\\86185\\Pictures\\Camera Roll\\RUbeN8NHFbwRkkH4-AuKbQ.jpg");
        ossClient.putObject("gulimall-kites", "bbb", inputStream);
        // 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("上传成功");
    }
}
