package com.vn.avenger.warzone.shop.instahealth;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.INSTA_HEALTH;
import com.vn.avenger.warzone.shop.InstaHealthPO;

public final class QuadraInstaHealth extends InstaHealthPO implements Immutable {

	private static final long serialVersionUID = 5229297897151145779L;

	public QuadraInstaHealth() {
		this.price = INSTA_HEALTH.TYPES.QUDRA.getPrice();
		this.healPower = INSTA_HEALTH.TYPES.QUDRA.getHealPower();
		this.instaHealthName = INSTA_HEALTH.TYPES.QUDRA.getInstaHealthName();
		this.mimimumLevelNeeded = INSTA_HEALTH.TYPES.QUDRA.getMinimumLevelNeeded();
	}
}
