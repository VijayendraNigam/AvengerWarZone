package com.vn.avenger.warzone.game;

import static com.vn.avenger.warzone.common.Helper.HERO_FACTORY;
import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.common.constants.Enums.COMBATANT.HERO;
import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.ui.Gui;

public class SelectHero {

	private SelectHero() {

	}

	public static Hero choose() {

		Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.HERO));

		int choice = Gui.in.readInt();

		switch (choice) {

		case 1:
		case 2:
		case 3:    return HERO_FACTORY.get(HERO.values()[choice - 1]);
		default:   return HERO_FACTORY.get(HERO.values()[0]);
		
		}

	}
}
