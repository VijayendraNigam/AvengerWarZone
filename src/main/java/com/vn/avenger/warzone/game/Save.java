package com.vn.avenger.warzone.game;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.common.Helper;
import com.vn.avenger.warzone.ui.Gui;

public class Save {

	private Save() {

	}

	public static void store(Hero hero) {

		String saveFileName = hero.getCombatantStats().getGeneral().getPlayerName();
		hero.getCombatantStats().getStatistics().setTimesQuit(hero.getCombatantStats().getStatistics().getTimesQuit() + 1);
		hero.save(Helper.constructSaveFilePath(saveFileName));

		Gui.out.clearScreen();
		Gui.out.println("Saved successfully!! Press Enter to exit.");
		Gui.in.pause();

		Exit.goodbye();

		System.exit(0);
	}
}
