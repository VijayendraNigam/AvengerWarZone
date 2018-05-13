package com.vn.avenger.warzone.common.impl.ioc.combatantstats.monster;

import com.vn.avenger.warzone.cast.combatant.CombatantStats;
import com.vn.avenger.warzone.common.IoC;
import com.vn.avenger.warzone.common.constants.Enums.COMBATANT.MONSTER;
import com.vn.avenger.warzone.vo.GeneralVO;

public class UltronCombatantStats implements IoC<CombatantStats> {

	@Override
	public CombatantStats inject() {
		return new CombatantStats().setGeneral(new GeneralVO().setCombatantName(MONSTER.ULTRON.getMonsterName()));
	}

}
