package com.atguigu.gulimall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


import com.atguigu.gulimall.product.entity.ProductAttrValueEntity;
import com.atguigu.gulimall.product.service.ProductAttrValueService;
import com.atguigu.gulimall.product.vo.AttrRespVo;
import com.atguigu.gulimall.product.vo.AttrVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.atguigu.gulimall.product.service.AttrService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 商品属性
 *
 * @author kite
 * @email fhx210114@gmail.com
 * @date 2020-09-25 10:57:49
 */
@RestController
@RequestMapping("product/attr")
public class AttrController {
    @Autowired
    private AttrService attrService;

    @Autowired
    ProductAttrValueService attrValueService;


    /**
     * 回显规格
     * @param spuId
     * @return
     */
    @GetMapping("base/listforspu/{spuId}")
    public R baseAttrListForspu(@PathVariable("spuId")Long spuId){
        List<ProductAttrValueEntity> entities = attrValueService.baseAttrListForspu(spuId);
        return R.ok().put("data",entities);
    }


    @PostMapping("update/{spuId}")
    public R updateSpuAttr(@PathVariable("spuId")Long spuId,
                           @RequestBody List<ProductAttrValueEntity> entities){
        attrValueService.updateSpuAttr(spuId,entities);

        return R.ok();
    }
    /**
     * 查询商品属性
     * @param params 分页数据
     * @param catelogId 分类id
     * @param attrType 属性类型
     * @return
     */

    @GetMapping("/{attrType}/list/{catelogId}")
    public R baseAttrList(@RequestParam Map <String,Object> params,
                          @PathVariable("catelogId") Long catelogId,
                          @PathVariable("attrType")String attrType){
        PageUtils page = attrService.queryBaseAttrPage(params, catelogId,attrType);

        return R.ok().put("page",page);

    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:attr:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = attrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{attrId}")
    public R info(@PathVariable("attrId") Long attrId){
        AttrRespVo attr = attrService.getAttrInfo(attrId);

        return R.ok().put("attr", attr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AttrVo attr){
		attrService.saveAttr(attr);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AttrVo attr){
		attrService.updateAttrVo(attr);

        return R.ok();
    }

    /**
     * @RequestBody 必须
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:attr:delete")
    public R delete(@RequestBody Long[] attrIds){
		attrService.removeByIds(Arrays.asList(attrIds));

        return R.ok();
    }

}
