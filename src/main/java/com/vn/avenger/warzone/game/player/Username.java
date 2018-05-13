package com.vn.avenger.warzone.game.player;

import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.ui.Gui;

public class Username {

	private Username() {

	}

	public static String prompt() {

		Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.USERNAME));

		String username = Gui.in.read();

		if (username == null || username.trim().isEmpty()) {
			Gui.out.println("Please enter a valid username.");
			Gui.in.pause();
			prompt();
		}
		
		return username;
	}
}
