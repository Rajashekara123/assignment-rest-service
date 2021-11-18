/**
 * 
 */
package com.techmahindra.assignment.exception;

/**
 * @author Rajashekara 
 *<P>
 * This class used for exception handling in the project.
 * </p>
 */
public class PanormicHotelReservationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7412279287576478984L;
	

    /**
     * 
     */
    public PanormicHotelReservationException() {
        super();
    }

   
    /**
     * @param message
     */
    public PanormicHotelReservationException(String message) {
        super(message);
    }

    
    /**
     * @param message
     * @param cause
     */
    public PanormicHotelReservationException(String message, Throwable cause) {
        super(message, cause);
    }


    /**
     * @param cause
     */
    public PanormicHotelReservationException(Throwable cause) {
        super(cause);
    }


    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    protected PanormicHotelReservationException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
