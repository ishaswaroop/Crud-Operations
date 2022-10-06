package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product {
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
 int id;
	@Column
 String pname;
	@Column
 String color;
	@Column
 String price;
	@OneToOne(cascade=CascadeType.PERSIST)
	CategoryEntity CaEn;
	@OneToOne(cascade=CascadeType.PERSIST)
	MerchantEntity MeEN;
	public Product(int id, String pname, String color, String price, CategoryEntity caEn, MerchantEntity meEN) {
		super();
		this.id = id;
		this.pname = pname;
		this.color = color;
		this.price = price;
		CaEn = caEn;
		MeEN = meEN;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public CategoryEntity getCaEn() {
		return CaEn;
	}
	public void setCaEn(CategoryEntity caEn) {
		CaEn = caEn;
	}
	public MerchantEntity getMeEN() {
		return MeEN;
	}
	public void setMeEN(MerchantEntity meEN) {
		MeEN = meEN;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", color=" + color + ", price=" + price + ", CaEn=" + CaEn
				+ ", MeEN=" + MeEN + "]";
	}
	
}