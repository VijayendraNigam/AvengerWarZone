package com.vn.avenger.warzone.shop.arsenal;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.ARSENAL;
import com.vn.avenger.warzone.shop.ArsenalPO;

public final class SniperRifle extends ArsenalPO implements Immutable {

	private static final long serialVersionUID = 5353116577439655040L;

	public SniperRifle() {

		this.price = ARSENAL.TYPES.SNIPER_RIFLE.getPrice();
		this.injurePower = ARSENAL.TYPES.SNIPER_RIFLE.getInjurePower();
		this.arsenalName = ARSENAL.TYPES.SNIPER_RIFLE.getArsenalName();
		this.mimimumLevelNeeded = ARSENAL.TYPES.SNIPER_RIFLE.getMinimumLevelNeeded();
	}

}