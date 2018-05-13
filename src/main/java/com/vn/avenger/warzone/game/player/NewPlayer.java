package com.vn.avenger.warzone.game.player;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.common.constants.Enums.GAME;
import com.vn.avenger.warzone.game.select.Mode;
import com.vn.avenger.warzone.game.select.SelectHero;

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
