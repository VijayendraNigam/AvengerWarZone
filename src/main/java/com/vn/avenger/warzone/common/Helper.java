package com.vn.avenger.warzone.common;

import com.vn.avenger.warzone.common.constants.Enums.ABSTRACT_FACTORY.FACTORY;
import com.vn.avenger.warzone.common.constants.Enums.ARSENAL;
import com.vn.avenger.warzone.common.constants.Enums.COMBATANT.HERO;
import com.vn.avenger.warzone.common.constants.Enums.FOOD;
import com.vn.avenger.warzone.common.constants.Enums.INSTA_HEALTH;
import com.vn.avenger.warzone.common.constants.Enums.POTIONS;
import com.vn.avenger.warzone.common.impl.factory.AbstractFactory;
import com.vn.avenger.warzone.shop.ArsenalPO;
import com.vn.avenger.warzone.shop.FoodPO;
import com.vn.avenger.warzone.shop.InstaHealthPO;
import com.vn.avenger.warzone.shop.PotionPO;

public class Helper {

	public static final String VERSION = "1.4 DEV";
	public static final String STAGE = "Alpha";

	public static final String NEWLINE = System.getProperty("line.separator");

	public static final Factory<ArsenalPO, HERO> HERO_FACTORY = AbstractFactory.getFactory(FACTORY.HERO);
	public static final Factory<ArsenalPO, ARSENAL.TYPES> ARSENAL_FACTORY = AbstractFactory.getFactory(FACTORY.ARSENAL);
	public static final Factory<PotionPO, POTIONS.TYPES> POTION_FACTORY = AbstractFactory.getFactory(FACTORY.POTIONS);
	public static final Factory<InstaHealthPO, INSTA_HEALTH.TYPES> INSTA_HEALTH_FACTORY = AbstractFactory.getFactory(FACTORY.INSTA_HEALTH);
	public static final Factory<FoodPO, FOOD.TYPES> FOOD_FACTORY = AbstractFactory.getFactory(FACTORY.FOOD);
}
