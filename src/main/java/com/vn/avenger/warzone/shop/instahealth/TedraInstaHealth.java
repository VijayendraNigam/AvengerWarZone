package com.vn.avenger.warzone.shop.instahealth;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.INSTA_HEALTH;
import com.vn.avenger.warzone.shop.InstaHealthPO;

public final class TedraInstaHealth extends InstaHealthPO implements Immutable {

	private static final long serialVersionUID = 1270054760220052647L;

	public TedraInstaHealth() {
		this.price = INSTA_HEALTH.TYPES.TEDRA.getPrice();
		this.healPower = INSTA_HEALTH.TYPES.TEDRA.getHealPower();
		this.instaHealthName = INSTA_HEALTH.TYPES.TEDRA.getInstaHealthName();
		this.mimimumLevelNeeded = INSTA_HEALTH.TYPES.TEDRA.getMinimumLevelNeeded();
	}

}
