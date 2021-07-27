package com.chiuwah.product.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chiuwah.product.dao.PreorderListDao;
import com.chiuwah.product.entity.PreorderListEntity;
import com.chiuwah.product.service.PreorderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;



@Service("PreOrderListService")
public class PreorderListServiceImpl extends ServiceImpl<PreorderListDao, PreorderListEntity> implements PreorderListService {

    @Autowired
    PreorderListDao preorderListDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PreorderListEntity> page = this.page(
                new Query<PreorderListEntity>().getPage(params),
                new QueryWrapper<PreorderListEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<PreorderListEntity> listAllPreoders() {
        List<PreorderListEntity> entities = preorderListDao.listAllPreorders();
        return entities;
    }

    @Override
    public IPage<PreorderListEntity> listPreorders(Page<?> page) {
        return preorderListDao.listPreOrders(page);
    }

    @Override
    public IPage<PreorderListEntity> getListByDate(Page<?> page,String date1, String date2) {
        IPage<PreorderListEntity> entities = preorderListDao.listPreOrdersByDate(page,date1,date2);
        return entities;
    }

    @Override
    public IPage<PreorderListEntity> getListWithCustomerName() {
        IPage<PreorderListEntity> entities = preorderListDao.listPreOrdersWithName();
        return entities;
    }

}