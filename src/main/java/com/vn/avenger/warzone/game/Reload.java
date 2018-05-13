package com.vn.avenger.warzone.game;

import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.ui.Gui;

public class Reload {

	private Reload() {

	}

	public static Hero view() {

		Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.RELOAD));

		int choice = Gui.in.readInt();
		String username = null;
		Hero hero = null;

		switch (choice) {

		case 1:
			username = Username.prompt();
			hero = OldPlayer.restore(username);
			if (hero == null) {
				Gui.out.clearScreen();
				Gui.out.println("No saved game found. Starting new game...");
				Gui.in.pause();
				hero = NewPlayer.create(username);
			}
			break;

		default:
			username = Username.prompt();
			hero = NewPlayer.create(username);
			break;
		}

		return hero;
	}
}
