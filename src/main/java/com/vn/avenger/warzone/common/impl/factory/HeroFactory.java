package com.vn.avenger.warzone.common.impl.factory;

import com.vn.avenger.warzone.cast.combatant.CombatantStats;
import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.common.Factory;
import com.vn.avenger.warzone.common.IoC;
import com.vn.avenger.warzone.common.constants.Enums.COMBATANT.HERO;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.ThorCombatantStats;

public class HeroFactory implements Factory<Hero, HERO> {

	@Override
	public Hero get(HERO hero) {

		IoC<CombatantStats> combatantStats;

		switch (hero) {

		case THOR:
			combatantStats = new ThorCombatantStats();
			break;

		default:
			combatantStats = new ThorCombatantStats();
			break;
		}

		return new Hero(combatantStats.inject());
	}

}
