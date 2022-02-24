/**
 * 
 */
package com.my.assignment.service;

import org.springframework.stereotype.Service;

import com.my.assignment.domain.PanormicHotelReservation;
import com.my.assignment.exception.PanormicHotelReservationException;
import com.my.assignment.response.ReservationServiceResponse;

/**
 * @author Rajashekara 
 *
 *<p>
 *This is a PanormicHotelReservationApplication service interface, implementation class link {ReservationServiceImpl}
 *<p>
 */
@Service
public interface ReservationService {

	/**
	 * @param panormicHotelReservation
	 * @return
	 */
	public ReservationServiceResponse bookReservationService(PanormicHotelReservation panormicHotelReservation) throws PanormicHotelReservationException;
	/**
	 * @param reservationId
	 * @return
	 */
	public ReservationServiceResponse getReservationStatusService(Integer reservationId) throws PanormicHotelReservationException;
	/**
	 * @param reservationId
	 * @return
	 */
	public ReservationServiceResponse cancelReservationService(Integer reservationId) throws PanormicHotelReservationException; 
	
}
