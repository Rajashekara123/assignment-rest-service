/**
 * 
 */
package com.techmahindra.assignment.service;

import org.springframework.stereotype.Service;

import com.techmahindra.assignment.domain.PanormicHotelReservation;
import com.techmahindra.assignment.exception.PanormicHotelReservationException;
import com.techmahindra.assignment.response.ReservationServiceResponse;

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
