package com.vn.avenger.warzone.shop.potion;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.POTIONS;
import com.vn.avenger.warzone.shop.PotionPO;

public final class SurvivalPotion extends PotionPO implements Immutable {

	private static final long serialVersionUID = -2483003597731465613L;

	public SurvivalPotion() {
		this.price = POTIONS.TYPES.SURVIVAL.getPrice();
		this.healPower = POTIONS.TYPES.SURVIVAL.getHealPower();
		this.potionName = POTIONS.TYPES.SURVIVAL.getPotionName();
		this.mimimumLevelNeeded = POTIONS.TYPES.SURVIVAL.getMinimumLevelNeeded();
	}

}
