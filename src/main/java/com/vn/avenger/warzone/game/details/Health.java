package com.vn.avenger.warzone.game.details;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.ui.Gui;

public class Health {

	private Health() {

	}

	public static void view(Hero hero) {

		Gui.out.println(hero.getCombatantStats().getHealth());
		Gui.in.pause();

	}
}
