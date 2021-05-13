package com.chiuwah.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chiuwah.product.entity.PreorderListEntity;
import io.renren.common.utils.PageUtils;
import java.util.Map;

/**
 * ${comments}
 *
 * @author LEI
 * @email leiniu54@gmail.com
 * @date 2021-05-13 17:04:43
 */
public interface PreorderListService extends IService<PreorderListEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

