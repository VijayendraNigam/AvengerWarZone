package com.vn.avenger.warzone.shop.arsenal;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.ARSENAL;
import com.vn.avenger.warzone.shop.ArsenalPO;

public final class Shotgun extends ArsenalPO implements Immutable {

	private static final long serialVersionUID = -1345561654266041127L;

	public Shotgun() {

		this.price = ARSENAL.TYPES.SHOT_GUN.getPrice();
		this.injurePower = ARSENAL.TYPES.SHOT_GUN.getInjurePower();
		this.arsenalName = ARSENAL.TYPES.SHOT_GUN.getArsenalName();
		this.mimimumLevelNeeded = ARSENAL.TYPES.SHOT_GUN.getMinimumLevelNeeded();
	}

}