package com.chiuwah.product.dao;

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
}
