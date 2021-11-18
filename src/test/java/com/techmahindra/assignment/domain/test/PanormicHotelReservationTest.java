/**
 * 
 */
package com.techmahindra.assignment.domain.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.techmahindra.assignment.domain.PanormicHotelReservation;
import com.techmahindra.assignment.response.ReservationServiceResponse;

/**
 * @author Rajashekara
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class PanormicHotelReservationTest {
	
	private PanormicHotelReservation entity;
	
	@Before
	public void init() {
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
	public void testGetters() {
		assertThat(entity.getReservationId()).isEqualTo(100001);
		assertThat(entity.getFirstName()).isEqualTo("Rajashekara");
		assertThat(entity.getLastName()).isEqualTo("D");
		assertThat(entity.getEmailAddress()).isEqualTo("rajasheakra.d@gmail.com");
		assertThat(entity.getMobileNo()).isEqualTo("9481801654");
		assertThat(entity.getCheckInDate()).isNotNull();
		assertThat(entity.getCheckOutDate()).isNotNull();
		assertThat(entity.getNoOfPersons()).isEqualTo(3);
		assertThat(entity.getNoOfAdults()).isEqualTo(2);
		assertThat(entity.getNoOfChildrens()).isEqualTo(1);
		assertThat(entity.getRoomNo()).isEqualTo(503);
		assertThat(entity.getStatus()).isEqualTo("RESERVED");
	}
	
	@Test
	public void testEquals() {
		PanormicHotelReservation entity1= entity;
		assertTrue(entity1.equals(entity));	
		entity1 = new PanormicHotelReservation();
		entity1.setReservationId(100001);
		entity1.setFirstName("Rajashekara");
    	entity1.setLastName("D");
    	entity1.setEmailAddress("rajasheakra.d@gmail.com");
    	entity1.setMobileNo("9481801654");
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setNoOfPersons(3);
    	entity1.setNoOfAdults(2);
    	entity1.setNoOfChildrens(1);
    	entity1.setRoomNo(503);
    	entity1.setStatus("RESERVED");
    	assertTrue(entity1.equals(entity));	
    	entity1.setCheckInDate(null);
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(null);
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setFirstName(null);
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setFirstName("Rajashekara");
    	entity1.setLastName(null);
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setFirstName("Rajashekara");
    	entity1.setLastName("D");
    	entity1.setMobileNo(null);
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setFirstName("Rajashekara");
    	entity1.setLastName("D");
    	entity1.setMobileNo("9481801654");
    	entity1.setEmailAddress(null);
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setFirstName("Rajashekara");
    	entity1.setLastName("D");
    	entity1.setMobileNo("9481801654");
    	entity1.setEmailAddress("rajasheakra.d@gmail.com");
    	entity1.setStatus(null);
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setFirstName("Rajashekara");
    	entity1.setLastName("D");
    	entity1.setMobileNo("9481801654");
    	entity1.setEmailAddress("rajasheakra.d@gmail.com");
    	entity1.setStatus("RESERVED");
    	entity1.setReservationId(2);
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setFirstName("Rajashekara");
    	entity1.setLastName("D");
    	entity1.setMobileNo("9481801654");
    	entity1.setEmailAddress("rajasheakra.d@gmail.com");
    	entity1.setStatus("RESERVED");
    	entity1.setReservationId(100001);
    	entity1.setNoOfPersons(5);
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setFirstName("Rajashekara");
    	entity1.setLastName("D");
    	entity1.setMobileNo("9481801654");
    	entity1.setEmailAddress("rajasheakra.d@gmail.com");
    	entity1.setStatus("RESERVED");
    	entity1.setReservationId(100001);
    	entity1.setNoOfPersons(3);
    	entity1.setNoOfAdults(1);
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setFirstName("Rajashekara");
    	entity1.setLastName("D");
    	entity1.setMobileNo("9481801654");
    	entity1.setEmailAddress("rajasheakra.d@gmail.com");
    	entity1.setStatus("RESERVED");
    	entity1.setReservationId(100001);
    	entity1.setNoOfPersons(3);
    	entity1.setNoOfAdults(2);
    	entity1.setNoOfChildrens(2);
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setFirstName("Rajashekara");
    	entity1.setLastName("D");
    	entity1.setMobileNo("9481801654");
    	entity1.setEmailAddress("rajasheakra.d@gmail.com");
    	entity1.setStatus("RESERVED");
    	entity1.setReservationId(100001);
    	entity1.setNoOfPersons(3);
    	entity1.setNoOfAdults(2);
    	entity1.setNoOfChildrens(1);
    	entity1.setRoomNo(609);
    	assertFalse(entity1.equals(entity));
    	
    	Date dt = new Date();
    	Calendar c = Calendar.getInstance(); 
    	c.setTime(dt); 
    	c.add(Calendar.DATE, 1);
    	
    	entity1.setCheckInDate(c.getTime());
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(c.getTime());
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setFirstName("Rajas");
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setFirstName("Rajashekara");
    	entity1.setLastName("drew");
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setFirstName("Rajashekara");
    	entity1.setLastName("D");
    	entity1.setMobileNo("3634643");
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setFirstName("Rajashekara");
    	entity1.setLastName("D");
    	entity1.setMobileNo("9481801654");
    	entity1.setEmailAddress("ttqtq");
    	assertFalse(entity1.equals(entity));
    	entity1.setCheckInDate(new Date());
    	entity1.setCheckOutDate(new Date());
    	entity1.setFirstName("Rajashekara");
    	entity1.setLastName("D");
    	entity1.setMobileNo("9481801654");
    	entity1.setEmailAddress("rajasheakra.d@gmail.com");
    	entity1.setStatus("CANCELED");
    	assertFalse(entity1.equals(entity));
    	assertFalse(entity1.equals(null));
    	assertFalse(entity1.equals(new ReservationServiceResponse()));
	}
	
	@Test
	public void testHashCode() {	
		int hascode= entity.hashCode();		
		assertTrue(hascode != 0 );
	}
	
	@Test
	public void testToString() {	
		PanormicHotelReservation entity1= entity;
		assertTrue(entity1.toString().equals(entity.toString()));	
	}
}
