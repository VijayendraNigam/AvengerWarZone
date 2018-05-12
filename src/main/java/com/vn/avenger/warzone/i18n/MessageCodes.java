package com.vn.avenger.warzone.i18n;

public enum MessageCodes {

	BUY_SUCCESS("BUY_OK"), 
	BUY_FAIL_FUND("BUY_FAIL_FUND"), 
	BUY_FAIL_LEVEL("BUY_FAIL_LEVEL"),

	USE_SUCCESS("USE_OK"),
	
	ACQUIRE_SUCCESS("ACQUIRE_OK")
	
	;

	private String messageKey;
	private Object[] arguments;

	MessageCodes(String messageKey) {
		this.messageKey = messageKey;
		this.arguments = null;
	}

	public String getMessageKey() {
		return messageKey;
	}

	public MessageCodes setArguments(Object... arguments) {
		this.arguments = arguments;
		return this;
	}

	public Object[] getArguments() {
		return this.arguments;
	}

}
