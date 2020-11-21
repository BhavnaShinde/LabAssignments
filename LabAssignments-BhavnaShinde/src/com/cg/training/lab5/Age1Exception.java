package com.cg.training.lab5;
public class Age1Exception extends Exception {
	private String message;

	public Age1Exception() {

	}

	public Age1Exception(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return this.message;
	}


}
