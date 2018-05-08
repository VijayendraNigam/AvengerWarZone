package com.vn.avenger.warzone.shop;

import com.vn.avenger.warzone.common.CollectionAdaptor;
import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.HEAL;
import com.vn.avenger.warzone.common.constants.Enums.HEAL.ENERGY;

public abstract class PotionPO extends CollectionAdaptor implements PurchaseObject {

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((healPower == null) ? 0 : healPower.hashCode());
		result = prime * result + ((healsEnergy == null) ? 0 : healsEnergy.hashCode());
		result = prime * result + ((mimimumLevelNeeded == null) ? 0 : mimimumLevelNeeded.hashCode());
		result = prime * result + ((potionName == null) ? 0 : potionName.hashCode());
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
		PotionPO other = (PotionPO) obj;
		if (healPower != other.healPower)
			return false;
		if (healsEnergy != other.healsEnergy)
			return false;
		if (mimimumLevelNeeded != other.mimimumLevelNeeded)
			return false;
		if (potionName == null) {
			if (other.potionName != null)
				return false;
		} else if (!potionName.equals(other.potionName))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PotionPO [healsEnergy=" + healsEnergy + ", price=" + price + ", healPower=" + healPower
				+ ", potionName=" + potionName + ", mimimumLevelNeeded=" + mimimumLevelNeeded + "]";
	}

}
