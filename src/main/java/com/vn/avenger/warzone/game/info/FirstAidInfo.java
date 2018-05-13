package com.vn.avenger.warzone.game.info;

import static com.vn.avenger.warzone.common.Helper.FIRSTAID_FACTORY;
import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.common.constants.Enums.FIRST_AID;
import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.ui.Gui;

public class FirstAidInfo {

	private FirstAidInfo() {

	}

	public static void info() {

		while (true) {

			Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.FIRST_AID_INFO));

			int choice = Gui.in.readInt();

			switch (choice) {

			case 1:
				Gui.out.println(FIRSTAID_FACTORY.get(FIRST_AID.TYPES.values()[choice - 1]));
				Gui.in.pause();
				break;

			case 2:
				return;

			default:
				break;

			}
		}
	}
}
