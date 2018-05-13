package com.vn.avenger.warzone.game;

import static com.vn.avenger.warzone.common.Helper.HERO_FACTORY;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.common.Helper;
import com.vn.avenger.warzone.common.constants.Enums.COMBATANT.HERO;

public class OldPlayer {

	private OldPlayer() {

	}

	public static Hero restore(String username) {

		Hero hero = HERO_FACTORY.get(HERO.THOR);
		hero = hero.resurrect(Helper.constructSaveFilePath(username));

		return hero;
	}
}
