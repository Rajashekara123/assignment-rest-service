/**
 * 
 */
package com.techmahindra.assignment.response;

import java.util.Date;

/**
 * @author Rajashekara
 *<p>
 *This is a ResponseEntity used for the Rest service response
 *</p>
 */
public class ReservationServiceResponse {
	
	private Integer reservationId;
    private String firstName;
    private String lastName;
    private Date checkInDate;
	private Date checkOutDate; 
    private Integer roomNo;
    private String reservationStatus;
    
	/**
	 * @return the reservationId
	 */
	public Integer getReservationId() {
		return reservationId;
	}
	/**
	 * @param reservationId the reservationId to set
	 */
	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the checkInDate
	 */
	public Date getCheckInDate() {
		return checkInDate;
	}
	/**
	 * @param checkInDate the checkInDate to set
	 */
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	/**
	 * @return the checkOutDate
	 */
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	/**
	 * @param checkOutDate the checkOutDate to set
	 */
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	/**
	 * @return the reservationStatus
	 */
	public String getReservationStatus() {
		return reservationStatus;
	}
	/**
	 * @param reservationStatus the reservationStatus to set
	 */
	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}	
	
	/**
	 * @return the roomNo
	 */
	public Integer getRoomNo() {
		return roomNo;
	}
	/**
	 * @param roomNo the roomNo to set
	 */
	public void setRoomNo(Integer roomNo) {
		this.roomNo = roomNo;
	}
	
	/**
	 *
	 */
	@Override
	public String toString() {
		return "ReservationServiceResponse [reservationId=" + reservationId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", roomNo=" + roomNo
				+ ", reservationStatus=" + reservationStatus + "]";
	}
	   
    
    
    
}
