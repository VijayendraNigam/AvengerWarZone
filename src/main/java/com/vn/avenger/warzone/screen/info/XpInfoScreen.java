package com.vn.avenger.warzone.screen.info;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

import com.vn.avenger.warzone.common.constants.Enums.XP;
import com.vn.avenger.warzone.screen.Window;

public class XpInfoScreen implements Window<String> {

	@Override
	public String view() {

		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|           |A|v|e|n|g|e|r|  |W|a|r|z|o|n|e|           |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|                     Xp Information                   |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|   Getting XP levels you up, which unlocks more items  ").append(NEWLINE);
		screen.append("|   to purchase. You start from LEVEL_1, and you can    ").append(NEWLINE);
		screen.append("|   get up to LEVEL_5. You need more and more XP for    ").append(NEWLINE);
		screen.append("|   level. These are the XP needed to reach each level. ").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);

		for (XP.NEEDED xp : XP.NEEDED.values()) {
			screen.append("|   ").append(xp).append("  |  XP : ").append(xp.getPoints()).append(NEWLINE);
		}

		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|   Each time you level up, your XP gets reset to 0.    ").append(NEWLINE);
		screen.append("|   You get an achievement for each level you reach up  ").append(NEWLINE);
		screen.append("|   to Level_5. You will also be credited with coins.   ").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|   How to get XP...                                    ").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|   > You will get XP by fighting with monsters. For    ").append(NEWLINE);
		screen.append("|     every point of damage to a monster, you get 10 XP.").append(NEWLINE);
		screen.append("|   > You will also get 100 XP for each achievement     ").append(NEWLINE);
		screen.append("|     you unlock.                                       ").append(NEWLINE);
		screen.append("|   > Using a POWER will give you 50 XP.                ").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|_______________________________________________________").append(NEWLINE);

		return screen.toString();
	}

}
