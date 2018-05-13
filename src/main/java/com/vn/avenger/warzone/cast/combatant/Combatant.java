package com.vn.avenger.warzone.cast.combatant;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

import java.io.Serializable;
import java.util.stream.Collectors;

import com.vn.avenger.warzone.action.Fight;
import com.vn.avenger.warzone.common.Acquire;
import com.vn.avenger.warzone.common.Avail;
import com.vn.avenger.warzone.i18n.MessageCodes;
import com.vn.avenger.warzone.shop.ArsenalPO;
import com.vn.avenger.warzone.shop.PurchaseObject;

public abstract class Combatant implements Fight<Combatant, Combatant>, 
                                           Acquire<ArsenalPO, MessageCodes>,
                                           Avail<PurchaseObject, MessageCodes>, 
                                           Serializable {

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
	
	public String getHomeView() {
		
		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|           |A|v|e|n|g|e|r|  |W|a|r|z|o|n|e|           |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|                    Welcome Home                      |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|").append(NEWLINE);
		screen.append("| Welcome, ").append(this.getCombatantStats().getGeneral().getPlayerName()).append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("| Level:   ").append(this.getCombatantStats().getGeneral().getLevel().getValue())
		      .append("                 Hero:  ").append(this.getCombatantStats().getGeneral().getCombatantName()).append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|--Score Info--").append(NEWLINE);
		screen.append("|          XP:               ").append(this.getCombatantStats().getGeneral().getXp()).append(NEWLINE);
		screen.append("|          Highest Score:    ").append(this.getCombatantStats().getStatistics().getHighestScore()).append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|--Player Info--").append(NEWLINE);
		screen.append("|          Health:           ").append(this.getCombatantStats().getHealth().getCurrentHealth()).append(NEWLINE);
		screen.append("|          Coins:            ").append(this.getCombatantStats().getWealth().getCoins()).append(NEWLINE);
		screen.append("|          Diamonds:         ").append(this.getCombatantStats().getWealth().getDiamonds()).append(NEWLINE);
		screen.append("|          Acquired Arsenal: ").append(this.getCombatantStats().getEquipped().getAcquiredArsenal().getName()).append(NEWLINE);
		screen.append("|          Arsenal:          ").append(this.getCombatantStats().getEquipped().getArsenals().stream().map(po -> po.getName()).collect(Collectors.joining(","))).append(NEWLINE);
		screen.append("|          Potions:          ").append(this.getCombatantStats().getEquipped().getPotions().stream().map(po -> po.getName()).collect(Collectors.joining(","))).append(NEWLINE);
		screen.append("|          First-Aid:        ").append(this.getCombatantStats().getEquipped().getFirstAids().stream().map(po -> po.getName()).collect(Collectors.joining(","))).append(NEWLINE);
		screen.append("|          InstaHealth:      ").append(this.getCombatantStats().getEquipped().getInstaHealths().stream().map(po -> po.getName()).collect(Collectors.joining(","))).append(NEWLINE);
		screen.append("|_______________________________________________________").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|  1)  Go to WarZone                                    ").append(NEWLINE);
		screen.append("|  2)  Go to Town                                       ").append(NEWLINE);
		screen.append("|  3)  Achievements                                     ").append(NEWLINE);
		screen.append("|  4)  Statistics                                       ").append(NEWLINE);
		screen.append("|  5)  Health                                           ").append(NEWLINE);
		screen.append("|  6)  Lifes                                            ").append(NEWLINE);
		screen.append("|  7)  Settings                                         ").append(NEWLINE);
		screen.append("|  8)  Help                                             ").append(NEWLINE);
		screen.append("|  9)  Quit (Game will automatically be saved)          ").append(NEWLINE);
		screen.append("|_______________________________________________________").append(NEWLINE);

		return screen.toString();
	}

}
