package com.vn.avenger.warzone.screen.info;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

import com.vn.avenger.warzone.common.constants.Enums.POTIONS;
import com.vn.avenger.warzone.screen.Window;

public class PotionInfoScreen implements Window<String> {

	@Override
	public String render() {

		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|           |A|v|e|n|g|e|r|  |W|a|r|z|o|n|e|           |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|                  Potion Information                  |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|   Which potion would you like to know about ?        |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);

		int i = 1;
		for (POTIONS.TYPES potion : POTIONS.TYPES.values()) {
			screen.append("|  ").append(i++).append(") ").append(potion.getPotionName()).append(NEWLINE);
		}

		screen.append("|  ").append(i++).append(") Back").append(NEWLINE);
		screen.append("|______________________________________________________").append(NEWLINE);

		return screen.toString();
	}
	
}
