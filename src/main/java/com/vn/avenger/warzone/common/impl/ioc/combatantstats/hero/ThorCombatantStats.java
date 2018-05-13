package com.vn.avenger.warzone.common.impl.ioc.combatantstats.hero;

import com.vn.avenger.warzone.cast.combatant.CombatantStats;
import com.vn.avenger.warzone.common.IoC;
import com.vn.avenger.warzone.common.constants.Enums.COMBATANT.HERO;
import com.vn.avenger.warzone.vo.GeneralVO;

public class ThorCombatantStats implements IoC<CombatantStats> {

	@Override
	public CombatantStats inject() {
		return new CombatantStats().setGeneral(new GeneralVO().setCombatantName(HERO.THOR.getHeroName()));
	}

}