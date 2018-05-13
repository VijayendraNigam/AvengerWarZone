package com.vn.avenger.warzone.shop;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

import com.vn.avenger.warzone.common.CollectionAdaptor;
import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.COINS.COUNT;
import com.vn.avenger.warzone.common.constants.Enums.ENERGY;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.HEAL;

public abstract class FoodPO extends CollectionAdaptor implements PurchaseObject {

	private static final long serialVersionUID = 5592651677297031031L;

	private ENERGY.TYPES energyType = ENERGY.TYPES.ALL;
	private ENERGY.IMPACT energyImpact = ENERGY.IMPACT.HEAL;

	protected COINS.COUNT price;
	protected HEAL.RESTORE healPower;
	protected String foodName;
	protected LEVELS mimimumLevelNeeded;

	@Override
	public String getName() {
		return this.foodName;
	}

	@Override
	public COUNT getPrice() {
		return this.price;
	}

	@Override
	public float getPower() {
		return this.healPower.getPower();
	}

	@Override
	public ENERGY.TYPES getEnergyType() {
		return this.energyType;
	}

	@Override
	public ENERGY.IMPACT getEnergyImpact() {
		return this.energyImpact;
	}

	@Override
	public LEVELS getMimimumLevelNeeded() {
		return this.mimimumLevelNeeded;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((energyImpact == null) ? 0 : energyImpact.hashCode());
		result = prime * result + ((energyType == null) ? 0 : energyType.hashCode());
		result = prime * result + ((foodName == null) ? 0 : foodName.hashCode());
		result = prime * result + ((healPower == null) ? 0 : healPower.hashCode());
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
		if (energyImpact != other.energyImpact)
			return false;
		if (energyType != other.energyType)
			return false;
		if (foodName == null) {
			if (other.foodName != null)
				return false;
		} else if (!foodName.equals(other.foodName))
			return false;
		if (healPower != other.healPower)
			return false;
		if (mimimumLevelNeeded != other.mimimumLevelNeeded)
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FoodPO [energyType=" + energyType + ", energyImpact=" + energyImpact + ", price=" + price
				+ ", healPower=" + healPower + ", foodName=" + foodName + ", mimimumLevelNeeded=" + mimimumLevelNeeded
				+ "]";
	}

	@Override
	public String view() {

		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|                       Food                           |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|  Name         : ").append(this.foodName).append(NEWLINE);
		screen.append("|  Price        : ").append(this.price.getCoins()).append(" coins").append(NEWLINE);
		screen.append("|  Heal Power   : ").append(this.healPower.getPower()).append(" %").append(NEWLINE);
		screen.append("|  Level Needed : ").append("Level_").append(this.mimimumLevelNeeded.getValue()).append(NEWLINE);
		screen.append("|_______________________________________________________").append(NEWLINE);

		return screen.toString();
	}
}
