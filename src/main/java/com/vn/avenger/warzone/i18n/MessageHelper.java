package com.vn.avenger.warzone.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class MessageHelper {

	public static final String LANGUAGE = Locale.ENGLISH.getLanguage();
	public static final String COUNTRY = Locale.US.getCountry();
	public static final Locale LOCALE = new Locale(LANGUAGE, COUNTRY);
	public static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle("com.vn.avenger.warzone.i18N.resource.message", LOCALE);

	public static String getMessage(MessageCodes messageCodes) {

		String message = RESOURCE_BUNDLE.getString(messageCodes.getMessageKey());

		if (messageCodes.getArguments() != null) {
			message = String.format(message, messageCodes.getArguments());
		}

		return message;
	}
}
