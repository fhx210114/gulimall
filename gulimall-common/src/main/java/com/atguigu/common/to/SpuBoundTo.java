package com.atguigu.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Kite
 * @date 2020/10/26
 */
@Data
public class SpuBoundTo {
    private  Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;

}
