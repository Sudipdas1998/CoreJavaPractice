package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Flight_detail")

public class Flightdetail {
	    
		
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    
	    //variables
	    @Column(name="id")
	    private int id;
	    
	    @Column(name="location")
	    private String location;
	    

	    
	    @OneToOne(mappedBy="flightdetail", cascade=CascadeType.ALL)
	    private Flight flight;
	    
	    

		public Flightdetail() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

		public Flightdetail( String location) {
			super();
			this.location = location;
			
		}



		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}


		public Flight getFlight() {
			return flight;
		}

		public void setFlight(Flight flight) {
			this.flight = flight;
		}

		@Override
		public String toString() {
			return "Flight_detail [id=" + id + ", location=" + location + ", flight=" + flight
					+ "]";
		}
	    
	    
	    
}
