package com.vn.avenger.warzone.shop.food;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.FOOD;
import com.vn.avenger.warzone.shop.FoodPO;

public final class Burrito extends FoodPO implements Immutable {

	private static final long serialVersionUID = -7657028334183472562L;

	public Burrito() {
		this.price = FOOD.TYPES.BURRITO.getPrice();
		this.healPower = FOOD.TYPES.BURRITO.getHealPower();
		this.foodName = FOOD.TYPES.BURRITO.getFoodName();
		this.mimimumLevelNeeded = FOOD.TYPES.BURRITO.getMinimumLevelNeeded();
	}
}
