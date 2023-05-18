package it.ErdisonDosti.exeption;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;


@RequiredArgsConstructor
public class ApiExeption {

    private  final String message;
    private Throwable throwable;
    private  final HttpStatus httpStatus;
    private final ZonedDateTime timestamp;


}
