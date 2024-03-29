package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<MyErrorDetails> myAnyExpHandler(Exception ie, WebRequest req) {

        MyErrorDetails err = new MyErrorDetails();
        err.setTimestamp(LocalDateTime.now());
        err.setMessage(ie.getMessage());
        err.setDetails(req.getDescription(false));

        return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(LoginException.class)
    public ResponseEntity<MyErrorDetails> myAnyExpHandler(LoginException ie, WebRequest req) {

        MyErrorDetails err = new MyErrorDetails();
        err.setTimestamp(LocalDateTime.now());
        err.setMessage(ie.getMessage());
        err.setDetails(req.getDescription(false));

        return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(UserException.class)
    public ResponseEntity<MyErrorDetails> myAnyExpHandler(UserException ie, WebRequest req) {


        MyErrorDetails err = new MyErrorDetails();
        err.setTimestamp(LocalDateTime.now());
        err.setMessage(ie.getMessage());
        err.setDetails(req.getDescription(false));


        return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);

    }
    @ExceptionHandler(BookException.class)
    public ResponseEntity<MyErrorDetails> myAnyExpHandler(BookException ie, WebRequest req) {
    	
    	
    	MyErrorDetails err = new MyErrorDetails();
    	err.setTimestamp(LocalDateTime.now());
    	err.setMessage(ie.getMessage());
    	err.setDetails(req.getDescription(false));
    	
    	
    	return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
    	
    }

    //to handle Not found exception
    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<MyErrorDetails> mynotFoundHandler(NoHandlerFoundException nfe, WebRequest req) {

        MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));

        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);

    }

   


}

