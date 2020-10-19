package com.atguigu.gulimall.product.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Kite
 * @date 2020/10/18
 */
@Configuration
@EnableTransactionManagement //开启事务控制
@MapperScan("com.atguigu.gulimall.product.dao")
public class MybatisConfig {

    //引入分页插件
    @Bean
    public PaginationInterceptor paginationInnerInterceptor(){

        PaginationInterceptor paginationInnerInterceptor = new PaginationInterceptor();
        //设置请求页面大于最大页后操作 ， true调回到首页，false 继续请求 默认 false
        paginationInnerInterceptor.setOverflow(true);
        //设置最大单页数量，默认500天 -1不要现在
        paginationInnerInterceptor.setLimit(1000);

        return paginationInnerInterceptor;
    }
}
