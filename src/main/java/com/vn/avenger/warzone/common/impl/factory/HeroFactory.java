package com.vn.avenger.warzone.common.impl.factory;

import com.vn.avenger.warzone.cast.combatant.CombatantStats;
import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.common.Factory;
import com.vn.avenger.warzone.common.IoC;
import com.vn.avenger.warzone.common.constants.Enums.COMBATANT.HERO;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.hero.AntmanCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.hero.BlackWidowCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.hero.CaptainAmericaCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.hero.CaptainMarvelCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.hero.HulkCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.hero.IronmanCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.hero.SpidermanCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.hero.ThorCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.hero.VisionCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.hero.WaspCombatantStats;

public class HeroFactory implements Factory<Hero, HERO> {

	@Override
	public Hero get(HERO hero) {

		IoC<CombatantStats> combatantStats;

		switch (hero) {

		case THOR:
			combatantStats = new ThorCombatantStats();
			break;

		case CAPTAIN_AMERICA:
			combatantStats = new CaptainAmericaCombatantStats();
			break;

		case HULK:
			combatantStats = new HulkCombatantStats();
			break;

		case IRON_MAN:
			combatantStats = new IronmanCombatantStats();
			break;

		case ANT_MAN:
			combatantStats = new AntmanCombatantStats();
			break;

		case SPIDER_MAN:
			combatantStats = new SpidermanCombatantStats();
			break;

		case BLACK_WIDOW:
			combatantStats = new BlackWidowCombatantStats();
			break;

		case VISION:
			combatantStats = new VisionCombatantStats();
			break;

		case WASP:
			combatantStats = new WaspCombatantStats();
			break;

		case CAPTAIN_MARVEL:
			combatantStats = new CaptainMarvelCombatantStats();
			break;

		default:
			combatantStats = new ThorCombatantStats();
			break;
		}

		return new Hero(combatantStats.inject());
	}

}
