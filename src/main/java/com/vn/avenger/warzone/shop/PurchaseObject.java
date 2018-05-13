package com.vn.avenger.warzone.shop;

import java.io.Serializable;

import com.vn.avenger.warzone.cast.combatant.Combatant;
import com.vn.avenger.warzone.common.Use;
import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.ENERGY;
import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.i18n.MessageCodes;
import com.vn.avenger.warzone.screen.Window;
import com.vn.avenger.warzone.vo.EquippedVO;
import com.vn.avenger.warzone.vo.HealthVO;

public interface PurchaseObject extends Window<String>, Use<Combatant, MessageCodes>, Serializable {

	public String getName();

	public COINS.COUNT getPrice();

	public float getPower();

	public ENERGY.IMPACT getEnergyImpact();

	public ENERGY.TYPES getEnergyType();

	public LEVELS getMimimumLevelNeeded();

	default MessageCodes use(Combatant combatant) {

		EquippedVO equipped = combatant.getCombatantStats().getEquipped();
		HealthVO health = combatant.getCombatantStats().getHealth();

		equipped.consume(this);

		switch (this.getEnergyType()) {

		case HEALTH:

			switch (this.getEnergyImpact()) {

			case HEAL:
				health.setCurrentHealth((int) (health.getCurrentHealth() * (1 + this.getPower())));
				break;

			case DAMAGE:
				health.setCurrentHealth((int) (health.getCurrentHealth() * (1 - this.getPower())));
				break;
			}
			break;

		case STRENGTH:
			switch (this.getEnergyImpact()) {

			case HEAL:
				health.setCurrentStrength((int) (health.getCurrentStrength() * (1 + this.getPower())));
				break;

			case DAMAGE:
				health.setCurrentStrength((int) (health.getCurrentStrength() * (1 - this.getPower())));
				break;
			}
			break;

		case STAMINA:
			switch (this.getEnergyImpact()) {

			case HEAL:
				health.setCurrentStamina((int) (health.getCurrentStamina() * (1 + this.getPower())));
				break;

			case DAMAGE:
				health.setCurrentStamina((int) (health.getCurrentStamina() * (1 - this.getPower())));
				break;
			}
			break;

		case ALL:
			switch (this.getEnergyImpact()) {

			case HEAL:
				health.setCurrentHealth((int) (health.getCurrentHealth() * (1 + this.getPower())));
				health.setCurrentStrength((int) (health.getCurrentStrength() * (1 + this.getPower())));
				health.setCurrentStamina((int) (health.getCurrentStamina() * (1 + this.getPower())));
				break;

			case DAMAGE:
				health.setCurrentHealth((int) (health.getCurrentHealth() * (1 - this.getPower())));
				health.setCurrentStrength((int) (health.getCurrentStrength() * (1 - this.getPower())));
				health.setCurrentStamina((int) (health.getCurrentStamina() * (1 - this.getPower())));
				break;

			}
			break;
		}

		return MessageCodes.USE_SUCCESS.setArguments(this.getName());
	}
}
