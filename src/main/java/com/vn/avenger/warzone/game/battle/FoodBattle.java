package com.vn.avenger.warzone.game.battle;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.i18n.MessageCodes;
import com.vn.avenger.warzone.i18n.MessageHelper;
import com.vn.avenger.warzone.shop.FoodPO;
import com.vn.avenger.warzone.ui.Gui;

public class FoodBattle {

	private FoodBattle() {

	}

	public static void eat(Hero hero) {

		if (hero.getCombatantStats().getEquipped().getFood().isEmpty()) {

			Gui.out.clearScreen();
			Gui.out.println("You don't have any Food. You can buy Food from the shop in town.");
			Gui.in.pause();

		} else {

			while (true) {

				Gui.out.clearScreen();
				Gui.out.println("_______________________________________________________");
				Gui.out.println("|          Please choose Food from below :             |");
				Gui.out.println("|                                                      |");
				Gui.out.println("|______________________________________________________|");
				Gui.out.println("|                                                      ");

				int i = 1;
				for (FoodPO food : hero.getCombatantStats().getEquipped().getFood()) {
					Gui.out.println("|  " + i++ + ") " + food.getName());
				}
				Gui.out.println("|  " + i + ") Back");
				Gui.out.println("|_______________________________________________________");

				int choice = Gui.in.readInt();

				if (choice > 0 && choice <= hero.getCombatantStats().getEquipped().getFood().size()) {

					MessageCodes code = hero.avail(hero.getCombatantStats().getEquipped().getFood().get(choice - 1));

					Gui.out.clearScreen();
					Gui.out.println(MessageHelper.getMessage(code));
					Gui.in.pause();

					return;

				} else if (choice == i) {
					return;

				} else {
					break;
				}

			}

		}

	}

}
