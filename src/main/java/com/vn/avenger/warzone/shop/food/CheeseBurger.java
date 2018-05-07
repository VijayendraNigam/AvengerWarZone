package com.vn.avenger.warzone.shop.food;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.FOOD;
import com.vn.avenger.warzone.shop.FoodPO;

public final class CheeseBurger extends FoodPO implements Immutable {

	private static final long serialVersionUID = -7657028334183472562L;

	public CheeseBurger() {
		this.price = FOOD.TYPES.CHEESE_BURGER.getPrice();
		this.healPower = FOOD.TYPES.CHEESE_BURGER.getHealPower();
		this.foodName = FOOD.TYPES.CHEESE_BURGER.getFoodName();
		this.mimimumLevelNeeded = FOOD.TYPES.CHEESE_BURGER.getMinimumLevelNeeded();
	}
}
