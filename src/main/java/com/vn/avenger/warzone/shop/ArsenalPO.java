package com.vn.avenger.warzone.shop;

import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.DAMAGE;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.HEAL.ENERGY;

public abstract class ArsenalPO implements PurchaseObject {

	private static final long serialVersionUID = -3105930229769767979L;

	private ENERGY damageEnergy = ENERGY.ALL;

	protected COINS.COUNT price;
	protected DAMAGE.INJURE injurePower;
	protected String arsenalName;
	protected LEVELS mimimumLevelNeeded;

	public ENERGY getDamageEnergy() {
		return damageEnergy;
	}

	public COINS.COUNT getPrice() {
		return price;
	}

	public DAMAGE.INJURE getInjurePower() {
		return injurePower;
	}

	public String getArsenalName() {
		return arsenalName;
	}

	public LEVELS getMimimumLevelNeeded() {
		return mimimumLevelNeeded;
	}

	@Override
	public String toString() {
		return "ArsenalPO [damageEnergy=" + damageEnergy + ", price=" + price + ", injurePower=" + injurePower
				+ ", arsenalName=" + arsenalName + ", mimimumLevelNeeded=" + mimimumLevelNeeded + "]";
	}

}
