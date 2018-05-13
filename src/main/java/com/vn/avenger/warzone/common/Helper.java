package com.vn.avenger.warzone.common;

import java.io.File;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.cast.monster.Monster;
import com.vn.avenger.warzone.common.constants.Enums.ABSTRACT_FACTORY.FACTORY;
import com.vn.avenger.warzone.common.constants.Enums.ARSENAL;
import com.vn.avenger.warzone.common.constants.Enums.COMBATANT.HERO;
import com.vn.avenger.warzone.common.constants.Enums.COMBATANT.MONSTER;
import com.vn.avenger.warzone.common.constants.Enums.FIRST_AID;
import com.vn.avenger.warzone.common.constants.Enums.FOOD;
import com.vn.avenger.warzone.common.constants.Enums.INSTA_HEALTH;
import com.vn.avenger.warzone.common.constants.Enums.POTIONS;
import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.common.impl.factory.AbstractFactory;
import com.vn.avenger.warzone.screen.Window;
import com.vn.avenger.warzone.shop.ArsenalPO;
import com.vn.avenger.warzone.shop.FirstAidPO;
import com.vn.avenger.warzone.shop.FoodPO;
import com.vn.avenger.warzone.shop.InstaHealthPO;
import com.vn.avenger.warzone.shop.PotionPO;

public class Helper {

	public static final String MANIFEST = ".V1";
	public static final String VERSION = "1.4 DEV";
	public static final String STAGE = "Alpha";

	public static final String NEWLINE = System.getProperty("line.separator");
	
	public static final int SCREEN_LENGTH = 50;

	public static final String BASE_PATH = System.getProperty("user.dir");
	public static final String DB_PATH = "src/main/java/com/vn/avenger/warzone/db";
	public static final String SAVE_EXTENSION = ".AWZSave";
	

	public static final Factory<Hero, HERO> HERO_FACTORY = AbstractFactory.getFactory(FACTORY.HERO);
	public static final Factory<Monster, MONSTER> MONSTER_FACTORY = AbstractFactory.getFactory(FACTORY.MONSTER);
	public static final Factory<ArsenalPO, ARSENAL.TYPES> ARSENAL_FACTORY = AbstractFactory.getFactory(FACTORY.ARSENAL);
	public static final Factory<PotionPO, POTIONS.TYPES> POTION_FACTORY = AbstractFactory.getFactory(FACTORY.POTIONS);
	public static final Factory<FirstAidPO, FIRST_AID.TYPES> FIRSTAID_FACTORY = AbstractFactory.getFactory(FACTORY.FIRST_AID);
	public static final Factory<InstaHealthPO, INSTA_HEALTH.TYPES> INSTA_HEALTH_FACTORY = AbstractFactory.getFactory(FACTORY.INSTA_HEALTH);
	public static final Factory<FoodPO, FOOD.TYPES> FOOD_FACTORY = AbstractFactory.getFactory(FACTORY.FOOD);
	public static final Factory<Window<String>, SCREENS.TYPES> SCREEN_FACTORY = AbstractFactory.getFactory(FACTORY.SCREENS);
	
	
	public static String constructSaveFilePath(String username) {

		return BASE_PATH +
			   File.separator +
			   DB_PATH +
			   File.separator +
			   username.toUpperCase() +
			   MANIFEST +
			   SAVE_EXTENSION;
				
	}
	
}
