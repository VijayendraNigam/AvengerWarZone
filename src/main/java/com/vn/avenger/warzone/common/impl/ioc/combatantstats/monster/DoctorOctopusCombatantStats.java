package com.vn.avenger.warzone.common.impl.ioc.combatantstats.monster;

import static com.vn.avenger.warzone.common.Helper.ARSENAL_FACTORY;

import com.vn.avenger.warzone.cast.combatant.CombatantStats;
import com.vn.avenger.warzone.common.IoC;
import com.vn.avenger.warzone.common.constants.Enums.ARSENAL;
import com.vn.avenger.warzone.common.constants.Enums.COMBATANT.MONSTER;
import com.vn.avenger.warzone.vo.EquippedVO;
import com.vn.avenger.warzone.vo.GeneralVO;

public class DoctorOctopusCombatantStats implements IoC<CombatantStats> {

	@Override
	public CombatantStats inject() {
		return new CombatantStats()
				.setGeneral(new GeneralVO().setCombatantName(MONSTER.DOCTOR_OCTOPUS.getMonsterName()))
				.setEquipped(new EquippedVO().setAcquiredArsenal(ARSENAL_FACTORY.get(ARSENAL.TYPES.CHAINSAW)));
	}

}