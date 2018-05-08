package com.vn.avenger.warzone.cast.hero;

import com.vn.avenger.warzone.cast.combatant.Combatant;
import com.vn.avenger.warzone.cast.combatant.CombatantStats;
import com.vn.avenger.warzone.common.Hibernate;

public class Hero extends Combatant implements Hibernate<Hero> {

	private static final long serialVersionUID = 3960164957185565073L;

	public Hero(CombatantStats combatantStats) {
		super(combatantStats);
	}

}
