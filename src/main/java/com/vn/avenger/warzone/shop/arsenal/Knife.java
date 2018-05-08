package com.vn.avenger.warzone.shop.arsenal;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.ARSENAL;
import com.vn.avenger.warzone.shop.ArsenalPO;

public final class Knife extends ArsenalPO implements Immutable {

	private static final long serialVersionUID = 7389114957829457068L;

	public Knife() {

		this.price = ARSENAL.TYPES.KNIFE.getPrice();
		this.injurePower = ARSENAL.TYPES.KNIFE.getInjurePower();
		this.arsenalName = ARSENAL.TYPES.KNIFE.getArsenalName();
		this.mimimumLevelNeeded = ARSENAL.TYPES.KNIFE.getMinimumLevelNeeded();
	}

}
