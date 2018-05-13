package com.vn.avenger.warzone.game.select;

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

		while (true) {

			Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.HERO));

			int choice = Gui.in.readInt();

			switch (choice) {

			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:    return HERO_FACTORY.get(HERO.values()[choice - 1]);
			default:    break;

			}

		}
	}
}
