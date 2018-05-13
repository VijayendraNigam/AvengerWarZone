package com.vn.avenger.warzone.cast.hero;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

import com.vn.avenger.warzone.cast.combatant.Combatant;
import com.vn.avenger.warzone.cast.combatant.CombatantStats;
import com.vn.avenger.warzone.cast.monster.Monster;
import com.vn.avenger.warzone.common.Buy;
import com.vn.avenger.warzone.common.Hibernate;
import com.vn.avenger.warzone.i18n.MessageCodes;
import com.vn.avenger.warzone.shop.PurchaseObject;
import com.vn.avenger.warzone.vo.EquippedVO;
import com.vn.avenger.warzone.vo.GeneralVO;
import com.vn.avenger.warzone.vo.WealthVO;

public class Hero extends Combatant implements Buy<PurchaseObject, MessageCodes>, Hibernate<Hero> {

	private static final long serialVersionUID = 3960164957185565073L;

	public Hero(CombatantStats combatantStats) {
		super(combatantStats);
	}

	@Override
	public MessageCodes buy(PurchaseObject purchaseObject) {

		WealthVO wealth = this.getCombatantStats().getWealth();
		GeneralVO general = this.getCombatantStats().getGeneral();
		EquippedVO equipped = this.getCombatantStats().getEquipped();

		if (wealth.getCoins() > purchaseObject.getPrice().getCoins()) {

			if (general.getLevel().getValue() >= purchaseObject.getMimimumLevelNeeded().getValue()) {
				wealth.setCoins(wealth.getCoins() - purchaseObject.getPrice().getCoins());
				equipped.stock(purchaseObject);
				return MessageCodes.BUY_SUCCESS.setArguments(purchaseObject.getName());
			}
			return MessageCodes.BUY_FAIL_LEVEL.setArguments(purchaseObject.getName(), purchaseObject.getMimimumLevelNeeded());
		}
		return MessageCodes.BUY_FAIL_FUND.setArguments(purchaseObject.getName());
	}
	
	public String getWarZoneView(Monster monster) {
		
		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|           |A|v|e|n|g|e|r|  |W|a|r|z|o|n|e|           |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|                    Battle Ground                     |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|").append(NEWLINE);
		screen.append("| ").append(this.getCombatantStats().getGeneral().getPlayerName()).append(NEWLINE);
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
		screen.append("|_______________________________________________________").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("| Monster, ").append(monster.getCombatantStats().getGeneral().getCombatantName()).append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|--Score Info--").append(NEWLINE);
		screen.append("|          XP:               ").append(monster.getCombatantStats().getGeneral().getXp()).append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|--Player Info--").append(NEWLINE);
		screen.append("|          Health:           ").append(monster.getCombatantStats().getHealth().getCurrentHealth()).append(NEWLINE);
		screen.append("|          Coins:            ").append(monster.getCombatantStats().getWealth().getCoins()).append(NEWLINE);
		screen.append("|_______________________________________________________").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|  1)  Fight Monster                                    ").append(NEWLINE);
		screen.append("|  2)  Acquire Arsenal                                  ").append(NEWLINE);
		screen.append("|  3)  Use FirstAid                                     ").append(NEWLINE);
		screen.append("|  4)  Use InstaHealth                                  ").append(NEWLINE);
		screen.append("|  5)  Use Potion                                       ").append(NEWLINE);
		screen.append("|  6)  Eat Food                                         ").append(NEWLINE);
		screen.append("|  7)  Back                                             ").append(NEWLINE);
		screen.append("|_______________________________________________________").append(NEWLINE);

		return screen.toString();
	}

}
