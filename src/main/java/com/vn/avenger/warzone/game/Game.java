package com.vn.avenger.warzone.game;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.cast.monster.Monster;
import com.vn.avenger.warzone.game.battle.Battle;
import com.vn.avenger.warzone.game.details.Achievements;
import com.vn.avenger.warzone.game.details.Health;
import com.vn.avenger.warzone.game.details.Home;
import com.vn.avenger.warzone.game.details.Lifes;
import com.vn.avenger.warzone.game.details.Settings;
import com.vn.avenger.warzone.game.details.Statistics;
import com.vn.avenger.warzone.ui.Gui;

public class Game {

	private Game() {

	}

	public static void start() {

		Hero hero = Reload.view();
		Monster monster = null;

		while (true) {

			Home.view(hero);

			switch (Gui.in.readInt()) {

			case 1:
				if (hero.getCombatantStats().getHealth().isAlive()) {
					monster = Battle.fight(hero, monster);

				} else {
					Gui.out.clearScreen();
					Gui.out.println("You don't have any life left. You cannot fight!");
					Gui.in.pause();
				}
				break;

			case 2:
				Town.visit(hero);
				break;

			case 3:
				Achievements.view(hero);
				break;

			case 4:
				Statistics.view(hero);
				break;

			case 5:
				Health.view(hero);
				break;

			case 6:
				Lifes.view(hero);
				break;

			case 7:
				Settings.view(hero);
				break;

			case 8:
				Help.view();
				break;

			case 9:
				Save.store(hero);
				return;

			default:
				break;

			}

		}
	}
}
