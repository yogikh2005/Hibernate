package com.hibernate;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="stud_add")
public class Address {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="add_id")
	private int addressId;
	 
	 @Column(length = 50)
	private String street;
	 
	private String dist;
	
	@Temporal(TemporalType.DATE)
	private Date Date;
	
	
	@Lob
	@Transient
	private byte[] img;
	
	@Transient
	private double x;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addressId, String street, String dist, Date Date, byte[] img) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.dist = dist;
		this.Date = Date;
		this.img = img;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public Date getDate() {
		return Date;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", dist=" + dist + ", Date=" + Date + ", img="
				+ Arrays.toString(img) + ", x=" + x + "]";
	}
	public void setDate(Date Date) {
		this.Date = Date;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	

}
