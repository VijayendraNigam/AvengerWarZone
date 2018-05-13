package com.vn.avenger.warzone.common.impl.ioc.combatantstats.monster;

import com.vn.avenger.warzone.cast.combatant.CombatantStats;
import com.vn.avenger.warzone.common.IoC;

public class RedSkullCombatantStats implements IoC<CombatantStats> {

	@Override
	public CombatantStats inject() {
		return new CombatantStats();
	}

}
