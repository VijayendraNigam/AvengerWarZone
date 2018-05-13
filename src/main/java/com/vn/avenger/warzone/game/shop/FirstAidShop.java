package com.vn.avenger.warzone.game.shop;

import static com.vn.avenger.warzone.common.Helper.FIRSTAID_FACTORY;
import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.common.constants.Enums.FIRST_AID;
import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.i18n.MessageCodes;
import com.vn.avenger.warzone.i18n.MessageHelper;
import com.vn.avenger.warzone.shop.FirstAidPO;
import com.vn.avenger.warzone.ui.Gui;

public class FirstAidShop {

	private FirstAidShop() {

	}

	public static void shop(Hero hero) {

		while (true) {

			Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.FIRST_AID_SHOP));

			int choice = Gui.in.readInt();

			switch (choice) {

			case 1:
				FirstAidPO firstAid = FIRSTAID_FACTORY.get(FIRST_AID.TYPES.values()[choice - 1]);
				MessageCodes code = hero.buy(firstAid);
				Gui.out.print(MessageHelper.getMessage(code));
				Gui.in.pause();
				break;

			case 2:
				return;

			default:
				break;
			}
		}
	}
}
