package com.vn.avenger.warzone.game.shop;

import static com.vn.avenger.warzone.common.Helper.FOOD_FACTORY;
import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.common.constants.Enums.FOOD;
import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.i18n.MessageCodes;
import com.vn.avenger.warzone.i18n.MessageHelper;
import com.vn.avenger.warzone.shop.FoodPO;
import com.vn.avenger.warzone.ui.Gui;

public class FoodShop {

	private FoodShop() {

	}

	public static void shop(Hero hero) {

		while (true) {

			Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.FOOD_SHOP));

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
				FoodPO food = FOOD_FACTORY.get(FOOD.TYPES.values()[choice - 1]);
				MessageCodes code = hero.buy(food);
				Gui.out.print(MessageHelper.getMessage(code));
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
