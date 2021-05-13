package com.chiuwah.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiniu.sms.model.TemplateInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import com.chiuwah.product.entity.ItemEntity;
import com.chiuwah.product.service.ItemService;
import com.chiuwah.common.utils.PageUtils;
import com.chiuwah.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * ${comments}
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-04-07 16:13:23
 */

@RefreshScope
@RestController
@RequestMapping("/product")
public class ItemController {
    @Autowired
    private ItemService ItemService;
    @Value("${idage}")
    private String  idage;

    public void setIdage(String idage) {
        this.idage = idage;
    }

    /**
     * 列表
     */
    @GetMapping("/list")
    //@RequiresPermissions("generator:product:list")
    public R list(@RequestParam Map<String, Object> params){
     PageUtils page = ItemService.queryPage(params);
        return R.ok().put("page", page);
    }

    @RefreshScope
    @RequestMapping("/test")
    public String test(){
        return "idage"+idage;
    }


    @RequestMapping("/listbytype/{type}")
    public R ItemListByType(@PathVariable("type")String type,@RequestParam Integer page, @RequestParam Integer limit){
        Page<ItemEntity> pages = new Page<>(page,limit);
        IPage<ItemEntity> data = ItemService.listItemsByType(pages,type);
        PageUtils results = new PageUtils(data);
        return R.ok().put("page", results);
    }


    @RequestMapping("/listall")
    public R ItemList(){


        List<ItemEntity> entities = ItemService.listAllItems();
        return  R.ok().put("data",entities);
    }


    @RequestMapping("/helloworld")
    @ResponseBody
    public String home(){
        return "Hello World!";
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{ItemNum}")
    //@RequiresPermissions("generator:product:info")
    public R info(@PathVariable("ItemNum") String ItemNum){
		ItemEntity itemEntity = ItemService.getById(ItemNum);

        return R.ok().put("新商品信息", itemEntity);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("generator:product:save")
    public R save(@RequestBody ItemEntity itemEntity){
		ItemService.save(itemEntity);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("generator:新商品信息:update")
    public R update(@RequestBody ItemEntity 新商品信息){
		ItemService.updateById(新商品信息);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("generator:新商品信息:delete")
    public R delete(@RequestBody String[] 商品编号s){
		ItemService.removeByIds(Arrays.asList(商品编号s));

        return R.ok();
    }

}
