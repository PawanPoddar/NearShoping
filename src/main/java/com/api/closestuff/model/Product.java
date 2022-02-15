package com.api.closestuff.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import org.hibernate.annotations.Entity;

@Document(collection="student")
public class Product {
	@Id
	private int id;
	private String name;
	private double age;
	private int grade;

	public Product() {
		super();
	}
	public Product(int id,String name,double age,int grade) {
		super();
		this.id=id;
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	public long getId() {
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
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	
		
}
