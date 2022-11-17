package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Flight")
 

public class Flight {
	

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "flightid")
    private int id;
 
    @Column(name = "flightName")
    private String flightName;
    
    @Column(name = "carrierName")
    private String carrierName;
 
    @Column(name = "totalCapacity") 
    private int totalcapacity;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="Flight_detail_id")
    
    private Flightdetail flightdetail;
    
    

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Flight( String flightName, String carrierName, int totalcapacity) {
		super();
		this.flightName = flightName;
		this.carrierName = carrierName;
		this.totalcapacity = totalcapacity;
		
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public int getTotalcapacity() {
		return totalcapacity;
	}

	public void setTotalcapacity(int totalcapacity) {
		this.totalcapacity = totalcapacity;
	}

	public Flightdetail getFlightdetail() {
		return flightdetail;
	}

	public void setFlightdetail(Flightdetail flightdetail) {
		this.flightdetail = flightdetail;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightName=" + flightName + ", carrierName=" + carrierName + ", totalcapacity="
				+ totalcapacity + ", Flightdetail=" + flightdetail + "]";
	}
    

    
    
 


	 
}
