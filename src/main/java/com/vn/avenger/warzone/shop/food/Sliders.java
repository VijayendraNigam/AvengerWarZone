package com.vn.avenger.warzone.shop.food;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.FOOD;
import com.vn.avenger.warzone.shop.FoodPO;

public final class Sliders extends FoodPO implements Immutable {

	private static final long serialVersionUID = -7657028334183472562L;

	public Sliders() {
		this.price = FOOD.TYPES.SLIDERS.getPrice();
		this.healPower = FOOD.TYPES.SLIDERS.getHealPower();
		this.foodName = FOOD.TYPES.SLIDERS.getFoodName();
		this.mimimumLevelNeeded = FOOD.TYPES.SLIDERS.getMinimumLevelNeeded();
	}
}
