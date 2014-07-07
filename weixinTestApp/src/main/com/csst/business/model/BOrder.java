package com.csst.business.model;

/**
 * BOrder entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class BOrder implements java.io.Serializable {

	// Fields

	private BOrderId id;

	// Constructors

	/** default constructor */
	public BOrder() {
	}

	/** full constructor */
	public BOrder(BOrderId id) {
		this.id = id;
	}

	// Property accessors

	public BOrderId getId() {
		return this.id;
	}

	public void setId(BOrderId id) {
		this.id = id;
	}

}