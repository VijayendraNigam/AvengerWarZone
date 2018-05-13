package com.vn.avenger.warzone.screen;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

public class UsernameScreen implements Window<String> {

	@Override
	public String view() {

		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|           |A|v|e|n|g|e|r|  |W|a|r|z|o|n|e|           |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|              Please enter your username              |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);
		screen.append("                                                        ").append(NEWLINE);

		return screen.toString();

	}
	
}
