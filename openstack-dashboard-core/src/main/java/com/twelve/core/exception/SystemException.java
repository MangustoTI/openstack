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
public class SystemException extends RuntimeException {


	private static final long serialVersionUID = -1105498427178034443L;
	private String mensagem;
    
    public SystemException(Throwable throwable) {
        super(throwable);
    }
    
    public SystemException(String mensagem, Throwable throwable) {
        super(mensagem, throwable);
    	this.setMensagem(mensagem);
    }

    public SystemException(String string) {
        super(string);
        this.setMensagem(string);
    }

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
