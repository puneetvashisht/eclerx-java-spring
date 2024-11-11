package com.eclerx.spring_boot_final_demo.utils;

import java.time.LocalDateTime;



public class ErrorReponse {
    
    String message;
    int statusCode;
    LocalDateTime localDateTime;


    
    public String getMessage() {
        return message;
    }



    public void setMessage(String message) {
        this.message = message;
    }



    public int getStatusCode() {
        return statusCode;
    }



    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }



    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }



    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }



    public ErrorReponse(String message, int statusCode) {
        this.localDateTime = LocalDateTime.now();
        this.message = message;
        this.statusCode = statusCode;
    }



    @Override
    public String toString() {
        return "ErrorReponse [message=" + message + ", statusCode=" + statusCode + ", localDateTime=" + localDateTime
                + "]";
    }


    
    
}
