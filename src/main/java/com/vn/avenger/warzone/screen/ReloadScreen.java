package com.vn.avenger.warzone.screen;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

public class ReloadScreen implements Window<String> {

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
		screen.append("|   Do you want to load your game from saved file ?    |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|  1)  Yes                                             |").append(NEWLINE);
		screen.append("|  2)  No, Start a new game.                           |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);

		return screen.toString();

	}
}
