/**
 * 
 */
package com.my.assignment.service.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.my.assignment.domain.PanormicHotelReservation;
import com.my.assignment.exception.PanormicHotelReservationException;
import com.my.assignment.repository.ReservationRepository;
import com.my.assignment.response.ReservationServiceResponse;
import com.my.assignment.service.impl.ReservationServiceImpl;

/**
 * @author Rajashekara 
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ReservationServiceTest {
	 
	   @InjectMocks
	   private ReservationServiceImpl reservationService;
	
	   @Mock
	    private ReservationRepository repository;
	   
	   private PanormicHotelReservation entity;
	   private ReservationServiceResponse responseEntity;
	   @Before
	   public void init() {
		   MockitoAnnotations.initMocks(this);
		   entity = new PanormicHotelReservation();
	    	entity.setReservationId(100001);
	    	entity.setFirstName("Rajashekara");
	    	entity.setLastName("D");
	    	entity.setEmailAddress("rajasheakra.d@gmail.com");
	    	entity.setMobileNo("9481801654");
	    	entity.setCheckInDate(new Date());
	    	entity.setCheckOutDate(new Date());
	    	entity.setNoOfPersons(3);
	    	entity.setNoOfAdults(2);
	    	entity.setNoOfChildrens(1);
	    	entity.setRoomNo(503);
	    	entity.setStatus("RESERVED");
	   }
	   
	   @Test
	   public void testBookReservationService() throws PanormicHotelReservationException {
		   
			  when(repository.checkRoomNoStatus(Mockito.any(Integer.class))).thenReturn(
			  null);
			  when(repository.save(Mockito.any(PanormicHotelReservation.class))).thenReturn
			  (entity);
			  responseEntity = reservationService.bookReservationService(entity);
			  assertThat(responseEntity.getReservationId()).isEqualTo(100001);
		        assertThat(responseEntity.getFirstName()).isEqualTo("Rajashekara");
		        assertThat(responseEntity.getLastName()).isEqualTo("D");
		        assertThat(responseEntity.getCheckInDate()).isNotNull();
		        assertThat(responseEntity.getCheckOutDate()).isNotNull();
		        assertThat(responseEntity.getReservationStatus()).isEqualTo("RESERVED");
		        assertThat(responseEntity.getRoomNo()).isEqualTo(503);
		        
		        when(repository.checkRoomNoStatus(Mockito.any(Integer.class))).thenReturn(
		  			  "RESERVED");
		        responseEntity = reservationService.bookReservationService(entity);
		        assertThat(responseEntity.getReservationStatus()).contains(" Already Booked");
	   }

	   @Test
	   public void testBookReservationServiceForException() {	
			  try {
			      responseEntity = reservationService.bookReservationService(entity);
			  }catch (PanormicHotelReservationException e) {	
				  assertThat(e.getMessage()).isEqualTo("Exception Occured while booking the reservation");
			}
	 
		   
	   }
	   
	   @Test
	   public void testGetReservationStatusService() throws PanormicHotelReservationException {		   
			 
			  when(repository.findById(Mockito.any(Integer.class))).thenReturn
			  (Optional.ofNullable(entity));
			  responseEntity = reservationService.getReservationStatusService(new Integer(100001));
			  assertThat(responseEntity.getReservationId()).isEqualTo(100001);
		        assertThat(responseEntity.getFirstName()).isEqualTo("Rajashekara");
		        assertThat(responseEntity.getLastName()).isEqualTo("D");
		        assertThat(responseEntity.getCheckInDate()).isNotNull();
		        assertThat(responseEntity.getCheckOutDate()).isNotNull();
		        assertThat(responseEntity.getReservationStatus()).isEqualTo("RESERVED");
		        assertThat(responseEntity.getRoomNo()).isEqualTo(503);
		        
		        entity=null;
		        when(repository.findById(Mockito.any(Integer.class))).thenReturn
				  (Optional.ofNullable(entity));
		        responseEntity = reservationService.getReservationStatusService(new Integer(100001));
		        assertThat(responseEntity.getReservationStatus()).contains("Not a Valid Reservation ID");
	   }

	   @Test
	   public void testGetReservationStatusServiceForException() {	
		   when(repository.findById(Mockito.any(Integer.class))).thenThrow(new IllegalArgumentException("IllegalArgumentException"));
			  try {
			   responseEntity = reservationService.getReservationStatusService(new Integer(100001));
			  }catch (PanormicHotelReservationException e) {
				  assertThat(e.getMessage()).isEqualTo("Exception Occured while checking the reservation status");
			}
		   
	   }
	   
	   @Test
	   public void testCancelReservationService() throws PanormicHotelReservationException {		   
			 
			  when(repository.findById(Mockito.any(Integer.class))).thenReturn
			  (Optional.ofNullable(entity));
			  entity.setStatus("CANCELED");
			  when(repository.save(Mockito.any(PanormicHotelReservation.class))).thenReturn
			  (entity);
			  responseEntity = reservationService.cancelReservationService(new Integer(100001));
			  assertThat(responseEntity.getReservationId()).isEqualTo(100001);
		        assertThat(responseEntity.getFirstName()).isEqualTo("Rajashekara");
		        assertThat(responseEntity.getLastName()).isEqualTo("D");
		        assertThat(responseEntity.getCheckInDate()).isNotNull();
		        assertThat(responseEntity.getCheckOutDate()).isNotNull();
		        assertThat(responseEntity.getReservationStatus()).isEqualTo("CANCELED");
		        assertThat(responseEntity.getRoomNo()).isEqualTo(503);
		        
		        entity=null;
		        when(repository.findById(Mockito.any(Integer.class))).thenReturn
				  (Optional.ofNullable(entity));
		        responseEntity = reservationService.cancelReservationService(new Integer(100001));
		        assertThat(responseEntity.getReservationStatus()).contains("Not a Valid Reservation ID");
	   }

	   @Test
	   public void testCancelReservationServiceForException() {	
		   when(repository.findById(Mockito.any(Integer.class))).thenThrow(new IllegalArgumentException("IllegalArgumentException"));
			  try {
			   responseEntity = reservationService.cancelReservationService(new Integer(100001));
			  }catch (PanormicHotelReservationException e) {
				  assertThat(e.getMessage()).isEqualTo("Exception Occured while cancelling the reservation");
			}
		   
	   }
}
