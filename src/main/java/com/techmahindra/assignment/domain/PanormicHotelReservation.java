/**
 * 
 */
package com.techmahindra.assignment.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author Rajashekara 
 *
 *<P>
 *This is Spring Boot JPA Repo Entity class used to store and manipulate the PanormicHotelReservation 
 *user data in Data base  by ReservationRepository
 *</p>
 */
@Entity
@SequenceGenerator(name="seq", initialValue=10001, allocationSize=10000000)
public class PanormicHotelReservation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7568338378145071016L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")	
	private int reservationId;
	private String firstName;
	private String lastName;
	private String status;
	private String emailAddress;
	private String mobileNo;
	private Date checkInDate;
	private Date checkOutDate;
	private int noOfPersons;
	private int noOfAdults;
	private int noOfChildrens;
	private int roomNo;
	/**
	 * @return the reservationId
	 */
	public int getReservationId() {
		return reservationId;
	}
	/**
	 * @param reservationId the reservationId to set
	 */
	public void setReservationId(int reservationId) {
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
	 * @return the noOfPersons
	 */
	public int getNoOfPersons() {
		return noOfPersons;
	}
	/**
	 * @param noOfPersons the noOfPersons to set
	 */
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	/**
	 * @return the noOfAdults
	 */
	public int getNoOfAdults() {
		return noOfAdults;
	}
	/**
	 * @param noOfAdults the noOfAdults to set
	 */
	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	/**
	 * @return the noOfChildrens
	 */
	public int getNoOfChildrens() {
		return noOfChildrens;
	}
	/**
	 * @param noOfChildrens the noOfChildrens to set
	 */
	public void setNoOfChildrens(int noOfChildrens) {
		this.noOfChildrens = noOfChildrens;
	}
	/**
	 * @return the roomNo
	 */
	public int getRoomNo() {
		return roomNo;
	}
	/**
	 * @param roomNo the roomNo to set
	 */
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	/**
	 *
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checkInDate == null) ? 0 : checkInDate.hashCode());
		result = prime * result + ((checkOutDate == null) ? 0 : checkOutDate.hashCode());
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + noOfAdults;
		result = prime * result + noOfChildrens;
		result = prime * result + noOfPersons;
		result = prime * result + reservationId;
		result = prime * result + roomNo;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	/**
	 *
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PanormicHotelReservation other = (PanormicHotelReservation) obj;
		if (checkInDate == null) {
			if (other.checkInDate != null)
				return false;
		} else if (!checkInDate.equals(other.checkInDate))
			return false;
		if (checkOutDate == null) {
			if (other.checkOutDate != null)
				return false;
		} else if (!checkOutDate.equals(other.checkOutDate))
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		if (noOfAdults != other.noOfAdults)
			return false;
		if (noOfChildrens != other.noOfChildrens)
			return false;
		if (noOfPersons != other.noOfPersons)
			return false;
		if (reservationId != other.reservationId)
			return false;
		if (roomNo != other.roomNo)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	/**
	 *
	 */
	@Override
	public String toString() {
		return "PanormicHotelReservation [reservationId=" + reservationId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", status=" + status + ", emailAddress=" + emailAddress + ", mobileNo=" + mobileNo
				+ ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", noOfPersons=" + noOfPersons
				+ ", noOfAdults=" + noOfAdults + ", noOfChildrens=" + noOfChildrens + ", roomNo=" + roomNo + "]";
	}
	
	
	
	

}
