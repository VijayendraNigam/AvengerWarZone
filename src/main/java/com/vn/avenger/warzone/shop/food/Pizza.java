package com.vn.avenger.warzone.shop.food;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.FOOD;
import com.vn.avenger.warzone.shop.FoodPO;

public final class Pizza extends FoodPO implements Immutable {

	private static final long serialVersionUID = -7657028334183472562L;

	public Pizza() {
		this.price = FOOD.TYPES.PIZZA.getPrice();
		this.healPower = FOOD.TYPES.PIZZA.getHealPower();
		this.foodName = FOOD.TYPES.PIZZA.getFoodName();
		this.mimimumLevelNeeded = FOOD.TYPES.PIZZA.getMinimumLevelNeeded();
	}
}
