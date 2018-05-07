package com.vn.avenger.warzone.shop;

import com.vn.avenger.warzone.common.constants.Enums.DIAMONDS;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.HEAL;
import com.vn.avenger.warzone.common.constants.Enums.HEAL.ENERGY;

public abstract class InstaHealthPO implements PurchaseObject {

	private static final long serialVersionUID = 3480553358927131122L;

	private ENERGY healsEnergy = ENERGY.HEALTH;

	protected DIAMONDS.COUNT price;
	protected HEAL.RESTORE healPower;
	protected String instaHealthName;
	protected LEVELS mimimumLevelNeeded;

	public ENERGY getHealsEnergy() {
		return healsEnergy;
	}

	public DIAMONDS.COUNT getPrice() {
		return price;
	}

	public HEAL.RESTORE getHealPower() {
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
		return "InstaHealthPO [healsEnergy=" + healsEnergy + ", price=" + price + ", healPower=" + healPower
				+ ", instaHealthName=" + instaHealthName + ", mimimumLevelNeeded=" + mimimumLevelNeeded + "]";
	}

}
