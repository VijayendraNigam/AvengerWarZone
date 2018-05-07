package com.vn.avenger.warzone.shop.food;

import com.vn.avenger.warzone.common.Immutable;
import com.vn.avenger.warzone.common.constants.Enums.FOOD;
import com.vn.avenger.warzone.shop.FoodPO;

public final class Pasta extends FoodPO implements Immutable {

	private static final long serialVersionUID = -7657028334183472562L;

	public Pasta() {
		this.price = FOOD.TYPES.PASTA.getPrice();
		this.healPower = FOOD.TYPES.PASTA.getHealPower();
		this.foodName = FOOD.TYPES.PASTA.getFoodName();
		this.mimimumLevelNeeded = FOOD.TYPES.PASTA.getMinimumLevelNeeded();
	}
}
