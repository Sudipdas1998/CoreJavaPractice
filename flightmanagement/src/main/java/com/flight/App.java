package com.flight;

import java.util.List;

import com.dao.FlightDao;
import com.entity.Flight;
import com.entity.Flightdetail;

//Main class
public class App {

 
	 public static void main( String[] args )
	    {
	        // Save two flights
	        Flight flight = new Flight("joy","AIRINDIA", 12);
	        Flightdetail flightdetail = new Flightdetail("MUMBAI");
	        flightdetail.setFlight(flight);
	        flight.setFlightdetail(flightdetail);
	       
	        Flight flight1 = new Flight("Shree","INDIGO",20);
	        Flightdetail flightdetail1 = new Flightdetail("KOLKATA");
	        flightdetail1.setFlight(flight1);
	        flight1.setFlightdetail(flightdetail1);
	       
	        FlightDao flightDao = new FlightDao();
	        flightDao.saveFlight(flight);
	        flightDao.saveFlight(flight1);
	       
	        // Get all flights
	        List<Flight> flights = flightDao.getAllFlight();
	        flights.forEach(flightTemp -> System.out.println(flightTemp.getFlightName()));
	    }
}
