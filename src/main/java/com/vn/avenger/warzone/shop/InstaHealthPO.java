package com.vn.avenger.warzone.shop;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

import com.vn.avenger.warzone.common.CollectionAdaptor;
import com.vn.avenger.warzone.common.constants.Enums.DIAMONDS;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.HEAL;
import com.vn.avenger.warzone.common.constants.Enums.HEAL.ENERGY;

public abstract class InstaHealthPO extends CollectionAdaptor implements PurchaseObject {

	private static final long serialVersionUID = 3480553358927131122L;

	private ENERGY healsEnergy = ENERGY.HEALTH;

	protected DIAMONDS.COUNT price;
	protected HEAL.RESTORE healPower;
	protected String instaHealthName;
	protected LEVELS mimimumLevelNeeded;

	public ENERGY getHealsEnergy() {
		return healsEnergy;
	}

	public DIAMONDS.COUNT getPrice() {
		return price;
	}

	public HEAL.RESTORE getHealPower() {
		return healPower;
	}

	public String getInstaHealthName() {
		return instaHealthName;
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
		result = prime * result + ((instaHealthName == null) ? 0 : instaHealthName.hashCode());
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
		InstaHealthPO other = (InstaHealthPO) obj;
		if (healPower != other.healPower)
			return false;
		if (healsEnergy != other.healsEnergy)
			return false;
		if (instaHealthName == null) {
			if (other.instaHealthName != null)
				return false;
		} else if (!instaHealthName.equals(other.instaHealthName))
			return false;
		if (mimimumLevelNeeded != other.mimimumLevelNeeded)
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InstaHealthPO [healsEnergy=" + healsEnergy + ", price=" + price + ", healPower=" + healPower
				+ ", instaHealthName=" + instaHealthName + ", mimimumLevelNeeded=" + mimimumLevelNeeded + "]";
	}

	@Override
	public String render() {

		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|                    InstaHealth                       |").append(NEWLINE);
		screen.append("|______________________________________________________|").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|  Name         : ").append(this.instaHealthName).append(NEWLINE);
		screen.append("|  Price        : ").append(this.price.getValue()).append(" diamonds").append(NEWLINE);
		screen.append("|  Heal Power   : ").append(this.healPower.getPower()).append(" %").append(NEWLINE);
		screen.append("|  Level Needed : ").append("Level_").append(this.mimimumLevelNeeded.getLevel()).append(NEWLINE);
		screen.append("|_______________________________________________________").append(NEWLINE);

		return screen.toString();
	}

}
