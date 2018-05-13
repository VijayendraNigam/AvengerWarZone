package com.vn.avenger.warzone.game.shop;

import static com.vn.avenger.warzone.common.Helper.POTION_FACTORY;
import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.common.constants.Enums.POTIONS;
import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.i18n.MessageCodes;
import com.vn.avenger.warzone.i18n.MessageHelper;
import com.vn.avenger.warzone.shop.PotionPO;
import com.vn.avenger.warzone.ui.Gui;

public class PotionShop {

	private PotionShop() {

	}

	public static void shop(Hero hero) {

		while (true) {

			Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.POTION_SHOP));

			int choice = Gui.in.readInt();

			switch (choice) {

			case 1:
			case 2:
				PotionPO potion = POTION_FACTORY.get(POTIONS.TYPES.values()[choice - 1]);
				MessageCodes code = hero.buy(potion);
				Gui.out.print(MessageHelper.getMessage(code));
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
