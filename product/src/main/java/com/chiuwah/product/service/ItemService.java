package com.chiuwah.product.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chiuwah.common.utils.PageUtils;
import com.chiuwah.product.entity.ItemEntity;

import java.util.List;
import java.util.Map;

/**
 * ${comments}
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-04-07 16:13:23
 */
public interface ItemService extends IService<ItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
    public List<ItemEntity> listAllItems();
    IPage<ItemEntity> listItemsByType(Page<?> page, String type);
}

