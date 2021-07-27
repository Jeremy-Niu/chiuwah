package com.chiuwah.product.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chiuwah.product.entity.ItemEntity;
import com.chiuwah.product.entity.PreorderListEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

/**
 * ${comments}
 * 
 * @author LEI
 * @email leiniu54@gmail.com
 * @date 2021-05-13 17:04:43
 */
@Mapper
public interface PreorderListDao extends BaseMapper<PreorderListEntity> {

    public List<PreorderListEntity> listAllPreorders();
    public IPage<PreorderListEntity> listPreOrders(Page<?> page);
    public IPage<PreorderListEntity> listPreOrdersByDate(Page<?> pang, String date1,String date2);
    public IPage<PreorderListEntity> listPreOrdersWithName();
}
