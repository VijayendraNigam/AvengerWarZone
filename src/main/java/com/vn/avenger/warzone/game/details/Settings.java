package com.vn.avenger.warzone.game.details;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.ui.Gui;

public class Settings {

	private Settings() {

	}

	public static void view(Hero hero) {

		Gui.out.println(hero.getCombatantStats().getSettings());
		Gui.in.pause();

	}
}
