/**
 * 
 */
package com.techmahindra.assignment.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmahindra.assignment.domain.PanormicHotelReservation;
import com.techmahindra.assignment.exception.PanormicHotelReservationException;
import com.techmahindra.assignment.repository.ReservationRepository;
import com.techmahindra.assignment.response.ReservationServiceResponse;
import com.techmahindra.assignment.service.ReservationService;

/**
 * @author Rajashekara
 *
 *<p>
 *This is a PanormicHotelReservationApplication service implementation class for link {ReservationService}
 *<p>
 */
@Service
public class ReservationServiceImpl implements ReservationService {
	
	private Logger logger = LoggerFactory.getLogger(ReservationServiceImpl.class);

	@Autowired
	private ReservationRepository reservationRepository;

	/**
	 * @throws PanormicHotelReservationException 
	 *
	 */
	public ReservationServiceResponse bookReservationService(PanormicHotelReservation panormicHotelReservation) throws PanormicHotelReservationException {
		logger.info("addReservation started for {}",panormicHotelReservation);
		ReservationServiceResponse response = new ReservationServiceResponse();
		            try {
		               String status= reservationRepository.checkRoomNoStatus(panormicHotelReservation.getRoomNo());
		             
		             if( status == null || status.isEmpty() || !status.equalsIgnoreCase("RESERVED")) {
				            panormicHotelReservation.setStatus("RESERVED");
							panormicHotelReservation = reservationRepository.save(panormicHotelReservation);
							createResponse(panormicHotelReservation, response);
							response.setReservationStatus(panormicHotelReservation.getStatus());
							logger.info("Room No {} is {}",panormicHotelReservation.getRoomNo(),panormicHotelReservation.getStatus());
			          }else {
			        	    createResponse(panormicHotelReservation, response);
			        	    String statusMessage= "Room No - "+panormicHotelReservation.getRoomNo()+ " Already Booked";
							response.setReservationStatus(statusMessage);
							logger.info(statusMessage);
			          }
		            }catch (Exception e) {
						logger.error("Exception occured - {}",e.getMessage());
						logger.error("Detailed exception",e);
						throw new PanormicHotelReservationException("Exception Occured while booking the reservation", e);
					}
		return response;
	}

	/**
	 * @param panormicHotelReservation
	 * @param response
	 */
	private void createResponse(PanormicHotelReservation panormicHotelReservation,
			ReservationServiceResponse response) {
		response.setReservationId(panormicHotelReservation.getReservationId());
		response.setFirstName(panormicHotelReservation.getFirstName());
		response.setLastName(panormicHotelReservation.getLastName());
		response.setCheckInDate(panormicHotelReservation.getCheckInDate());
		response.setCheckOutDate(panormicHotelReservation.getCheckOutDate());
		response.setRoomNo(panormicHotelReservation.getRoomNo());
	}

	/**
	 * @throws PanormicHotelReservationException 
	 *
	 */
	public ReservationServiceResponse getReservationStatusService(Integer reservationId) throws PanormicHotelReservationException {
		logger.info("getReservationStatus for {}",reservationId);
		ReservationServiceResponse response = new ReservationServiceResponse();
		try {
			Optional<PanormicHotelReservation> panormicHotelReservation = reservationRepository.findById(reservationId);
		     if(panormicHotelReservation.isPresent()) {
		    	 createResponse(panormicHotelReservation.get(), response);		
		    	 response.setReservationStatus(panormicHotelReservation.get().getStatus());
		     }else {
		    	 response.setReservationId(reservationId);
		    	 response.setReservationStatus("Not a Valid Reservation ID");
		    	 logger.info("Reservation ID not exists");
		     }
		}catch (Exception e) {
			logger.error("Exception occured - {}",e.getMessage());
			logger.error("Detailed exception",e);
			throw new PanormicHotelReservationException("Exception Occured while checking the reservation status", e);
		
		}
		return response;
	}

	/**
	 * @throws PanormicHotelReservationException 
	 *
	 */
	public ReservationServiceResponse cancelReservationService(Integer reservationId) throws PanormicHotelReservationException {		
		logger.info("cancelReservation for {}",reservationId);
		ReservationServiceResponse response = new ReservationServiceResponse();
		try {
			Optional<PanormicHotelReservation> panormicHotelReservationOp = reservationRepository.findById(reservationId);
		     if(panormicHotelReservationOp.isPresent()) {					
				 PanormicHotelReservation panormicHotelReservation = panormicHotelReservationOp.get(); 
				 panormicHotelReservation.setStatus("CANCELED");		    	
		    	 panormicHotelReservation = reservationRepository.save(panormicHotelReservation);
		    	 createResponse(panormicHotelReservationOp.get(), response);		
		    	 response.setReservationStatus(panormicHotelReservation.getStatus());
		     }else {
		    	 response.setReservationId(reservationId);
		    	 response.setReservationStatus("Not a Valid Reservation ID");
		    	 logger.info("Reservation ID not exists");
		     }
		}catch (Exception e) {
			logger.error("Exception occured - {}",e.getMessage());
			logger.error("Detailed exception",e);
			throw new PanormicHotelReservationException("Exception Occured while cancelling the reservation", e);
		
		}
		return response;
	}
	

}
