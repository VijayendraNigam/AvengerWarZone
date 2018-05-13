package com.vn.avenger.warzone.game.info;

import static com.vn.avenger.warzone.common.Helper.FOOD_FACTORY;
import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.common.constants.Enums.FOOD;
import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.ui.Gui;

public class FoodInfo {

	private FoodInfo() {

	}

	public static void info() {

		while (true) {

			Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.FOOD_INFO));

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
				Gui.out.println(FOOD_FACTORY.get(FOOD.TYPES.values()[choice - 1]));
				Gui.in.pause();
				break;

			case 9:
				return;

			default:
				break;

			}
		}
	}
}
