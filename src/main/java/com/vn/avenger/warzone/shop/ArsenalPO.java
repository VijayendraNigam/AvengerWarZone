package com.vn.avenger.warzone.shop;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

import com.vn.avenger.warzone.common.CollectionAdaptor;
import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.COINS.COUNT;
import com.vn.avenger.warzone.common.constants.Enums.DAMAGE;
import com.vn.avenger.warzone.common.constants.Enums.ENERGY;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;

public abstract class ArsenalPO extends CollectionAdaptor implements PurchaseObject {

	private static final long serialVersionUID = -3105930229769767979L;

	private ENERGY.TYPES energyType = ENERGY.TYPES.ALL;
	private ENERGY.IMPACT energyImpact = ENERGY.IMPACT.HEAL;

	protected COINS.COUNT price;
	protected DAMAGE.INJURE injurePower;
	protected String arsenalName;
	protected LEVELS mimimumLevelNeeded;

	@Override
	public String getName() {
		return this.arsenalName;
	}

	@Override
	public COUNT getPrice() {
		return this.price;
	}

	@Override
	public float getPower() {
		return this.injurePower.getInjury();
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
		result = prime * result + ((arsenalName == null) ? 0 : arsenalName.hashCode());
		result = prime * result + ((energyImpact == null) ? 0 : energyImpact.hashCode());
		result = prime * result + ((energyType == null) ? 0 : energyType.hashCode());
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
		if (energyImpact != other.energyImpact)
			return false;
		if (energyType != other.energyType)
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
		return "ArsenalPO [energyType=" + energyType + ", energyImpact=" + energyImpact + ", price=" + price
				+ ", injurePower=" + injurePower + ", arsenalName=" + arsenalName + ", mimimumLevelNeeded="
				+ mimimumLevelNeeded + "]";
	}

	@Override
	public String view() {

		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|                       Arsenal                        |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|  Name         : ").append(this.arsenalName).append(NEWLINE);
		screen.append("|  Price        : ").append(this.price.getCoins()).append(" coins").append(NEWLINE);
		screen.append("|  Injure Power : ").append(this.injurePower.getInjury()).append(" %").append(NEWLINE);
		screen.append("|  Level Needed : ").append("Level_").append(this.mimimumLevelNeeded.getValue()).append(NEWLINE);
		screen.append("|_______________________________________________________").append(NEWLINE);

		return screen.toString();
	}

}
