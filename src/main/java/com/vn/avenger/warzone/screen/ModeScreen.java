package com.vn.avenger.warzone.screen;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

import com.vn.avenger.warzone.common.constants.Enums.GAME;

public class ModeScreen implements Window<String> {

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
		screen.append("|         Which mode would you like to play ?          |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);

		int i = 1;
		for (GAME.MODE mode : GAME.MODE.values()) {
			screen.append("|  ").append(i++).append(") ").append(mode.getMode()).append(NEWLINE);
		}

		screen.append("|______________________________________________________").append(NEWLINE);

		return screen.toString();

	}

}
