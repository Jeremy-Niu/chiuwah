package com.chiuwah.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.apache.commons.beanutils.locale.converters.IntegerLocaleConverter;

/**
 * ${comments}
 * 
 * @author LEI
 * @email leiniu54@gmail.com
 * @date 2021-04-23 21:38:35
 */
@Data
@TableName("类别")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer Orders;
	/**
	 * $column.comments
	 */
	private String Category;
	/**
	 * $column.comments
	 */
	private Integer Level;
	/**
	 * $column.comments
	 */
	private String Modules;

}
