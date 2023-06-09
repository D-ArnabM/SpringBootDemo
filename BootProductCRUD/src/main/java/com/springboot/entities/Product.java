package com.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
	private String pName;
	private long pQuantity;
	private double pPrice;
	public Product(int pId, String pName, long pQuantity, double pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pQuantity = pQuantity;
		this.pPrice = pPrice;
	}
	public Product() {
		super();
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public long getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(long pQuantity) {
		this.pQuantity = pQuantity;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pQuantity=" + pQuantity + ", pPrice=" + pPrice + "]";
	}
}
