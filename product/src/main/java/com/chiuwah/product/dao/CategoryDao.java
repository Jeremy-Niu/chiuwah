package com.chiuwah.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chiuwah.product.entity.CategoryEntity;
import com.chiuwah.product.entity.ItemEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ${comments}
 * 
 * @author LEI
 * @email leiniu54@gmail.com
 * @date 2021-04-23 21:38:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

    public List<CategoryEntity> listall();
    public  List<String> listType();

}
