package com.vn.avenger.warzone.shop;

import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.HEAL;
import com.vn.avenger.warzone.common.constants.Enums.HEAL.ENERGY;

public abstract class FoodPO implements PurchaseObject {

	private static final long serialVersionUID = 5592651677297031031L;

	private ENERGY healsEnergy = ENERGY.ALL;

	protected COINS.COUNT price;
	protected HEAL.RESTORE healPower;
	protected String foodName;
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

	public String getFoodName() {
		return foodName;
	}

	public LEVELS getMimimumLevelNeeded() {
		return mimimumLevelNeeded;
	}

	@Override
	public String toString() {
		return "FoodPO [healsEnergy=" + healsEnergy + ", price=" + price + ", healPower=" + healPower + ", foodName="
				+ foodName + ", mimimumLevelNeeded=" + mimimumLevelNeeded + "]";
	}

}
