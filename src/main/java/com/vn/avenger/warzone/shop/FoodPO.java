package com.vn.avenger.warzone.shop;

import com.vn.avenger.warzone.common.CollectionAdaptor;
import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.HEAL;
import com.vn.avenger.warzone.common.constants.Enums.HEAL.ENERGY;

public abstract class FoodPO extends CollectionAdaptor implements PurchaseObject {

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((foodName == null) ? 0 : foodName.hashCode());
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
		FoodPO other = (FoodPO) obj;
		if (foodName == null) {
			if (other.foodName != null)
				return false;
		} else if (!foodName.equals(other.foodName))
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
		return "FoodPO [healsEnergy=" + healsEnergy + ", price=" + price + ", healPower=" + healPower + ", foodName="
				+ foodName + ", mimimumLevelNeeded=" + mimimumLevelNeeded + "]";
	}

}
