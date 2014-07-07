package com.csst.business.model;

import java.util.Date;

/**
 * BOrderId entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class BOrderId implements java.io.Serializable {

	// Fields

	private String id;
	private String orderCode;
	private Date orderDate;
	private String orderSales;
	private Double orderPrice;
	private Integer orderState;

	// Constructors

	/** default constructor */
	public BOrderId() {
	}

	/** full constructor */
	public BOrderId(String id, String orderCode, Date orderDate,
			String orderSales, Double orderPrice, Integer orderState) {
		this.id = id;
		this.orderCode = orderCode;
		this.orderDate = orderDate;
		this.orderSales = orderSales;
		this.orderPrice = orderPrice;
		this.orderState = orderState;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderSales() {
		return this.orderSales;
	}

	public void setOrderSales(String orderSales) {
		this.orderSales = orderSales;
	}

	public Double getOrderPrice() {
		return this.orderPrice;
	}

	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Integer getOrderState() {
		return this.orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BOrderId))
			return false;
		BOrderId castOther = (BOrderId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getOrderCode() == castOther.getOrderCode()) || (this
						.getOrderCode() != null
						&& castOther.getOrderCode() != null && this
						.getOrderCode().equals(castOther.getOrderCode())))
				&& ((this.getOrderDate() == castOther.getOrderDate()) || (this
						.getOrderDate() != null
						&& castOther.getOrderDate() != null && this
						.getOrderDate().equals(castOther.getOrderDate())))
				&& ((this.getOrderSales() == castOther.getOrderSales()) || (this
						.getOrderSales() != null
						&& castOther.getOrderSales() != null && this
						.getOrderSales().equals(castOther.getOrderSales())))
				&& ((this.getOrderPrice() == castOther.getOrderPrice()) || (this
						.getOrderPrice() != null
						&& castOther.getOrderPrice() != null && this
						.getOrderPrice().equals(castOther.getOrderPrice())))
				&& ((this.getOrderState() == castOther.getOrderState()) || (this
						.getOrderState() != null
						&& castOther.getOrderState() != null && this
						.getOrderState().equals(castOther.getOrderState())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getOrderCode() == null ? 0 : this.getOrderCode().hashCode());
		result = 37 * result
				+ (getOrderDate() == null ? 0 : this.getOrderDate().hashCode());
		result = 37
				* result
				+ (getOrderSales() == null ? 0 : this.getOrderSales()
						.hashCode());
		result = 37
				* result
				+ (getOrderPrice() == null ? 0 : this.getOrderPrice()
						.hashCode());
		result = 37
				* result
				+ (getOrderState() == null ? 0 : this.getOrderState()
						.hashCode());
		return result;
	}

}