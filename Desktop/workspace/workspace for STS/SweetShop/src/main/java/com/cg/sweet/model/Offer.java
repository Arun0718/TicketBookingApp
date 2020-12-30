package com.cg.sweet.model;

import javax.persistence.*;

@Entity
@Table(name = "offers")
public class Offer  {
	
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "offer_id")
     private int  id;
     @Column(name = "offer_name")
     private String offername;
     @Column(name = "offer_rate")
     private double offerrate;

    @ManyToOne
    @JoinColumn(name = "sweet_id" ) 
    private Sweet sweet;

	

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOffername() {
		return offername;
	}

	public void setOffername(String offername) {
		this.offername = offername;
	}

	public double getOfferrate() {
		return offerrate;
	}

	public void setOfferrate(double offerrate) {
		this.offerrate = offerrate;
	}

	public Sweet getSweet() {
		return sweet;
	}

	public void setSweet(Sweet sweet) {
		this.sweet = sweet;
	}

    
}
