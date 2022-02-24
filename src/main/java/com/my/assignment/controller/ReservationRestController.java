/**
 * 
 */
package com.my.assignment.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.assignment.domain.PanormicHotelReservation;
import com.my.assignment.exception.PanormicHotelReservationException;
import com.my.assignment.response.ReservationServiceResponse;
import com.my.assignment.service.ReservationService;

/**
 * @author Rajashekara
 * <P>
 * This is RestController to provide the rest methods/end points to the clients 
 * for Reservation, Status and Cancellation 
 * </P>
 */
@RestController
@RequestMapping(path = "/reservation")
public class ReservationRestController {
	
	Logger logger = LoggerFactory.getLogger(ReservationRestController.class);
	
	@Autowired
	private ReservationService reservationService;
    
	@RequestMapping(value="/book", method=RequestMethod.POST)  
	public ReservationServiceResponse bookReservation(@RequestBody PanormicHotelReservation panormicHotelReservation) {
		 logger.debug("inside bookReservation restService Method");
		 ReservationServiceResponse resServiceResponse;
		 try {
			 resServiceResponse= reservationService.bookReservationService(panormicHotelReservation);
			 logger.info("Booking Response Meesage is \n {}",resServiceResponse);
		 }catch (PanormicHotelReservationException e) {
			logger.error("Ëxception is - {}",e.getMessage());
			resServiceResponse = new ReservationServiceResponse();
			resServiceResponse.setReservationStatus("Exception Occured while Booking in RestService");
		}
		return resServiceResponse;
		
	}
	
	@RequestMapping(value="/status", method=RequestMethod.GET)  
	public ReservationServiceResponse getReservationStatus(@RequestParam Integer reservationId) {
		 logger.debug("inside getReservationStatus restService Method");
		 ReservationServiceResponse resServiceResponse;
		 try {
			  resServiceResponse= reservationService.getReservationStatusService(reservationId);
			  logger.info("ReservationStatus Response Meesage is \n {}",resServiceResponse);
		 }catch (PanormicHotelReservationException e) {
				logger.error("Ëxception is - {}",e.getMessage());
				resServiceResponse = new ReservationServiceResponse();
				resServiceResponse.setReservationStatus("Exception Occured while checking the reservation status");
			}
		return resServiceResponse;
		
	}
	
	
	  @RequestMapping(value="/cancel", method=RequestMethod.DELETE)
	  public ReservationServiceResponse cancelReservation(@RequestParam Integer reservationId) {
	   logger.debug("inside cancelReservation restService Method");
		 ReservationServiceResponse resServiceResponse;
		 try {
			  resServiceResponse= reservationService.cancelReservationService(reservationId);
			  logger.info("cancelReservation Response Meesage is \n {}",resServiceResponse);
		 }catch (PanormicHotelReservationException e) {
				logger.error("Ëxception is - {}",e.getMessage());
				resServiceResponse = new ReservationServiceResponse();
				resServiceResponse.setReservationStatus("Exception Occured while cancelling the reservation");
			}
		return resServiceResponse;
	  }
	 
}
