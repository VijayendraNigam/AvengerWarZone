
package com.vn.avenger.warzone.game.battle;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.i18n.MessageCodes;
import com.vn.avenger.warzone.i18n.MessageHelper;
import com.vn.avenger.warzone.shop.PotionPO;
import com.vn.avenger.warzone.ui.Gui;

public class PotionBattle {

	private PotionBattle() {

	}

	public static void use(Hero hero) {

		if (hero.getCombatantStats().getEquipped().getPotions().isEmpty()) {

			Gui.out.clearScreen();
			Gui.out.println("You don't have any potion. You can buy potion from the shop in town.");
			Gui.in.pause();

		} else {

			while (true) {

				Gui.out.clearScreen();
				Gui.out.println("_______________________________________________________");
				Gui.out.println("|         Please choose Potion from below :            |");
				Gui.out.println("|                                                      |");
				Gui.out.println("|______________________________________________________|");
				Gui.out.println("|                                                      ");

				int i = 1;
				for (PotionPO potion : hero.getCombatantStats().getEquipped().getPotions()) {
					Gui.out.println("|  " + i++ + ") " + potion.getName());
				}
				Gui.out.println("|  " + i + ") Back");
				Gui.out.println("|_______________________________________________________");

				int choice = Gui.in.readInt();

				if (choice > 0 && choice <= hero.getCombatantStats().getEquipped().getPotions().size()) {

					MessageCodes code = hero.avail(hero.getCombatantStats().getEquipped().getPotions().get(choice - 1));

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
