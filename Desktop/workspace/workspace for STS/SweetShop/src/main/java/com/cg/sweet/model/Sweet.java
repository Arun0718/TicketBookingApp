package com.cg.sweet.model;

import javax.persistence.*;



@Entity
@Table(name = "sweets")
public class Sweet {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sweet_id")
    private int id;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "rate")
    private double rate;




	

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}

}
