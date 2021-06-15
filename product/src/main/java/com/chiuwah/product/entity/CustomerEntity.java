package com.chiuwah.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ${comments}
 * 
 * @author LEI
 * @email leiniu54@gmail.com
 * @date 2021-06-10 14:43:32
 */
@Data
@TableName("客户信息")
public class CustomerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String customerName;
	/**
	 * $column.comments
	 */
	private String customerNum;
	/**
	 * $column.comments
	 */
	private String tel;
	/**
	 * $column.comments
	 */
	private String phone;
	/**
	 * $column.comments
	 */
	private String fax;
	/**
	 * $column.comments
	 */
	private String email;
	/**
	 * $column.comments
	 */
	private String http;
	/**
	 * $column.comments
	 */
	private String qq;
	/**
	 * $column.comments
	 */
	private String postcode;
	/**
	 * $column.comments
	 */
	private String address;
	/**
	 * $column.comments
	 */
	private String bank1;
	/**
	 * $column.comments
	 */
	private String account1;
	/**
	 * $column.comments
	 */
	private String bank2;
	/**
	 * $column.comments
	 */
	private String account2;
	/**
	 * $column.comments
	 */
	private String bank3;
	/**
	 * $column.comments
	 */
	private String account3;
	/**
	 * $column.comments
	 */
	private String bank4;
	/**
	 * $column.comments
	 */
	private String account4;
	/**
	 * $column.comments
	 */
	private String taxNum;
	/**
	 * $column.comments
	 */
	private String customerSerialNum;
	/**
	 * $column.comments
	 */
	private Integer used;
	/**
	 * $column.comments
	 */
	private Integer overdraftTerm;
	/**
	 * $column.comments
	 */
	private float overdraftLimit;
	/**
	 * $column.comments
	 */
	private String category;
	/**
	 * $column.comments
	 */
	private String payMethod;
	/**
	 * $column.comments
	 */
	private String deliveryMethod;
	/**
	 * $column.comments
	 */
	private String businessScope;
	/**
	 * $column.comments
	 */
	private String creditLevel;
	/**
	 * $column.comments
	 */
	private float totalAmount;
	/**
	 * $column.comments
	 */
	private float paidAmount;
	/**
	 * $column.comments
	 */
	private float prepaidAmount;
	/**
	 * 去除零头
	 */
	private float wiper;
	/**
	 * 价格类型，批发价格1，批发价格2etc
	 */
	private String priceType;
	/**
	 * $column.comments
	 */
	private String usedPriceType;
	/**
	 * $column.comments
	 */
	private Boolean stopedUsing;
	/**
	 * $column.comments
	 */
	private String notes;
	/**
	 * $column.comments
	 */
	private String contract1;
	/**
	 * $column.comments
	 */
	private String contacttitle1;
	/**
	 * $column.comments
	 */
	private String tel1;
	/**
	 * $column.comments
	 */
	private String phone1;
	/**
	 * $column.comments
	 */
	private String qq1;
	/**
	 * $column.comments
	 */
	private String email1;
	/**
	 * $column.comments
	 */
	private String contract2;
	/**
	 * $column.comments
	 */
	private String contacttitle2;
	/**
	 * $column.comments
	 */
	private String tel2;
	/**
	 * $column.comments
	 */
	private String phone2;
	/**
	 * $column.comments
	 */
	private String qq2;
	/**
	 * $column.comments
	 */
	private String email2;
	/**
	 * $column.comments
	 */
	private String contract3;
	/**
	 * $column.comments
	 */
	private String contacttitle3;
	/**
	 * $column.comments
	 */
	private String tel3;
	/**
	 * $column.comments
	 */
	private String phone3;
	/**
	 * $column.comments
	 */
	private String qq3;
	/**
	 * $column.comments
	 */
	private String email3;
	/**
	 * $column.comments
	 */
	private String deliveryTime;
	/**
	 * $column.comments
	 */
	private String deliveryPlatform;
	/**
	 * $column.comments
	 */
	private String feature;
	/**
	 * $column.comments
	 */
	private String pwd;
	/**
	 * $column.comments
	 */
	private String businessName;
	/**
	 * $column.comments
	 */
	private String source;
	/**
	 * $column.comments
	 */
	private String logintime;
	/**
	 * $column.comments
	 */
	private String buytime;
	/**
	 * $column.comments
	 */
	private String storename;
	/**
	 * $column.comments
	 */
	private String grocery;
	/**
	 * $column.comments
	 */
	private String city;
	/**
	 * $column.comments
	 */
	private String country;

}
