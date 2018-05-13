package com.vn.avenger.warzone.game.details;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.ui.Gui;

public class Lifes {

	private Lifes() {

	}

	public static void view(Hero hero) {

		Gui.out.println(hero.getCombatantStats().getLife());
		Gui.in.pause();

	}
}
