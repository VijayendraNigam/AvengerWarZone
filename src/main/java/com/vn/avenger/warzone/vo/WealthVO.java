package com.vn.avenger.warzone.vo;

import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.DIAMONDS;

public class WealthVO implements ValueObject {

	private static final long serialVersionUID = -8604143753994215246L;

	private int coins;
	private int diamonds;

	public WealthVO() {
		this.coins = COINS.CREDIT.LEVEL_1.getCoins();
		this.diamonds = DIAMONDS.CREDIT.LEVEL_1.getDiamonds();
	}

	public int getCoins() {
		return coins;
	}

	public WealthVO setCoins(int coins) {
		this.coins = coins;
		return this;
	}

	public int getDiamonds() {
		return diamonds;
	}

	public WealthVO setDiamonds(int diamonds) {
		this.diamonds = diamonds;
		return this;
	}

	@Override
	public String toString() {
		return "WealthVO [coins=" + coins + ", diamonds=" + diamonds + "]";
	}

	@Override
	public String view() {
		return null;
	}

}
