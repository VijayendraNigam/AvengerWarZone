package com.vn.avenger.warzone.shop;

import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.HEAL;
import com.vn.avenger.warzone.common.constants.Enums.HEAL.ENERGY;

public abstract class PotionPO implements PurchaseObject {

	private static final long serialVersionUID = 3590844641460421324L;

	private ENERGY healsEnergy = ENERGY.STRENGTH;

	protected COINS.COUNT price;
	protected HEAL.RESTORE healPower;
	protected String potionName;
	protected LEVELS mimimumLevelNeeded;

	public ENERGY getHealsEnergy() {
		return healsEnergy;
	}

	public COINS.COUNT getPrice() {
		return price;
	}

	public HEAL.RESTORE getHealPower() {
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
		return "PotionPO [healsEnergy=" + healsEnergy + ", price=" + price + ", healPower=" + healPower
				+ ", potionName=" + potionName + ", mimimumLevelNeeded=" + mimimumLevelNeeded + "]";
	}

}
