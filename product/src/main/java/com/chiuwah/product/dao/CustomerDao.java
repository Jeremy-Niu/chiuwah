package com.chiuwah.product.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chiuwah.product.entity.CustomerEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ${comments}
 * 
 * @author LEI
 * @email leiniu54@gmail.com
 * @date 2021-06-10 14:43:32
 */
@Mapper
public interface CustomerDao extends BaseMapper<CustomerEntity> {

    List<CustomerEntity> listallcustomer();

    IPage<CustomerEntity> listcustomers(Page<?> page);

    IPage<CustomerEntity> getCustiomersById(Page<?> page,String customerNum);
}
