package com.vn.avenger.warzone.shop.food;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.FOOD;
import com.vn.avenger.warzone.shop.FoodPO;

public final class Taco extends FoodPO implements Immutable {

	private static final long serialVersionUID = -7657028334183472562L;

	public Taco() {
		this.price = FOOD.TYPES.TACO.getPrice();
		this.healPower = FOOD.TYPES.TACO.getHealPower();
		this.foodName = FOOD.TYPES.TACO.getFoodName();
		this.mimimumLevelNeeded = FOOD.TYPES.TACO.getMinimumLevelNeeded();
	}
	
}
