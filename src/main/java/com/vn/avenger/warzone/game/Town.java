package com.vn.avenger.warzone.game;

import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.game.shop.Shop;
import com.vn.avenger.warzone.ui.Gui;

public class Town {

	private Town() {

	}

	public static void visit(Hero hero) {

		while (true) {

			Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.TOWN));

			switch (Gui.in.readInt()) {

			case 1:
				// Implement card game
				break;

			case 2:
				Shop.visit(hero);
				break;

			case 3:
				return;

			default:
				break;

			}
		}
	}

}
