package com.receptionistmanagement.entity;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Reservation")
public class ReservationEntity {
	private Long code;
	private int numberOfChildren;
	private int numberOfAdults;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private String status;
	private int numberOfNights;

	public ReservationEntity() {
		super();

	}

	public ReservationEntity(Long code, int numberOfChildren, int numberOfAdults, LocalDate checkInDate,
			LocalDate checkOutDate, String status, int numberOfNights) {
		super();
		this.code = code;
		this.numberOfChildren = numberOfChildren;
		this.numberOfAdults = numberOfAdults;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.status = status;
		this.numberOfNights = numberOfNights;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public int getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getNumberOfNights() {
		return numberOfNights;
	}

	public void setNumberOfNights(int numberOfNights) {
		this.numberOfNights = numberOfNights;
	}

	@Override
	public String toString() {
		return "ReservationEntity [code=" + code + ", numberOfChildren=" + numberOfChildren + ", numberOfAdults="
				+ numberOfAdults + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", status="
				+ status + ", numberOfNights=" + numberOfNights + "]";
	}

}
