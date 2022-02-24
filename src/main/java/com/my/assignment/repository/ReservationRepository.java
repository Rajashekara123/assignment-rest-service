package com.my.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.my.assignment.domain.PanormicHotelReservation;

/**
 * @author Rajashekara
 * <p>
 * This is JpaRepository of the application used for the CRUD operation with data base
 * </p>
 */
@Repository
public interface ReservationRepository extends JpaRepository<PanormicHotelReservation, Integer> {

	@Query("SELECT p.status FROM PanormicHotelReservation p WHERE p.roomNo = :roomNo")
	String checkRoomNoStatus(@Param("roomNo") Integer roomNo);	
}
