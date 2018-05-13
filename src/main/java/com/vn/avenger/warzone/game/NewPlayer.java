package com.vn.avenger.warzone.game;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.common.constants.Enums.GAME;

public class NewPlayer {

	private NewPlayer() {

	}

	public static Hero create(String username) {

		Hero hero = null;

		hero = SelectHero.choose();
		GAME.MODE gameMode = Mode.choose();

		hero.getCombatantStats().getGeneral().setPlayerName(username);
		hero.getCombatantStats().getSettings().setGameMode(gameMode);

		return hero;
	}
}
