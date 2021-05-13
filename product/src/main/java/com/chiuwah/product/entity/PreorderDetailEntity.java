package com.chiuwah.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ${comments}
 * 
 * @author LEI
 * @email leiniu54@gmail.com
 * @date 2021-05-13 17:04:43
 */
@Data
@TableName("批发待审核单明细表")
public class PreorderDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private String OrderNum;
	/**
	 * $column.comments
	 */
	private String ItemNum;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalNum;
	/**
	 * $column.comments
	 */
	private BigDecimal Price;
	/**
	 * $column.comments
	 */
	private BigDecimal Discount;
	/**
	 * $column.comments
	 */
	private BigDecimal PriceafterDiscout;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalPrice;
	/**
	 * $column.comments
	 */
	private String Note;
	/**
	 * $column.comments
	 */
	private BigDecimal CostPrice;
	/**
	 * $column.comments
	 */
	private BigDecimal CostTotal;
	/**
	 * $column.comments
	 */
	private BigDecimal RebateRate;
	/**
	 * $column.comments
	 */
	private BigDecimal RebateAmount;
	/**
	 * $column.comments
	 */
	private BigDecimal GrossProfitAmount;
	/**
	 * $column.comments
	 */
	private BigDecimal GrossProfitRate;
	/**
	 * $column.comments
	 */
	private BigDecimal CountNum;
	/**
	 * $column.comments
	 */
	private String SerialNum;
	/**
	 * $column.comments
	 */
	private BigDecimal ItemSaleForOtherRate;
	/**
	 * $column.comments
	 */
	private BigDecimal ItemSaleForOtherAmount;
	/**
	 * $column.comments
	 */
	private BigDecimal TaxRate;
	/**
	 * $column.comments
	 */
	private BigDecimal TaxAmount;
	/**
	 * $column.comments
	 */
	private BigDecimal BeforTaxAmount;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalWeight;

}
