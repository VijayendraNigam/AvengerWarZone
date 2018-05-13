package com.vn.avenger.warzone.screen;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;
import static com.vn.avenger.warzone.common.Helper.STAGE;
import static com.vn.avenger.warzone.common.Helper.VERSION;

public class AboutScreen implements Window<String> {

	@Override
	public String view() {

		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|           |A|v|e|n|g|e|r|  |W|a|r|z|o|n|e|           |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|                         About                        |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|           Avenger WarZone   ").append(STAGE).append("  ").append(VERSION)
		      .append("           |")                                            .append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|  As a player you can create a character              |").append(NEWLINE);
		screen.append("|  As a player you can explore                         |").append(NEWLINE);
		screen.append("|  As a player you gain experience through fighting    |").append(NEWLINE);
		screen.append("|  As a player you can save and resume a game          |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|  It is currently in Alpha Stage which mean it's      |").append(NEWLINE);
		screen.append("|  still in initial development, and will contain      |").append(NEWLINE);
		screen.append("|  lot of bugs and missing features.                   |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);

		return screen.toString();
	}

}
