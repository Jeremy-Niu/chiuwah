package com.chiuwah.product.service.impl;

import com.chiuwah.product.dao.PreorderDetailDao;
import com.chiuwah.product.dao.PreorderListDao;
import com.chiuwah.product.entity.PreorderDetailEntity;
import com.chiuwah.product.entity.PreorderListEntity;
import com.chiuwah.product.service.PreorderDetailService;
import com.chiuwah.product.service.PreorderListService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;



@Service("批发待审核单明细表Service")
public class PreorderDetailServiceImpl extends ServiceImpl<PreorderDetailDao, PreorderDetailEntity> implements PreorderDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PreorderDetailEntity> page = this.page(
                new Query<PreorderDetailEntity>().getPage(params),
                new QueryWrapper<PreorderDetailEntity>()
        );

        return new PageUtils(page);
    }

}