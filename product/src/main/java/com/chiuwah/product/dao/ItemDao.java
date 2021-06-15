package com.chiuwah.product.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chiuwah.product.entity.ItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ${comments}
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-04-07 16:13:23
 */
@Mapper
public interface ItemDao extends BaseMapper<ItemEntity> {

    public List<ItemEntity> listAllItems();
    public IPage<ItemEntity> listItemsByType(Page<?> page, String type);
    public IPage<ItemEntity> getItemById(Page<?> page,String ID);
    public IPage<ItemEntity> getItemByName(Page<?> page,String itemName);
    public IPage<ItemEntity> getItemByBarcode(Page<?> page,String itemBarcode);
    public IPage<ItemEntity> getItemByPinyin(Page<?> page,String itemPinyin);

}
