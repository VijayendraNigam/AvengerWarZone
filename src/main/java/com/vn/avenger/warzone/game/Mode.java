package com.vn.avenger.warzone.game;

import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.common.constants.Enums.GAME;
import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.ui.Gui;

public class Mode {

	private Mode() {

	}

	public static GAME.MODE choose() {

		Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.MODE));

		int choice = Gui.in.readInt();

		switch (choice) {

		case 1:
		case 2:
		case 3:    return GAME.MODE.values()[choice - 1];
		default:   return GAME.MODE.values()[0];
		
		}

	}

}
