package com.vn.avenger.warzone.shop.arsenal;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.ARSENAL;
import com.vn.avenger.warzone.shop.ArsenalPO;

public final class Fists extends ArsenalPO implements Immutable {

	private static final long serialVersionUID = 9219895050639450560L;

	public Fists() {

		this.price = ARSENAL.TYPES.FISTS.getPrice();
		this.injurePower = ARSENAL.TYPES.FISTS.getInjurePower();
		this.arsenalName = ARSENAL.TYPES.FISTS.getArsenalName();
		this.mimimumLevelNeeded = ARSENAL.TYPES.FISTS.getMinimumLevelNeeded();
	}

}