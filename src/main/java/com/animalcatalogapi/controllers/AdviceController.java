package com.animalcatalogapi.controllers;


import dto.ServiceResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@Slf4j
@RestControllerAdvice
public class AdviceController {

    @ExceptionHandler({ Exception.class })
    public ServiceResponse<?> handleErrors(Exception ex, WebRequest request) {
        log.error("Generic error", ex);
        return ServiceResponse.error("Internal server error: " + ex.getMessage());
    }
}
