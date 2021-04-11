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
 * @author chenshun
 * @email niulei54@gmail.com
 * @date 2021-04-07 16:13:23
 */
@Data
@TableName("新商品信息")
public class ItemEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String ItemNum;
	/**
	 * $column.comments
	 */
	private String Barcode;
	/**
	 * $column.comments
	 */
	private String ItemName;
	/**
	 * $column.comments
	 */
	private String PinyinNum;
	/**
	 * $column.comments
	 */
	private String SpecificationModel;
	/**
	 * $column.comments
	 */
	private String ShelfNum;
	/**
	 * $column.comments
	 */
	private String Category;
	/**
	 * $column.comments
	 */
	private String OriginalPlace;
	/**
	 * $column.comments
	 */
	private String Brand;
	/**
	 * $column.comments
	 */
	private String Introduction;
	/**
	 * $column.comments
	 */
	private String ImgPath;
	/**
	 * $column.comments
	 */
	private String Unit;
	/**
	 * $column.comments
	 */
	private BigDecimal RetailPrice;
	/**
	 * $column.comments
	 */
	private BigDecimal RetailDiscount;
	/**
	 * $column.comments
	 */
	private BigDecimal MinimumPrice;
	/**
	 * $column.comments
	 */
	private BigDecimal WholesalePrice1;
	/**
	 * $column.comments
	 */
	private BigDecimal WholesalePrice2;
	/**
	 * $column.comments
	 */
	private BigDecimal WholesalePrice3;
	/**
	 * $column.comments
	 */
	private BigDecimal PurchasePrice;
	/**
	 * $column.comments
	 */
	private BigDecimal LastPurchasePrice;
	/**
	 * $column.comments
	 */
	private BigDecimal MemberPrice;
	/**
	 * $column.comments
	 */
	private BigDecimal PurchaseUnitPrice;
	/**
	 * $column.comments
	 */
	private BigDecimal Number;
	/**
	 * $column.comments
	 */
	private BigDecimal NumInBox;
	/**
	 * $column.comments
	 */
	private String StockToNum;
	/**
	 * $column.comments
	 */
	private BigDecimal StockLowerLimit;
	/**
	 * $column.comments
	 */
	private BigDecimal StockUpperLimit;
	/**
	 * $column.comments
	 */
	private Boolean PromotItem;
	/**
	 * $column.comments
	 */
	private BigDecimal PromotPrice;
	/**
	 * $column.comments
	 */
	private Boolean RebateItem;
	/**
	 * $column.comments
	 */
	private BigDecimal RebateRate;
	/**
	 * $column.comments
	 */
	private Boolean PointsItem;
	/**
	 * $column.comments
	 */
	private BigDecimal PointsPrice;
	/**
	 * $column.comments
	 */
	private Boolean RestrictedItem;
	/**
	 * $column.comments
	 */
	private BigDecimal RestrictNum;
	/**
	 * $column.comments
	 */
	private Integer BestBefore;
	/**
	 * $column.comments
	 */
	private String BBDUnit;
	/**
	 * $column.comments
	 */
	private Date ProductionDate;
	/**
	 * $column.comments
	 */
	private Date ExpiredDate ;
	/**
	 * $column.comments
	 */
	private String LastPurchaseDate;
	/**
	 * $column.comments
	 */
	private String LastChangedTime;
	/**
	 * $column.comments
	 */
	private String FirstCreatedTime;
	/**
	 * $column.comments
	 */
	private Boolean Using;
	/**
	 * $column.comments
	 */
	private Boolean Deleate;
	/**
	 * $column.comments
	 */
	private Boolean Stopped;
	/**
	 * $column.comments
	 */
	private Boolean SpecialOfferItem;
	/**
	 * $column.comments
	 */
	private String LastSaleTime;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalSaleNum;
	/**
	 * $column.comments
	 */
	private BigDecimal TotalPurchaseNum;
	/**
	 * $column.comments
	 */
	private String OtherPros1;
	/**
	 * $column.comments
	 */
	private String OtherPros2;
	/**
	 * $column.comments
	 */
	private Boolean ItemSaleForOther;
	/**
	 * $column.comments
	 */
	private BigDecimal ItemSaleForOtherRate;
	/**
	 * $column.comments
	 */
	private String vat;
	/**
	 * $column.comments
	 */
	private BigDecimal Weight;
	/**
	 * $column.comments
	 */
	private String WeightUnit;
	/**
	 * $column.comments
	 */
	private Boolean EnableWeight;
	/**
	 * $column.comments
	 */
	private String Notes;
	/**
	 * $column.comments
	 */
	private Boolean EnableSaleOnline;
	/**
	 * $column.comments
	 */
	private String picfn1;
	/**
	 * $column.comments
	 */
	private String picfn2;
	/**
	 * $column.comments
	 */
	private String picfn3;
	/**
	 * $column.comments
	 */
	private String picfn4;
	/**
	 * $column.comments
	 */
	private String picfn5;


}
