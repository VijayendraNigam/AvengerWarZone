package com.vn.avenger.warzone.common.impl.factory;

import com.vn.avenger.warzone.common.Factory;
import com.vn.avenger.warzone.common.constants.Enums.ABSTRACT_FACTORY;

public class AbstractFactory {

	@SuppressWarnings("unchecked")
	public static <T, E extends Enum<E>> Factory<T, E> getFactory(ABSTRACT_FACTORY.FACTORY factory) {

		switch (factory) {

		case HERO:         return (Factory<T, E>) new HeroFactory();
		case MONSTER:      return (Factory<T, E>) new MonsterFactory();
		case ARSENAL:      return (Factory<T, E>) new ArsenalFactory();
		case POTIONS:      return (Factory<T, E>) new PotionFactory();
		case FIRST_AID:    return (Factory<T, E>) new FirstAidFactory();
		case INSTA_HEALTH: return (Factory<T, E>) new InstaHealthFactory();
		case FOOD:         return (Factory<T, E>) new FoodFactory();
		case SCREENS:      return (Factory<T, E>) new ScreenFactory();
		default:           return null;

		}
	}
}
