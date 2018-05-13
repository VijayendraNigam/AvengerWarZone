package com.vn.avenger.warzone.game;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.ui.Gui;

public class Game {

	private Game() {

	}

	public static void start() {

		Hero hero = Reload.view();
		
		Gui.out.println("Done and dusted");
		Gui.out.println(hero);

		while (true) {

			switch (Gui.in.readInt()) {

			}

		}
	}
}
