package com.vn.avenger.warzone.vo;

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

}
