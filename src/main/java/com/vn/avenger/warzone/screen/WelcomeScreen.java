package com.vn.avenger.warzone.screen;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

public class WelcomeScreen implements Window<String> {

	@Override
	public String render() {

		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|           |A|v|e|n|g|e|r|  |W|a|r|z|o|n|e|           |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|            A text-based role fighting game           |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|          To get started, Type in a number below      |").append(NEWLINE);
		screen.append("|                     and press ENTER                  |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|  1) Start Game                                       |").append(NEWLINE);
		screen.append("|  2) About Game                                       |").append(NEWLINE);
		screen.append("|  3) Exit                                             |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|              Copyright © Vijayendra Nigam            |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);

		return screen.toString();
	}

}
