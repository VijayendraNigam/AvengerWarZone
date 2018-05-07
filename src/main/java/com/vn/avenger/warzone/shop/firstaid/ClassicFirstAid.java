package com.vn.avenger.warzone.shop.firstaid;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.FIRST_AID;
import com.vn.avenger.warzone.shop.FirstAidPO;

public final class ClassicFirstAid extends FirstAidPO implements Immutable {

	private static final long serialVersionUID = -5894519347182097969L;

	public ClassicFirstAid() {
		this.price = FIRST_AID.TYPES.CLASSIC.getPrice();
		this.healPower = FIRST_AID.TYPES.CLASSIC.getHealPower();
		this.firstAidName = FIRST_AID.TYPES.CLASSIC.getFirstAidName();
		this.mimimumLevelNeeded = FIRST_AID.TYPES.CLASSIC.getMinimumLevelNeeded();
	}

}
