package com.chiuwah.product.controller;

import java.util.Arrays;
import java.util.Map;

import com.chiuwah.product.entity.CategoryEntity;

import com.chiuwah.product.service.CategoryService;
import io.renren.common.utils.PageUtils;
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
 * @date 2021-04-23 21:38:35
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService CategoryService;

    @RequestMapping("/categories")
    public R listall(){
        return R.ok().put("list",CategoryService.listall());
    }

    @RequestMapping("/type")
    public R listType(){
        return R.ok().put("type",CategoryService.listType());
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = CategoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{顺序}")
    public R info(@PathVariable("顺序") Integer orders){
		CategoryEntity categoryEntity = CategoryService.getById(orders);

        return R.ok().put("类别", categoryEntity);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity categoryEntity){
		CategoryService.save(categoryEntity);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity categoryEntity){
		CategoryService.updateById(categoryEntity);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] orders){
		CategoryService.removeByIds(Arrays.asList(orders));

        return R.ok();
    }

}
