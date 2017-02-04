package com.ft.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	@ExceptionHandler(Exception.class)
	public void defaultErrorHandler(HttpServletRequest req, Exception e){
		 e.printStackTrace();
		 System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
		
	}

}
