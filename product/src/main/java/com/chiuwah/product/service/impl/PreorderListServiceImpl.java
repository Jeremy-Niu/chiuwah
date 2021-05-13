package com.chiuwah.product.service.impl;

import com.chiuwah.product.dao.PreorderListDao;
import com.chiuwah.product.entity.PreorderListEntity;
import com.chiuwah.product.service.PreorderListService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;



@Service("批发待审核单总表Service")
public class PreorderListServiceImpl extends ServiceImpl<PreorderListDao, PreorderListEntity> implements PreorderListService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PreorderListEntity> page = this.page(
                new Query<PreorderListEntity>().getPage(params),
                new QueryWrapper<PreorderListEntity>()
        );

        return new PageUtils(page);
    }

}