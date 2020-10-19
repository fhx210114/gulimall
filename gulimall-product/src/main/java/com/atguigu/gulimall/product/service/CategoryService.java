package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author kite
 * @email fhx210114@gmail.com
 * @date 2020-09-24 19:30:42
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     *
     * @return
     */
    List<CategoryEntity> listWithTree();

    /**
     *  批量删除菜单
     * @param asList
     */
    void removeMenuByIds(List<Long> asList);

    /**
     * 找到catelogId完整路径
     * [父/子/孙]
     * @param catelogId
     * @return
     */
    public Long[] findCatelogPath(Long catelogId);

    /**
     * 级联更新
     * @param category
     */
    void updateCascade(CategoryEntity category);
}

