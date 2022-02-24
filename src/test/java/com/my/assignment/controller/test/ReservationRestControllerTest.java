/**
 * 
 */
package com.my.assignment.controller.test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.my.assignment.controller.ReservationRestController;
import com.my.assignment.domain.PanormicHotelReservation;
import com.my.assignment.exception.PanormicHotelReservationException;
import com.my.assignment.response.ReservationServiceResponse;
import com.my.assignment.service.impl.ReservationServiceImpl;

import junit.framework.Assert;

/**
 * @author Rajashekara 
 *
 */

@RunWith(MockitoJUnitRunner.class)
public class ReservationRestControllerTest {

   @InjectMocks
   private ReservationRestController reservationController;
     
   @Mock 
   private ReservationServiceImpl reservationService;  

    private ReservationServiceResponse responseEntity;
    
    @Before
    public void init() {
    	
    	MockitoAnnotations.initMocks(this);
    	
    	 responseEntity = new ReservationServiceResponse();
		  responseEntity.setReservationId(100001);
		  responseEntity.setFirstName("Rajashekara"); responseEntity.setLastName("D");
		  responseEntity.setCheckInDate(new Date()); responseEntity.setCheckOutDate(new
		  Date()); responseEntity.setReservationStatus("RESERVED");
		  responseEntity.setRoomNo(503);
    }
    
    @Test
    public void testBookReservation() throws PanormicHotelReservationException {   
	
    	when(reservationService.bookReservationService(Mockito.any(PanormicHotelReservation.class))).thenReturn(responseEntity);      
      
         responseEntity = reservationController.bookReservation(new PanormicHotelReservation());
        Assert.assertEquals(responseEntity.getReservationId(),(new Integer(100001)));
        assertThat(responseEntity.getReservationId()).isEqualTo(100001);
        assertThat(responseEntity.getFirstName()).isEqualTo("Rajashekara");
        assertThat(responseEntity.getLastName()).isEqualTo("D");
        assertThat(responseEntity.getCheckInDate()).isNotNull();
        assertThat(responseEntity.getCheckOutDate()).isNotNull();
        assertThat(responseEntity.getReservationStatus()).isEqualTo("RESERVED");
        assertThat(responseEntity.getRoomNo()).isEqualTo(503);
       
    }
    
    
    @Test
    public void testBookReservationForException() throws PanormicHotelReservationException {
    	
    	when(reservationService.bookReservationService(Mockito.any(PanormicHotelReservation.class))).thenThrow(new PanormicHotelReservationException("Exception Occured while Booking in RestService"));      
    	  responseEntity = reservationController.bookReservation(new PanormicHotelReservation());
    	  assertThat(responseEntity.getReservationStatus()).isEqualTo("Exception Occured while Booking in RestService");
    }
    
    @Test
    public void testGetReservationStatus() throws PanormicHotelReservationException {   
	
    	when(reservationService.getReservationStatusService(Mockito.any(Integer.class))).thenReturn(responseEntity);      
      
         responseEntity = reservationController.getReservationStatus(new Integer(100001));
        Assert.assertEquals(responseEntity.getReservationId(),(new Integer(100001)));
        assertThat(responseEntity.getReservationId()).isEqualTo(100001);
        assertThat(responseEntity.getFirstName()).isEqualTo("Rajashekara");
        assertThat(responseEntity.getLastName()).isEqualTo("D");
        assertThat(responseEntity.getCheckInDate()).isNotNull();
        assertThat(responseEntity.getCheckOutDate()).isNotNull();
        assertThat(responseEntity.getReservationStatus()).isEqualTo("RESERVED");
        assertThat(responseEntity.getRoomNo()).isEqualTo(503);
       
    }
    
    
    @Test
    public void testGetReservationStatusForException() throws PanormicHotelReservationException {
    	
    	when(reservationService.getReservationStatusService(Mockito.any(Integer.class))).thenThrow(new PanormicHotelReservationException("Exception Occured while checking the reservation status"));      
    	  responseEntity = reservationController.getReservationStatus(new Integer(100001));
    	  assertThat(responseEntity.getReservationStatus()).isEqualTo("Exception Occured while checking the reservation status");
    }
    
    @Test
    public void testCancelReservation() throws PanormicHotelReservationException {   
    	responseEntity.setReservationStatus("CANCELED");
    	when(reservationService.cancelReservationService(Mockito.any(Integer.class))).thenReturn(responseEntity);      
      
         responseEntity = reservationController.cancelReservation(new Integer(100001));
        Assert.assertEquals(responseEntity.getReservationId(),(new Integer(100001)));
        assertThat(responseEntity.getReservationId()).isEqualTo(100001);
        assertThat(responseEntity.getFirstName()).isEqualTo("Rajashekara");
        assertThat(responseEntity.getLastName()).isEqualTo("D");
        assertThat(responseEntity.getCheckInDate()).isNotNull();
        assertThat(responseEntity.getCheckOutDate()).isNotNull();
        assertThat(responseEntity.getReservationStatus()).isEqualTo("CANCELED");
        assertThat(responseEntity.getRoomNo()).isEqualTo(503);
       
    }
    
    
    @Test
    public void testCancelReservationForException() throws PanormicHotelReservationException {
    	
    	when(reservationService.cancelReservationService(Mockito.any(Integer.class))).thenThrow(new PanormicHotelReservationException("Exception Occured while checking the reservation status"));      
    	  responseEntity = reservationController.cancelReservation(new Integer(100001));
    	  assertThat(responseEntity.getReservationStatus()).isEqualTo("Exception Occured while cancelling the reservation");
    }

}
