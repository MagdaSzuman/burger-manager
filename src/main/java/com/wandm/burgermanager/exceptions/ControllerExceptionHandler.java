package com.wandm.burgermanager.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice(basePackages = "com.wandm.burgermanager.controller")
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {ThingDoesNotExistException.class})
    public ResponseEntity<Object> handlerThingDoesNotExistException(Exception ex, WebRequest webRequest) {
        String bodyError = "You've got burgerError ;P";
        return handleExceptionInternal(ex, bodyError, new HttpHeaders(), HttpStatus.BAD_REQUEST, webRequest);
    }
}
