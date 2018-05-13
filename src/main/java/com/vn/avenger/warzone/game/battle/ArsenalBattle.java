package com.vn.avenger.warzone.game.battle;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.i18n.MessageCodes;
import com.vn.avenger.warzone.i18n.MessageHelper;
import com.vn.avenger.warzone.shop.ArsenalPO;
import com.vn.avenger.warzone.ui.Gui;

public class ArsenalBattle {
	
	private ArsenalBattle() {
		
	}
	
	public static void acquire(Hero hero) {

		if (hero.getCombatantStats().getEquipped().getArsenals().isEmpty()) {

			Gui.out.clearScreen();
			Gui.out.println("You don't have any Arsenal. You can buy Arsenal from the shop in town.");
			Gui.in.pause();

		} else {

			while (true) {

				Gui.out.clearScreen();
				Gui.out.println("_______________________________________________________");
				Gui.out.println("|          Please choose Arsenal from below :          |");
				Gui.out.println("|                                                      |");
				Gui.out.println("|______________________________________________________|");
				Gui.out.println("|                                                      ");

				int i = 1;
				for (ArsenalPO arsenal : hero.getCombatantStats().getEquipped().getArsenals()) {
					Gui.out.println("|  " + i++ + ") " + arsenal.getName());
				}
				Gui.out.println("|  " + i + ") Back");
				Gui.out.println("|_______________________________________________________");

				int choice = Gui.in.readInt();

				if (choice > 0 && choice <= hero.getCombatantStats().getEquipped().getArsenals().size()) {

					MessageCodes code = hero.acquire(hero.getCombatantStats().getEquipped().getArsenals().get(choice - 1));

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
