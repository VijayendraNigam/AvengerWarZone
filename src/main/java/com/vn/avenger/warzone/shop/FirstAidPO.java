package com.vn.avenger.warzone.shop;

import com.vn.avenger.warzone.common.CollectionAdaptor;
import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.HEAL;
import com.vn.avenger.warzone.common.constants.Enums.HEAL.ENERGY;

public abstract class FirstAidPO extends CollectionAdaptor implements PurchaseObject {

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstAidName == null) ? 0 : firstAidName.hashCode());
		result = prime * result + ((healPower == null) ? 0 : healPower.hashCode());
		result = prime * result + ((healsEnergy == null) ? 0 : healsEnergy.hashCode());
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
		FirstAidPO other = (FirstAidPO) obj;
		if (firstAidName == null) {
			if (other.firstAidName != null)
				return false;
		} else if (!firstAidName.equals(other.firstAidName))
			return false;
		if (healPower != other.healPower)
			return false;
		if (healsEnergy != other.healsEnergy)
			return false;
		if (mimimumLevelNeeded != other.mimimumLevelNeeded)
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FirstAidPO [healsEnergy=" + healsEnergy + ", price=" + price + ", healPower=" + healPower
				+ ", firstAidName=" + firstAidName + ", mimimumLevelNeeded=" + mimimumLevelNeeded + "]";
	}

}
