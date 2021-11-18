/**
 * 
 */
package com.techmahindra.assignment.test;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.techmahindra.assignment.PanormicHotelReservationApplication;

/**
 * @author Rajashekara
 *
 */
@RunWith(SpringRunner.class) 
@SpringBootTest
public class PanormicHotelReservationApplicationTest {	
	
	 @Test
	  public void applicationStarts() {
		 PanormicHotelReservationApplication.main(new String[] {});
	  }

}
