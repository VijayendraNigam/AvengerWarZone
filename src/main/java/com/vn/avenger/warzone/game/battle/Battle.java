package com.vn.avenger.warzone.game.battle;

import static com.vn.avenger.warzone.common.Helper.MONSTER_FACTORY;

import java.util.Random;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.cast.monster.Monster;
import com.vn.avenger.warzone.common.constants.Enums.COMBATANT.MONSTER;
import com.vn.avenger.warzone.ui.Gui;

public class Battle {

	private Battle() {

	}

	public static Monster fight(Hero hero, Monster monster) {

		if (monster == null) {

			int monsterId = new Random().nextInt(MONSTER.values().length);
			monster = MONSTER_FACTORY.get(MONSTER.values()[monsterId]);

			Gui.out.clearScreen();
			Gui.out.println("You have encountered, " + monster.getCombatantStats().getGeneral().getCombatantName());
			Gui.in.pause();

		} else {
			
			Gui.out.clearScreen();
			Gui.out.println(hero.getWarZoneView(monster));
			
			Gui.in.pause();
			
			
			
		}

		return monster;
	}

}
