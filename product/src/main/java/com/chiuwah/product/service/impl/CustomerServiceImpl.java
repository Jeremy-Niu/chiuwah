package com.chiuwah.product.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chiuwah.product.dao.CustomerDao;
import com.chiuwah.product.entity.CustomerEntity;
import com.chiuwah.product.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chiuwah.common.utils.PageUtils;
import com.chiuwah.common.utils.Query;



@Service("CustomerService")
public class CustomerServiceImpl extends ServiceImpl<CustomerDao, CustomerEntity> implements CustomerService {

    @Autowired
    CustomerDao customerDao;

    @Override
    public IPage<CustomerEntity> getCustomersById(Page<?> pages, String customerNum) {
        IPage<CustomerEntity> entityIPage = customerDao.getCustiomersById(pages,filterSpace(customerNum));
        return entityIPage ;
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CustomerEntity> page = this.page(
                new Query<CustomerEntity>().getPage(params),
                new QueryWrapper<CustomerEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CustomerEntity> listall() {
        List<CustomerEntity> entities = customerDao.listallcustomer();
        return entities;
    }

    @Override
    public IPage<CustomerEntity> listAllCustomer(Page<?> page) {
        IPage<CustomerEntity> entityIPage = customerDao.listcustomers(page);
        return entityIPage;
    }

    private String filterSpace(String string){
        String out;
        if (string.isEmpty() || string.isBlank()){
            return null;
        }
        out = "%" + string.strip() + "%";
        return out;
    }

}