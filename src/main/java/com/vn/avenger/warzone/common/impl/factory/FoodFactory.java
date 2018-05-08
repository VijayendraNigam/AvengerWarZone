package com.vn.avenger.warzone.common.impl.factory;

import com.vn.avenger.warzone.common.Factory;
import com.vn.avenger.warzone.common.constants.Enums.FOOD;
import com.vn.avenger.warzone.shop.FoodPO;
import com.vn.avenger.warzone.shop.food.Burrito;
import com.vn.avenger.warzone.shop.food.CheeseBurger;
import com.vn.avenger.warzone.shop.food.Limeade;
import com.vn.avenger.warzone.shop.food.Pasta;
import com.vn.avenger.warzone.shop.food.Pizza;
import com.vn.avenger.warzone.shop.food.Sandwich;
import com.vn.avenger.warzone.shop.food.Sliders;
import com.vn.avenger.warzone.shop.food.Taco;

public class FoodFactory implements Factory<FoodPO, FOOD.TYPES> {

	@Override
	public FoodPO get(FOOD.TYPES food) {

		switch (food) {

		case SANDWICH:       return new Sandwich();
		case CHEESE_BURGER:  return new CheeseBurger();
		case LIMEADE:        return new Limeade();
		case SLIDERS:        return new Sliders();
		case BURRITO:        return new Burrito();
		case TACO:           return new Taco();
		case PIZZA:          return new Pizza();
		case PASTA:          return new Pasta();
		default:             return new Sandwich();

		}

	}

}
