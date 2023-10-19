package com.rodrigoDrummond.WebServiceSpringJPA.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	//recebe id do objeto que tentou ser encontrado, mas não foi(que lançou exceção)
	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id " + id);
		
	}

}
