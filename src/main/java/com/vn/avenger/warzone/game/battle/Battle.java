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
			Gui.out.println(
					"You have encountered, " + monster.getCombatantStats().getGeneral().getCombatantName() + "!");
			Gui.in.pause();

			Battle.doAttack(hero, monster);

			return monster;

		} else {

			while (true) {

				Gui.out.clearScreen();
				Gui.out.println(hero.getWarZoneView(monster));

				switch (Gui.in.readInt()) {

				case 1:
					Boolean isBattleNeeded = Battle.doAttack(hero, monster);
					if (!isBattleNeeded)
						return null;
					break;

				case 2:
					ArsenalBattle.acquire(hero);
					break;

				case 3:
					FirstAidBattle.use(hero);
					break;

				case 4:
					InstaHealthBattle.use(hero);
					break;

				case 5:
					PotionBattle.use(hero);
					break;

				case 6:
					FoodBattle.eat(hero);
					break;

				case 7:
					return monster;

				default:
					break;

				}
			}
		}
	}

	private static boolean doAttack(Hero hero, Monster monster) {

		int toss = new Random().nextInt(10);

		Gui.out.clearScreen();

		if (toss % 2 == 0) {
			hero.doAttack(monster);
			Gui.out.println("You attacked " + monster.getCombatantStats().getGeneral().getCombatantName() + " with "
					+ hero.getCombatantStats().getEquipped().getAcquiredArsenal().getName() + "!");

		} else {
			monster.doAttack(hero);
			Gui.out.println("You got attacked by " + monster.getCombatantStats().getGeneral().getCombatantName()
					+ " with " + monster.getCombatantStats().getEquipped().getAcquiredArsenal().getName() + "!");
		}

		Gui.in.pause();

		if (!hero.getCombatantStats().getHealth().isAlive()) {
			
			Gui.out.clearScreen();
			Gui.out.println("You died in fight with monster " + monster.getCombatantStats().getGeneral().getCombatantName() + "!");
			Gui.out.println("You will be redirected to Home...");
			
			Gui.in.pause();
			
			return false;
		}
		
		if (!monster.getCombatantStats().getHealth().isAlive()) {
			
			Gui.out.clearScreen();
			Gui.out.println("You defeated monster " + monster.getCombatantStats().getGeneral().getCombatantName() + "!");
			Gui.out.println("You will be redirected to Home...");
			
			Gui.in.pause();
			
			return false;
		}
		
		return true;

	}
}
