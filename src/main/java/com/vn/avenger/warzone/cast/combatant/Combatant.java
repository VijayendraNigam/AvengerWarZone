package com.vn.avenger.warzone.cast.combatant;

import java.io.Serializable;

import com.vn.avenger.warzone.action.Fight;
import com.vn.avenger.warzone.common.Acquire;
import com.vn.avenger.warzone.common.Avail;
import com.vn.avenger.warzone.i18n.MessageCodes;
import com.vn.avenger.warzone.shop.ArsenalPO;
import com.vn.avenger.warzone.shop.PurchaseObject;

public abstract class Combatant implements Fight<Combatant, Combatant>, Acquire<ArsenalPO, MessageCodes>,
		Avail<PurchaseObject, MessageCodes>, Serializable {

	private static final long serialVersionUID = -138744694364281533L;

	private CombatantStats combatantStats;

	public Combatant(CombatantStats combatantStats) {
		this.combatantStats = combatantStats;
	}

	public CombatantStats getCombatantStats() {
		return combatantStats;
	}

	public void setCombatantStats(CombatantStats combatantStats) {
		this.combatantStats = combatantStats;
	}

	@Override
	public String toString() {
		return "Combatant [combatantStats=" + combatantStats + "]";
	}

	@Override
	public MessageCodes acquire(ArsenalPO arsenal) {
		this.getCombatantStats().getEquipped().setAcquiredArsenal(arsenal);
		return MessageCodes.ACQUIRE_SUCCESS.setArguments(arsenal.getName());
	}

	@Override
	public MessageCodes avail(PurchaseObject purchaseObject) {
		MessageCodes messageCode = purchaseObject.use(this);
		return messageCode;
	}

	@Override
	public Combatant doAttack(Combatant attackedOn) {
		
		ArsenalPO attackerArsenal = this.getCombatantStats().getEquipped().getAcquiredArsenal();
		attackedOn.avail(attackerArsenal);
		
		return this;
	}

}
