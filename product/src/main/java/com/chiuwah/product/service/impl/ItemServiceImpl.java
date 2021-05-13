package com.chiuwah.product.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chiuwah.common.utils.PageUtils;
import com.chiuwah.common.utils.Query;

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
        List<ItemEntity> entities = itemDao.listAllItems();
        return entities.stream().filter((itemEntity)->{ return itemEntity.getCategory().equals("111 FRESH FOODS 新鲜食品");})
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public IPage<ItemEntity> listItemsByType(Page<?> page,String type) {
//        List<ItemEntity> entities = itemDao.listAllItems();
//        return entities.stream().filter((itemEntity)->{ return itemEntity.getCategory().equals(type);})
//                .collect(Collectors.toUnmodifiableList());
        IPage<ItemEntity> entities = itemDao.listItemsByType(page,type);
        return entities;

    }

}