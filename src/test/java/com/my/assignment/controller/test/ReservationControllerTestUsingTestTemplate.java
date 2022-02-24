/**
 * 
 */
package com.my.assignment.controller.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.my.assignment.domain.PanormicHotelReservation;
import com.my.assignment.response.ReservationServiceResponse;

/**
 * @author Rajashekara
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ReservationControllerTestUsingTestTemplate {

	@LocalServerPort
	private int port;
	@Autowired
	private TestRestTemplate restTemplate;

	private PanormicHotelReservation entity;

	@Before
	public void init() {
		restTemplate = new TestRestTemplate();
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
	public void testBookReservatio() throws Exception {
		ResponseEntity<ReservationServiceResponse> response = this.restTemplate.postForEntity(
				"http://localhost:" + port + "/reservation/book", entity, ReservationServiceResponse.class);
		assertThat(response.getBody().getFirstName()).isEqualTo("Rajashekara");
	}

	@Test
	public void testStatusReservation() throws Exception {
		this.restTemplate.postForEntity("http://localhost:" + port + "/reservation/book", entity,
				ReservationServiceResponse.class);
		ResponseEntity<ReservationServiceResponse> response = this.restTemplate.getForEntity(
				"http://localhost:" + port + "/reservation/status?reservationId=" + 10001,
				ReservationServiceResponse.class);
		assertThat(response.getBody().getReservationStatus()).isEqualTo("RESERVED");
	}

	@Test
	public void testCancelReservation() throws Exception {
		this.restTemplate.postForEntity("http://localhost:" + port + "/reservation/book", entity,
				ReservationServiceResponse.class);
		ResponseEntity<ReservationServiceResponse> response = this.restTemplate.exchange(
				"http://localhost:" + port + "/reservation/cancel?reservationId=" + 10001, HttpMethod.DELETE, null,
				ReservationServiceResponse.class);
		assertThat(response.getBody().getReservationStatus()).isEqualTo("CANCELED");		
    }
}
