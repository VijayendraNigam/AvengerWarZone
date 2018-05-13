package com.vn.avenger.warzone.game.details;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.ui.Gui;

public class Achievements {

	private Achievements() {

	}

	public static void view(Hero hero) {

		Gui.out.println(hero.getCombatantStats().getAchievements());
		Gui.in.pause();

	}

}
