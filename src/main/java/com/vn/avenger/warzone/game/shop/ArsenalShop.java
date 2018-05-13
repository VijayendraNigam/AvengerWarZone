package com.vn.avenger.warzone.game.shop;

import static com.vn.avenger.warzone.common.Helper.ARSENAL_FACTORY;
import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.common.constants.Enums.ARSENAL;
import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.i18n.MessageCodes;
import com.vn.avenger.warzone.i18n.MessageHelper;
import com.vn.avenger.warzone.shop.ArsenalPO;
import com.vn.avenger.warzone.ui.Gui;

public class ArsenalShop {

	private ArsenalShop() {

	}

	public static void shop(Hero hero) {

		while (true) {

			Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.ARSENAL_SHOP));

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
				ArsenalPO arsenal = ARSENAL_FACTORY.get(ARSENAL.TYPES.values()[choice - 1]);
				MessageCodes code = hero.buy(arsenal);
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
