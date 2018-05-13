package com.vn.avenger.warzone.game.info;

import static com.vn.avenger.warzone.common.Helper.POTION_FACTORY;
import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.common.constants.Enums.POTIONS;
import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.ui.Gui;

public class PotionInfo {

	private PotionInfo() {

	}

	public static void info() {

		while (true) {

			Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.POTION_INFO));

			int choice = Gui.in.readInt();

			switch (choice) {

			case 1:
			case 2:
				Gui.out.println(POTION_FACTORY.get(POTIONS.TYPES.values()[choice - 1]));
				Gui.in.pause();
				break;

			case 3:
				return;

			default:
				break;

			}
		}
	}
}
