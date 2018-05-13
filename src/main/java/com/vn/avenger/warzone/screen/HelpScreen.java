package com.vn.avenger.warzone.screen;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

public class HelpScreen implements Window<String> {

	@Override
	public String view() {

		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|           |A|v|e|n|g|e|r|  |W|a|r|z|o|n|e|           |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|                       Help Menu                      |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|   Here you can find almost all the information       |").append(NEWLINE);
		screen.append("|   that you need to know about Avenger WarZone        |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|  1)  Monster                                         |").append(NEWLINE);
		screen.append("|  2)  Arsenal                                         |").append(NEWLINE);
		screen.append("|  3)  Gear                                            |").append(NEWLINE);
		screen.append("|  4)  FirstAid                                        |").append(NEWLINE);
		screen.append("|  5)  InstaHealth                                     |").append(NEWLINE);
		screen.append("|  6)  Potion                                          |").append(NEWLINE);
		screen.append("|  7)  Food                                            |").append(NEWLINE);
		screen.append("|  8)  XP                                              |").append(NEWLINE);
		screen.append("|  9)  Achievements                                    |").append(NEWLINE);
		screen.append("| 10)  Back                                            |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);

		return screen.toString();

	}

}