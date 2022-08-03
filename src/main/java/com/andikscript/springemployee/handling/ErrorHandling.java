package com.andikscript.springemployee.handling;

import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandling {

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public String notSupport(HttpRequestMethodNotSupportedException c) {
        return "error";
    }
}
