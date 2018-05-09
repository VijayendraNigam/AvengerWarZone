package com.vn.avenger.warzone.vo;

import com.vn.avenger.warzone.common.constants.Enums.COINS;
import com.vn.avenger.warzone.common.constants.Enums.DIAMONDS;

public class CoinsVO implements ValueObject {

	private static final long serialVersionUID = -8604143753994215246L;

	private int coins;
	private int diamonds;
	private int battleTokens;

	public CoinsVO() {
		this.coins = COINS.CREDIT.LEVEL_1.getCoins();
		this.diamonds = DIAMONDS.CREDIT.LEVEL_1.getDiamonds();
		this.battleTokens = 0;
	}

	public int getCoins() {
		return coins;
	}

	public CoinsVO setCoins(int coins) {
		this.coins = coins;
		return this;
	}

	public int getDiamonds() {
		return diamonds;
	}

	public CoinsVO setDiamonds(int diamonds) {
		this.diamonds = diamonds;
		return this;
	}

	public int getBattleTokens() {
		return battleTokens;
	}

	public CoinsVO setBattleTokens(int battleTokens) {
		this.battleTokens = battleTokens;
		return this;
	}

	@Override
	public String toString() {
		return "CoinsVO [coins=" + coins + ", diamonds=" + diamonds + ", battleTokens=" + battleTokens + "]";
	}

}
