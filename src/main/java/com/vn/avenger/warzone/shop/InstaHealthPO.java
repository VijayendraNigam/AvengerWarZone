package com.vn.avenger.warzone.shop;

import com.vn.avenger.warzone.common.constants.Enums.DIAMONDS;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.HEAL;

public abstract class InstaHealthPO implements PurchaseObject {

	private static final long serialVersionUID = 3480553358927131122L;

	protected DIAMONDS.COUNT price;
	protected HEAL.POWER healPower;
	protected String instaHealthName;
	protected LEVELS mimimumLevelNeeded;

	public DIAMONDS.COUNT getPrice() {
		return price;
	}

	public HEAL.POWER getHealPower() {
		return healPower;
	}

	public String getInstaHealthName() {
		return instaHealthName;
	}

	public LEVELS getMimimumLevelNeeded() {
		return mimimumLevelNeeded;
	}

	@Override
	public String toString() {
		return "InstaHealthPO [price=" + price + ", healPower=" + healPower + ", instaHealthName=" + instaHealthName
				+ ", mimimumLevelNeeded=" + mimimumLevelNeeded + "]";
	}

}
