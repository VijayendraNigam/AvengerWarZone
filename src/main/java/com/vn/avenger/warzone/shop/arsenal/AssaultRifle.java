package com.vn.avenger.warzone.shop.arsenal;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.ARSENAL;
import com.vn.avenger.warzone.shop.ArsenalPO;

public final class AssaultRifle extends ArsenalPO implements Immutable {

	private static final long serialVersionUID = -6146409868575146458L;

	public AssaultRifle() {

		this.price = ARSENAL.TYPES.ASSAULT_RIFLE.getPrice();
		this.injurePower = ARSENAL.TYPES.ASSAULT_RIFLE.getInjurePower();
		this.arsenalName = ARSENAL.TYPES.ASSAULT_RIFLE.getArsenalName();
		this.mimimumLevelNeeded = ARSENAL.TYPES.ASSAULT_RIFLE.getMinimumLevelNeeded();
	}

}
