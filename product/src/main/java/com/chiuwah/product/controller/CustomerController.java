package com.chiuwah.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chiuwah.product.entity.CustomerEntity;
import com.chiuwah.product.entity.ItemEntity;
import com.chiuwah.product.service.CustomerService;
import com.chiuwah.common.utils.PageUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.chiuwah.common.utils.R;



/**
 * ${comments}
 *
 * @author LEI
 * @email leiniu54@gmail.com
 * @date 2021-06-10 14:43:32
 */
@RestController
@RequestMapping("product/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /**
     * test
     */
    @RequestMapping("/test")
//    @RequiresPermissions("generator:客户信息:list")
    public R list(){
        List<CustomerEntity> data = customerService.listall();
        return R.ok().put("page", data);
    }

    /**
     * list all customers
     */
    @RequestMapping("/listall")
//    @RequiresPermissions("generator:客户信息:list")
    public R listAllCustomers(@RequestParam Integer page, @RequestParam Integer limit){
        Page<CustomerEntity> pages = new Page<>(page,limit);
        IPage<CustomerEntity> data = customerService.listAllCustomer(pages);
        PageUtils results = new PageUtils(data);
        return R.ok().put("page", results);
    }

    /**
     * 信息
     */
    @RequestMapping("/customerNum/{customerNum}")
    //@RequiresPermissions("generator:product:info")
    public R info(@PathVariable("customerNum") String customerNum,@RequestParam Integer page, @RequestParam Integer limit){
        Page<CustomerEntity> pages = new Page<>(page,limit);
        IPage<CustomerEntity> data = customerService.getCustomersById(pages,customerNum);
        PageUtils results = new PageUtils(data);
        return R.ok().put("page", results);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{客户}")
//    @RequiresPermissions("generator:客户信息:info")
    public R info(@PathVariable("客户") String 客户){
		CustomerEntity 客户信息 = customerService.getById(客户);

        return R.ok().put("客户信息", 客户信息);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
//    @RequiresPermissions("generator:客户信息:save")
    public R save(@RequestBody CustomerEntity 客户信息){
		customerService.save(客户信息);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
//    @RequiresPermissions("generator:客户信息:update")
    public R update(@RequestBody CustomerEntity 客户信息){
		customerService.updateById(客户信息);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
//    @RequiresPermissions("generator:客户信息:delete")
    public R delete(@RequestBody String[] 客户s){
		customerService.removeByIds(Arrays.asList(客户s));

        return R.ok();
    }

}
