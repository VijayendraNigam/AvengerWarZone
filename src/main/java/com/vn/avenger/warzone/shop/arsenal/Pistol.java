package com.vn.avenger.warzone.shop.arsenal;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.ARSENAL;
import com.vn.avenger.warzone.shop.ArsenalPO;

public final class Pistol extends ArsenalPO implements Immutable {

	private static final long serialVersionUID = -3541516929707048483L;

	public Pistol() {

		this.price = ARSENAL.TYPES.PISTOL.getPrice();
		this.injurePower = ARSENAL.TYPES.PISTOL.getInjurePower();
		this.arsenalName = ARSENAL.TYPES.PISTOL.getArsenalName();
		this.mimimumLevelNeeded = ARSENAL.TYPES.PISTOL.getMinimumLevelNeeded();
	}

}