package com.amudesh.reservation_module.exception;

public class RoleShouldbeCustomerForBookingException extends RuntimeException{
    String message;
    public RoleShouldbeCustomerForBookingException(String message){
        this.message = message;
    }
}
