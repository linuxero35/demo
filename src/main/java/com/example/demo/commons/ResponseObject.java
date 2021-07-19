package com.example.demo.commons;

import java.io.Serializable;

public class ResponseObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7830678689621813005L;

	private Object data;
	private int codeHttpStatus;
	private String messageError;

	public ResponseObject(Object data, int codeHttpStatus, String messageError) {
		this.data = data;
		this.codeHttpStatus = codeHttpStatus;
		this.messageError = messageError;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getCodeHttpStatus() {
		return codeHttpStatus;
	}

	public void setCodeHttpStatus(int codeHttpStatus) {
		this.codeHttpStatus = codeHttpStatus;
	}

	public String getMessageError() {
		return messageError;
	}

	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}

}
