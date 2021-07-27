package com.chiuwah.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chiuwah.product.entity.CustomerEntity;
import com.chiuwah.product.entity.PreorderDetailEntity;
import io.renren.common.utils.PageUtils;

import java.util.List;
import java.util.Map;

/**
 * ${comments}
 *
 * @author LEI
 * @email leiniu54@gmail.com
 * @date 2021-05-13 17:04:43
 */
public interface PreorderDetailService extends IService<PreorderDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
    List<CustomerEntity>getCustomerInfor();
}

