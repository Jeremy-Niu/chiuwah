package com.chiuwah.product.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chiuwah.product.entity.CustomerEntity;
import com.chiuwah.common.utils.PageUtils;
import com.chiuwah.product.entity.ItemEntity;

import java.util.List;
import java.util.Map;

/**
 * ${comments}
 *
 * @author LEI
 * @email leiniu54@gmail.com
 * @date 2021-06-10 14:43:32
 */
public interface CustomerService extends IService<CustomerEntity> {

    IPage<CustomerEntity> getCustomersById(Page<?> pages, String customerNum);


    PageUtils queryPage(Map<String, Object> params);

    List<CustomerEntity> listall();

    IPage<CustomerEntity> listAllCustomer(Page<?> pages);
}

