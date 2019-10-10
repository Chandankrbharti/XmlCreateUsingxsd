package com.websystique.xml.model;

@SuppressWarnings("serial")
public class ConverterException extends RuntimeException{

	public ConverterException(){
		super();
	}
	
	public ConverterException(String message, Throwable cause){
		super(message,cause);
	}
	
	public ConverterException(String message){
		super(message);
	}

	public ConverterException(Throwable cause){
		super(cause);
	}

}
