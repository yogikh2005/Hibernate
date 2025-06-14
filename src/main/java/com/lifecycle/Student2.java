package com.lifecycle;



import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name="Student_info")
public class Student2 {
	
	@Id
	private int id;
	
	private String name;
	private String city;
	
	
	private Certificate2 certificate;
	
	public Certificate2 getCertificate() {
		return certificate;
	}
	public void setCertificate(Certificate2 certificate) {
		this.certificate = certificate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student2(int id, String name, String city, Certificate2 certificate) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.certificate = certificate;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", certificate=" + certificate + "]";
	}
	
	
	
}
