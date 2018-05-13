package com.vn.avenger.warzone.screen.shop;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

import com.vn.avenger.warzone.screen.Window;

public class ShopScreen implements Window<String> {

	@Override
	public String view() {

		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|           |A|v|e|n|g|e|r|  |W|a|r|z|o|n|e|           |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|                   Welcome to Shop                    |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|  1)  Arsenal                                         |").append(NEWLINE);
		screen.append("|  2)  Gear                                            |").append(NEWLINE);
		screen.append("|  3)  First-Aid                                       |").append(NEWLINE);
		screen.append("|  4)  InstaHealth                                     |").append(NEWLINE);
		screen.append("|  5)  Potion                                          |").append(NEWLINE);
		screen.append("|  6)  Food                                            |").append(NEWLINE);
		screen.append("|  7)  Back                                            |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);

		return screen.toString();

	}
}
