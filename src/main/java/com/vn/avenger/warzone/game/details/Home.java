package com.vn.avenger.warzone.game.details;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.ui.Gui;

public class Home {

	private Home() {

	}

	public static void view(Hero hero) {
		Gui.out.clearScreen();
		Gui.out.println(hero.getHomeView());
	}
}
