package com.chiuwah.product.controller;

import java.util.Arrays;
import java.util.Map;

import com.chiuwah.product.entity.PreorderDetailEntity;
import com.chiuwah.product.service.PreorderDetailService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * ${comments}
 *
 * @author LEI
 * @email leiniu54@gmail.com
 * @date 2021-05-13 17:04:43
 */
@RestController
@RequestMapping("preorder/detail")
public class PreorderDetailController {
    @Autowired
    private PreorderDetailService detailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:批发待审核单明细表:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = detailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:批发待审核单明细表:info")
    public R info(@PathVariable("id") Integer id){
        PreorderDetailEntity detailEntity = detailService.getById(id);

        return R.ok().put("批发待审核单明细表", detailEntity);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:批发待审核单明细表:save")
    public R save(@RequestBody PreorderDetailEntity detailEntity){
        detailService.save(detailEntity);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:批发待审核单明细表:update")
    public R update(@RequestBody PreorderDetailEntity detailEntity){
        detailService.updateById(detailEntity);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:批发待审核单明细表:delete")
    public R delete(@RequestBody Integer[] ids){
        detailService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
