package com.chiuwah.product.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chiuwah.product.entity.PreorderListEntity;
import io.renren.common.utils.PageUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * ${comments}
 *
 * @author LEI
 * @email leiniu54@gmail.com
 * @date 2021-05-13 17:04:43
 */
public interface PreorderListService extends IService<PreorderListEntity> {

    PageUtils queryPage(Map<String, Object> params);
    List<PreorderListEntity> listAllPreoders();
    IPage<PreorderListEntity> listPreorders(Page<?> page);
    IPage<PreorderListEntity> getListByDate(Page<?> page,String date1,String date2);
    IPage<PreorderListEntity> getListWithCustomerName();
}

