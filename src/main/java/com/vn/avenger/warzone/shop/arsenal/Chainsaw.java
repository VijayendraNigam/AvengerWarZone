package com.vn.avenger.warzone.shop.arsenal;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.ARSENAL;
import com.vn.avenger.warzone.shop.ArsenalPO;

public final class Chainsaw extends ArsenalPO implements Immutable {

	private static final long serialVersionUID = 5404039724049074738L;

	public Chainsaw() {

		this.price = ARSENAL.TYPES.CHAINSAW.getPrice();
		this.injurePower = ARSENAL.TYPES.CHAINSAW.getInjurePower();
		this.arsenalName = ARSENAL.TYPES.CHAINSAW.getArsenalName();
		this.mimimumLevelNeeded = ARSENAL.TYPES.CHAINSAW.getMinimumLevelNeeded();
	}

}
