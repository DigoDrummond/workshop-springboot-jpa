package com.rodrigoDrummond.WebServiceSpringJPA.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.rodrigoDrummond.WebServiceSpringJPA.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

/*tratamento manual dos erros
 * 
 * 
 * 
 * 
 * */

@ControllerAdvice//intercepta excessões para serem tratadas
public class ResourceExceptionHandler {

	//método intercepta qualquer excessão do tipo entre parentêses
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource not found!";
		//troca status para 404
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(),status.value(),error,e.getMessage(),request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}
