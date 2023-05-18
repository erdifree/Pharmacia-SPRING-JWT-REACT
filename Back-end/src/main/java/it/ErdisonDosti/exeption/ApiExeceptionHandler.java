package it.ErdisonDosti.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;


@ControllerAdvice
public class ApiExeceptionHandler {

    @ExceptionHandler(value = {ApiRequestExeption.class})
    public ResponseEntity<Object> handleApiRequestExeption(ApiRequestExeption e){
        //1 Create a payload contaning exeption details
        HttpStatus httpStatus=HttpStatus.BAD_REQUEST;
        ApiExeption apiExeption = new ApiExeption(
                e.getMessage(),
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        //Return response entity
        return  new ResponseEntity<>(apiExeption,httpStatus);
    }
}