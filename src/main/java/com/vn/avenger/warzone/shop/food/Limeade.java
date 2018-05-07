package com.vn.avenger.warzone.shop.food;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.FOOD;
import com.vn.avenger.warzone.shop.FoodPO;

public final class Limeade extends FoodPO implements Immutable {

	private static final long serialVersionUID = -7657028334183472562L;

	public Limeade() {
		this.price = FOOD.TYPES.LIMEADE.getPrice();
		this.healPower = FOOD.TYPES.LIMEADE.getHealPower();
		this.foodName = FOOD.TYPES.LIMEADE.getFoodName();
		this.mimimumLevelNeeded = FOOD.TYPES.LIMEADE.getMinimumLevelNeeded();
	}
}
