package com.vn.avenger.warzone.game.info;

import static com.vn.avenger.warzone.common.Helper.INSTA_HEALTH_FACTORY;
import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.common.constants.Enums.INSTA_HEALTH;
import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.ui.Gui;

public class InstaHealthInfo {

	private InstaHealthInfo() {

	}

	public static void info() {

		while (true) {

			Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.INSTA_HEALTH_INFO));

			int choice = Gui.in.readInt();

			switch (choice) {

			case 1:
			case 2:
				Gui.out.println(INSTA_HEALTH_FACTORY.get(INSTA_HEALTH.TYPES.values()[choice - 1]));
				Gui.in.pause();
				break;

			case 3:
				return;

			default:
				break;

			}
		}
	}
}
