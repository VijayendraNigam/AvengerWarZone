package com.vn.avenger.warzone.cast.monster;

import com.vn.avenger.warzone.cast.combatant.Combatant;
import com.vn.avenger.warzone.cast.combatant.CombatantStats;
import com.vn.avenger.warzone.common.Hibernate;

public class Monster extends Combatant implements Hibernate<Monster> {

	private static final long serialVersionUID = -2895982381185391675L;

	public Monster(CombatantStats combatantStats) {
		super(combatantStats);
	}

}
