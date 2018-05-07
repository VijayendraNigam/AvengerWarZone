package com.vn.avenger.warzone.shop.potion;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.POTIONS;
import com.vn.avenger.warzone.shop.PotionPO;

public final class RecoveryPotion extends PotionPO implements Immutable {

	private static final long serialVersionUID = -7205170290758666026L;

	public RecoveryPotion() {
		this.price = POTIONS.TYPES.RECOVERY.getPrice();
		this.healPower = POTIONS.TYPES.RECOVERY.getHealPower();
		this.potionName = POTIONS.TYPES.RECOVERY.getPotionName();
		this.mimimumLevelNeeded = POTIONS.TYPES.RECOVERY.getMinimumLevelNeeded();
	}

}
