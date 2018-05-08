package com.vn.avenger.warzone.shop.arsenal;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.ARSENAL;
import com.vn.avenger.warzone.shop.ArsenalPO;

public final class Hammer extends ArsenalPO implements Immutable {

	private static final long serialVersionUID = -7458886593956889619L;

	public Hammer() {

		this.price = ARSENAL.TYPES.HAMMER.getPrice();
		this.injurePower = ARSENAL.TYPES.HAMMER.getInjurePower();
		this.arsenalName = ARSENAL.TYPES.HAMMER.getArsenalName();
		this.mimimumLevelNeeded = ARSENAL.TYPES.HAMMER.getMinimumLevelNeeded();
	}

}
