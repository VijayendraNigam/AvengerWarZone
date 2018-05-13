package com.vn.avenger.warzone.game.details;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.ui.Gui;

public class Statistics {

	private Statistics() {

	}

	public static void view(Hero hero) {

		Gui.out.println(hero.getCombatantStats().getStatistics());
		Gui.in.pause();

	}

}
