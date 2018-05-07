package com.vn.avenger.warzone.shop;

import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.HEAL;
import com.vn.avenger.warzone.common.constants.Enums.HEAL.ENERGY;

public abstract class FirstAidPO implements PurchaseObject {

	private static final long serialVersionUID = 8605038082668249462L;

	private ENERGY healsEnergy = ENERGY.STAMINA;

	protected COINS.COUNT price;
	protected HEAL.RESTORE healPower;
	protected String firstAidName;
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

	public String getFirstAidName() {
		return firstAidName;
	}

	public LEVELS getMimimumLevelNeeded() {
		return mimimumLevelNeeded;
	}

	@Override
	public String toString() {
		return "FirstAidPO [healsEnergy=" + healsEnergy + ", price=" + price + ", healPower=" + healPower
				+ ", firstAidName=" + firstAidName + ", mimimumLevelNeeded=" + mimimumLevelNeeded + "]";
	}

}
