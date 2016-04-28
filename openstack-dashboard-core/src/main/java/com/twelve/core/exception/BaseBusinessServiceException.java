/**
 *
 * Copyright TWELVE 2016 All Rights Reserved. 
 * No part of this Portal may be reproduced without BTG Pactual's express consent.
 * 
 */
package com.twelve.core.exception;



/**
 * @author Luiz Arantes
 * @since 15/04/2016
 * @version 1.0
 *
 */
public class BaseBusinessServiceException extends Exception {

	private static final long serialVersionUID = 8727208879430676712L;
	private String messageLocale;
	private String message;

	public BaseBusinessServiceException(Throwable throwable) {
		super(throwable);
	}

	public BaseBusinessServiceException(String message) {
		super(message);
		this.message = message;
		this.messageLocale = message;
	}

	public BaseBusinessServiceException(String message, String messageLocale) {
		super(message);
		this.message = message;
		this.messageLocale = messageLocale;
	}

	public BaseBusinessServiceException(String message, Throwable cause, String messageLocale) {
		super(message, cause);
		this.message = message;
		this.messageLocale = messageLocale;
	}

	public BaseBusinessServiceException(String message, Throwable throwable) {
		super(message, throwable);
		this.message = message;
		this.messageLocale = message;
	}

	public String getMessageLocale() {
		return messageLocale;
	}

	public void setMessageLocale(String messageLocale) {
		this.messageLocale = messageLocale;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
