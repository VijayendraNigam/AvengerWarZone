package com.vn.avenger.warzone.common.impl.factory;

import com.vn.avenger.warzone.cast.combatant.CombatantStats;
import com.vn.avenger.warzone.cast.monster.Monster;
import com.vn.avenger.warzone.common.Factory;
import com.vn.avenger.warzone.common.IoC;
import com.vn.avenger.warzone.common.constants.Enums.COMBATANT.MONSTER;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.monster.DoctorOctopusCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.monster.DormammuCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.monster.EmmaFrostCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.monster.HelaCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.monster.LokiCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.monster.RedSkullCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.monster.ThanosCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.monster.UltronCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.monster.VenomCombatantStats;
import com.vn.avenger.warzone.common.impl.ioc.combatantstats.monster.VulcanCombatantStats;

public class MonsterFactory implements Factory<Monster, MONSTER> {

	@Override
	public Monster get(MONSTER monster) {

		IoC<CombatantStats> combatantStats;

		switch (monster) {

		case LOKI:
			combatantStats = new LokiCombatantStats();
			break;

		case RED_SKULL:
			combatantStats = new RedSkullCombatantStats();
			break;

		case ULTRON:
			combatantStats = new UltronCombatantStats();
			break;

		case DOCTOR_OCTOPUS:
			combatantStats = new DoctorOctopusCombatantStats();
			break;

		case VENOM:
			combatantStats = new VenomCombatantStats();
			break;

		case DORMAMMU:
			combatantStats = new DormammuCombatantStats();
			break;

		case EMMA_FROST:
			combatantStats = new EmmaFrostCombatantStats();
			break;

		case VULCAN:
			combatantStats = new VulcanCombatantStats();
			break;

		case HELA:
			combatantStats = new HelaCombatantStats();
			break;

		case THANOS:
			combatantStats = new ThanosCombatantStats();
			break;

		default:
			combatantStats = new LokiCombatantStats();
			break;

		}

		return new Monster(combatantStats.inject());
	}

}
