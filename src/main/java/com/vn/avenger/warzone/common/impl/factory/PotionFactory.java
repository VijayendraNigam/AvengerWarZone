package com.vn.avenger.warzone.common.impl.factory;

import com.vn.avenger.warzone.common.Factory;
import com.vn.avenger.warzone.common.constants.Enums.POTIONS;
import com.vn.avenger.warzone.shop.PotionPO;
import com.vn.avenger.warzone.shop.potion.RecoveryPotion;
import com.vn.avenger.warzone.shop.potion.SurvivalPotion;

public class PotionFactory implements Factory<PotionPO, POTIONS.TYPES> {

	@Override
	public PotionPO get(POTIONS.TYPES potion) {
		
		switch (potion) {
		
		case SURVIVAL:		return new SurvivalPotion();
		case RECOVERY:		return new RecoveryPotion();
		default:				return new SurvivalPotion();
		
		}

	}

}
