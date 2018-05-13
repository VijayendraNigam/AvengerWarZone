package com.vn.avenger.warzone.game.shop;

import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.ui.Gui;

public class Shop {

	private Shop() {

	}

	public static void visit(Hero hero) {

		while (true) {

			Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.SHOP));

			switch (Gui.in.readInt()) {

			case 1:
				ArsenalShop.shop(hero);
				break;

			case 2:
				//Implement Gear
				break;

			case 3:
				FirstAidShop.shop(hero);
				break;

			case 4:
				InstaHealthShop.shop(hero);
				break;

			case 5:
				PotionShop.shop(hero);
				break;

			case 6:
				FoodShop.shop(hero);
				break;

			case 7:
				return;

			default:
				break;

			}
		}
	}
}
