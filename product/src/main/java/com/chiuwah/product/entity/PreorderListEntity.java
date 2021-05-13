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
@TableName("批发待审核单总表")
public class PreorderListEntity implements Serializable {
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
	private String CustomerNum;
	/**
	 * $column.comments
	 */
	private Integer CustomerSerialNum;
	/**
	 * $column.comments
	 */
	private Integer SerialNum;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalNum;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalAmount;
	/**
	 * $column.comments
	 */
	private BigDecimal Paid;
	/**
	 * $column.comments
	 */
	private BigDecimal DiscardPenny;
	/**
	 * $column.comments
	 */
	private BigDecimal Receivables;
	/**
	 * $column.comments
	 */
	private Date ReceivablePeriod;
	/**
	 * $column.comments
	 */
	private Date Date;
	/**
	 * $column.comments
	 */
	private String JobNum;
	/**
	 * $column.comments
	 */
	private String InvoiceNote;
	/**
	 * $column.comments
	 */
	private String StoreName;
	/**
	 * $column.comments
	 */
	private String Return;
	/**
	 * $column.comments
	 */
	private String Invalid;
	/**
	 * $column.comments
	 */
	private String Sales;
	/**
	 * $column.comments
	 */
	private String PaidType;
	/**
	 * $column.comments
	 */
	private String Repository;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalCostAmount;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalRebateAmount;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalGrossProfitAmount;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalGrossProfitRate;
	/**
	 * $column.comments
	 */
	private String TypeofPrice;
	/**
	 * $column.comments
	 */
	private String TerminalNum;
	/**
	 * $column.comments
	 */
	private String TypeBusiness;
	/**
	 * $column.comments
	 */
	private BigDecimal CountTotalNum;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalItemSaleForOtherAmount;
	/**
	 * $column.comments
	 */
	private String ContractName;
	/**
	 * $column.comments
	 */
	private String Telephone;
	/**
	 * $column.comments
	 */
	private String PostCode;
	/**
	 * $column.comments
	 */
	private String Address;
	/**
	 * $column.comments
	 */
	private String DeliveryTime;
	/**
	 * $column.comments
	 */
	private Date DeliveryDate;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalTaxAmount;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalTaxBeforeAmount;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalWeight;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalAmountWithTax;
	/**
	 * $column.comments
	 */
	private Boolean Association;
	/**
	 * $column.comments
	 */
	private String Feature;
	/**
	 * $column.comments
	 */
	private BigDecimal DeliveryFee;
	/**
	 * $column.comments
	 */
	private String source;
	/**
	 * $column.comments
	 */
	private String state;
	/**
	 * $column.comments
	 */
	private String statePeople;
	/**
	 * $column.comments
	 */
	private String stateTime;
	/**
	 * $column.comments
	 */
	private String sendyg;

}
