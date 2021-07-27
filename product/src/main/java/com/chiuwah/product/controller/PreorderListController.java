package com.chiuwah.product.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import cn.hutool.db.PageResult;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chiuwah.common.utils.PageUtils;
import com.chiuwah.product.entity.PreorderListEntity;
import com.chiuwah.product.service.PreorderListService;
import io.swagger.models.auth.In;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
 * @date 2021-05-13 17:04:43
 */
@RefreshScope
@RestController
@RequestMapping("preorder/general")
public class PreorderListController {
    @Autowired
    private PreorderListService listService;

    /**
     * test for api
     */
    @RequestMapping("/listall")
//    @RequiresPermissions("generator:批发待审核单总表:list")
    public R list(@RequestParam Map<String, Object> params){
        List<PreorderListEntity> entityList = listService.listAllPreoders();
        return R.ok().put("data",entityList);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("generator:批发待审核单总表:list")
    public R list(@RequestParam Integer page, @RequestParam Integer limit){
        Page<PreorderListEntity>  pages = new Page<>(page,limit);
        IPage<PreorderListEntity>  data = listService.listPreorders(pages);
        PageUtils results = new PageUtils(data);
        return R.ok().put("page",results);
    }

    @RequestMapping("/listwithname")
    public R listWithName(){
        IPage<PreorderListEntity> data = listService.getListWithCustomerName();
        PageUtils results = new PageUtils( data);
        return R.ok().put("page",results);
    }



    /**
     * search by id
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:批发待审核单总表:info")
    public R info(@PathVariable("id") Integer id){
		PreorderListEntity listEntity = listService.getById(id);

        return R.ok().put("批发待审核单总表", listEntity);
    }

    /**
     * search by date
     */
    @RequestMapping("/info/date")
//    @RequiresPermissions("generator:批发待审核单总表:info")
    public R infobydate(@RequestParam Integer page, @RequestParam Integer limit, @RequestParam String date1, @RequestParam String date2 ) throws ParseException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
//        Date tempDate = simpleDateFormat.parse(date2);
//        String endDate = simpleDateFormat.format(new Date(tempDate.getTime()+ 1 * 24 * 60 * 60 * 1000));
        Page<PreorderListEntity> pages = new Page<>(page,limit);
        IPage<PreorderListEntity> data = listService.getListByDate(pages,date1,date2);
        PageUtils results = new PageUtils(data);
        return R.ok().put("page", results);
    }


    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:批发待审核单总表:save")
    public R save(@RequestBody PreorderListEntity listEntity){
        listService.save(listEntity);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:批发待审核单总表:update")
    public R update(@RequestBody PreorderListEntity listEntity){
        listService.updateById(listEntity);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:批发待审核单总表:delete")
    public R delete(@RequestBody Integer[] ids){
        listService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
