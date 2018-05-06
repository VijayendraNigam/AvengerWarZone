package com.vn.avenger.warzone.cast.combatant;

import java.io.Serializable;

import com.vn.avenger.warzone.action.Fight;

public abstract class Combatant implements Fight, Serializable {

	private static final long serialVersionUID = -138744694364281533L;

	private CombatantStats combatantStats;

	public Combatant(CombatantStats combatantStats) {
		this.combatantStats = combatantStats;
	}

	public CombatantStats getCombatantStats() {
		return combatantStats;
	}

	public void setCombatantStats(CombatantStats combatantStats) {
		this.combatantStats = combatantStats;
	}

	@Override
	public String toString() {
		return "Combatant [combatantStats=" + combatantStats + "]";
	}

}
