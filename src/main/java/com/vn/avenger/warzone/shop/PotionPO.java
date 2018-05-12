package com.vn.avenger.warzone.shop;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

import com.vn.avenger.warzone.common.CollectionAdaptor;
import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.COINS.COUNT;
import com.vn.avenger.warzone.common.constants.Enums.ENERGY;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.HEAL;

public abstract class PotionPO extends CollectionAdaptor implements PurchaseObject {

	private static final long serialVersionUID = 3590844641460421324L;

	private ENERGY.TYPES energyType = ENERGY.TYPES.STRENGTH;
	private ENERGY.IMPACT energyImpact = ENERGY.IMPACT.HEAL;

	protected COINS.COUNT price;
	protected HEAL.RESTORE healPower;
	protected String potionName;
	protected LEVELS mimimumLevelNeeded;

	@Override
	public String getName() {
		return this.potionName;
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
		result = prime * result + ((healPower == null) ? 0 : healPower.hashCode());
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
		if (energyImpact != other.energyImpact)
			return false;
		if (energyType != other.energyType)
			return false;
		if (healPower != other.healPower)
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
		return "PotionPO [energyType=" + energyType + ", energyImpact=" + energyImpact + ", price=" + price
				+ ", healPower=" + healPower + ", potionName=" + potionName + ", mimimumLevelNeeded="
				+ mimimumLevelNeeded + "]";
	}

	@Override
	public String render() {

		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|                      Potion                          |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|  Name         : ").append(this.potionName).append(NEWLINE);
		screen.append("|  Price        : ").append(this.price.getCoins()).append(" coins").append(NEWLINE);
		screen.append("|  Heal Power   : ").append(this.healPower.getPower()).append(" %").append(NEWLINE);
		screen.append("|  Level Needed : ").append("Level_").append(this.mimimumLevelNeeded.getValue()).append(NEWLINE);
		screen.append("|_______________________________________________________").append(NEWLINE);

		return screen.toString();
	}

}
