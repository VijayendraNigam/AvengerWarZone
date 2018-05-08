package com.vn.avenger.warzone.shop;

import com.vn.avenger.warzone.common.CollectionAdaptor;
import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.DAMAGE;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.HEAL.ENERGY;

public abstract class ArsenalPO extends CollectionAdaptor implements PurchaseObject {

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arsenalName == null) ? 0 : arsenalName.hashCode());
		result = prime * result + ((damageEnergy == null) ? 0 : damageEnergy.hashCode());
		result = prime * result + ((injurePower == null) ? 0 : injurePower.hashCode());
		result = prime * result + ((mimimumLevelNeeded == null) ? 0 : mimimumLevelNeeded.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArsenalPO other = (ArsenalPO) obj;
		if (arsenalName == null) {
			if (other.arsenalName != null)
				return false;
		} else if (!arsenalName.equals(other.arsenalName))
			return false;
		if (damageEnergy != other.damageEnergy)
			return false;
		if (injurePower != other.injurePower)
			return false;
		if (mimimumLevelNeeded != other.mimimumLevelNeeded)
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ArsenalPO [damageEnergy=" + damageEnergy + ", price=" + price + ", injurePower=" + injurePower
				+ ", arsenalName=" + arsenalName + ", mimimumLevelNeeded=" + mimimumLevelNeeded + "]";
	}

}
