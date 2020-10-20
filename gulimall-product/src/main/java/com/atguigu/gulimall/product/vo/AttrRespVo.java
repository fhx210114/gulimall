package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * @author Kite
 * @date 2020/10/19
 */
@Data
public class AttrRespVo extends AttrVo {

    /**
     * 所属分类名字
     */
    private String catelogName;

    /**
     * 所属分组名字
     */
    private  String groupName;
}
