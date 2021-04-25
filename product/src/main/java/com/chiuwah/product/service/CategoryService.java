package com.chiuwah.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chiuwah.product.entity.CategoryEntity;
import io.renren.common.utils.PageUtils;

import java.util.List;
import java.util.Map;

/**
 * ${comments}
 *
 * @author LEI
 * @email leiniu54@gmail.com
 * @date 2021-04-23 21:38:35
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
    public List<CategoryEntity> listall();
    public List<String> listType();

}

