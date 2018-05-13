package com.vn.avenger.warzone.game;

import com.vn.avenger.warzone.ui.Gui;

public class Boot {

	private Boot() {

	}

	public static void launch() {

		while (true) {

			Welcome.view();

			switch (Gui.in.readInt()) {

			case 1:
				Game.start();
				break;

			case 2:
				About.view();
				break;

			case 3:
				Exit.goodbye();
				return;

			default:
				break;

			}
		}

	}

}
