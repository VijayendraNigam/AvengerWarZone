package com.vn.avenger.warzone.vo;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

import java.util.HashMap;
import java.util.Map;

import com.vn.avenger.warzone.common.constants.Enums.ACHIEVEMENTS.BADGES;

public class AchievementsVO implements ValueObject {

	private static final long serialVersionUID = -1991285340479594197L;

	private Map<BADGES, Boolean> badgesMap;

	public AchievementsVO() {
		badgesMap = new HashMap<>();

		for (BADGES badge : BADGES.values()) {
			badgesMap.put(badge, false);
		}
	}

	public Map<BADGES, Boolean> getBadgesMap() {
		return badgesMap;
	}

	public AchievementsVO setBadgesMap(Map<BADGES, Boolean> badgesMap) {
		this.badgesMap = badgesMap;
		return this;
	}

	@Override
	public String toString() {
		return "AchievementsVO [badgesMap=" + badgesMap + "]";
	}

	@Override
	public String view() {
		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|           |A|v|e|n|g|e|r|  |W|a|r|z|o|n|e|           |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|                    Achievements                      |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|--Unlocked Achievements--").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		for (BADGES badge : getBadgesMap().keySet()) {
			if (getBadgesMap().get(badge))
				screen.append("|    ").append(badge.getBadgeName()).append(NEWLINE);;
		}
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|--Locked Achievements--").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		for (BADGES badge : getBadgesMap().keySet()) {
			if (!getBadgesMap().get(badge))
				screen.append("|    ").append(badge.getBadgeName()).append(NEWLINE);;
		}
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|_______________________________________________________").append(NEWLINE);

		return screen.toString();
	}

}
