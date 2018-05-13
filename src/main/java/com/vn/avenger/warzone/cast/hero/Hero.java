package com.vn.avenger.warzone.cast.hero;

import com.vn.avenger.warzone.cast.combatant.Combatant;
import com.vn.avenger.warzone.cast.combatant.CombatantStats;
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

}
