package com.atguigu.gulimall.ware.vo;

import lombok.Data;

/**
 * @author Kite
 * @date 2020/10/27
 */
@Data
public class PurchaseItemDoneVo {
    private Long itemId;
    private Integer status;
    private String reason;

}
