package com.vn.avenger.warzone.screen.info;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

import com.vn.avenger.warzone.common.constants.Enums.ACHIEVEMENTS;
import com.vn.avenger.warzone.screen.Window;

public class AchievementInfoScreen implements Window<String> {

	@Override
	public String view() {

		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|           |A|v|e|n|g|e|r|  |W|a|r|z|o|n|e|           |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|               Achievement Information                |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|   You are rewarded 100 XP for each achievement you   |").append(NEWLINE);
		screen.append("|   get. If you unlock all achievements, you will be   |").append(NEWLINE);
		screen.append("|   rewarded with 3500 coins.                          |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|   List of achievements (Badges):                     |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|   Achievement            |  Description              |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);

		for (ACHIEVEMENTS.BADGES badges : ACHIEVEMENTS.BADGES.values()) {
			screen.append("|  ").append(badges.getBadgeName()).append("  |  ")
			      .append(badges.getDescription()).append(NEWLINE);
		}

		screen.append("|                                                      ").append(NEWLINE);
		screen.append("|______________________________________________________").append(NEWLINE);

		return screen.toString();
	}

}
