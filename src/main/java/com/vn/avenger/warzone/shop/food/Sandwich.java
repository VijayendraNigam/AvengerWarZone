package com.vn.avenger.warzone.shop.food;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.FOOD;
import com.vn.avenger.warzone.shop.FoodPO;

public final class Sandwich extends FoodPO implements Immutable {

	private static final long serialVersionUID = -7657028334183472562L;

	public Sandwich() {
		this.price = FOOD.TYPES.SANDWICH.getPrice();
		this.healPower = FOOD.TYPES.SANDWICH.getHealPower();
		this.foodName = FOOD.TYPES.SANDWICH.getFoodName();
		this.mimimumLevelNeeded = FOOD.TYPES.SANDWICH.getMinimumLevelNeeded();
	}
}
