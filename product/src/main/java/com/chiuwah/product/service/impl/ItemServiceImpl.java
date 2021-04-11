package com.chiuwah.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import com.chiuwah.product.dao.ItemDao;
import com.chiuwah.product.entity.ItemEntity;
import com.chiuwah.product.service.ItemService;


@Service("ItemService")
public class ItemServiceImpl extends ServiceImpl<ItemDao, ItemEntity> implements ItemService {
    @Autowired
    ItemDao itemDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ItemEntity> page = this.page(
                new Query<ItemEntity>().getPage(params),
                new QueryWrapper<ItemEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<ItemEntity> listAllItems() {

        return itemDao.listAllItems();
    }

}