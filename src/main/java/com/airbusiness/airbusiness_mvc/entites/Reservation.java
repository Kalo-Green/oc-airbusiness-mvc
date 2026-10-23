package com.airbusiness.airbusiness_mvc.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Reservation {

	// -------------------------------------
	// ATTRIBUTES
	// -------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Name of Reservation is mandatory")
	private String name;

	@NotBlank(message = "Destination is mandatory")
	private String destination;

	private String departureDate;

	private String returnDate;

	// -------------------------------------
	// CONSTRUCTORS
	// -------------------------------------
	public Reservation(String name, String destination, String departureDate, String returnDate) {
		this.name = name;
		this.destination = destination;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
	}

	public Reservation() {

	}

	// -------------------------------------
	// GETTERS AND SETTERS
	// -------------------------------------
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

}
