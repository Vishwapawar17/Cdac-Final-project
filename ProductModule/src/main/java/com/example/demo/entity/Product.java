package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long prid;
	private int uid;
	
	private String Prodname;
	private float  ProDisc;
	private String ProdCat;
	private int ProdPrice;
	private int ProdQuants;
	public long getPrid() {
		return prid;
	}
	public void setPrid(long prid) {
		this.prid = prid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getProdname() {
		return Prodname;
	}
	public void setProdname(String prodname) {
		Prodname = prodname;
	}
	public float getProDisc() {
		return ProDisc;
	}
	public void setProDisc(float proDisc) {
		ProDisc = proDisc;
	}
	public String getProdCat() {
		return ProdCat;
	}
	public void setProdCat(String prodCat) {
		ProdCat = prodCat;
	}
	public int getProdPrice() {
		return ProdPrice;
	}
	public void setProdPrice(int prodPrice) {
		ProdPrice = prodPrice;
	}
	public int getProdQuants() {
		return ProdQuants;
	}
	public void setProdQuants(int prodQuants) {
		ProdQuants = prodQuants;
	}
	@Override
	public String toString() {
		return "Product [prid=" + prid + ", uid=" + uid + ", Prodname=" + Prodname + ", ProDisc=" + ProDisc
				+ ", ProdCat=" + ProdCat + ", ProdPrice=" + ProdPrice + ", ProdQuants=" + ProdQuants + "]";
	}
	
	
	
	
}
