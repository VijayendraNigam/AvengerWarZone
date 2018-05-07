package com.vn.avenger.warzone.shop;

import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.HEAL;

public abstract class PotionPO implements PurchaseObject {

	private static final long serialVersionUID = 3590844641460421324L;

	protected COINS.COUNT price;
	protected HEAL.POWER healPower;
	protected String potionName;
	protected LEVELS mimimumLevelNeeded;

	public COINS.COUNT getPrice() {
		return price;
	}

	public HEAL.POWER getHealPower() {
		return healPower;
	}

	public String getPotionName() {
		return potionName;
	}

	public LEVELS getMimimumLevelNeeded() {
		return mimimumLevelNeeded;
	}

	@Override
	public String toString() {
		return "PotionPO [price=" + price + ", healPower=" + healPower + ", potionName=" + potionName
				+ ", mimimumLevelNeeded=" + mimimumLevelNeeded + "]";
	}

}
