package com.cg.bugtracking.exceptions;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cg.bugtracking.payload.BaseErrorResponse;
import com.cg.bugtracking.payload.ValidationErrorResponse;


@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {

	private final String BAD_REQUEST = "BAD_REQUEST";
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> customHandleNotFound(Exception ex, WebRequest request) {
		
		BaseErrorResponse errors = new BaseErrorResponse();
		errors.setTimestamp(LocalDateTime.now());
		errors.setMessage(ex.getMessage());
		errors.setStatusCode(-1);

		return new ResponseEntity<>(errors,HttpStatus.NOT_FOUND);

	}	

}
