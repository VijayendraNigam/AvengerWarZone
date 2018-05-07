package com.vn.avenger.warzone.common.constants;

import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;

public class Enums {

	public static class COMBATANT {

		public enum HERO {

			THOR("THOR"), 
			CAPTAIN_AMERICA("CAPTAIN AMERICA");

			private String heroName;

			HERO(String heroName) {
				this.heroName = heroName;
			}

			public String getHeroName() {
				return this.heroName;
			}
		}

		public enum MONSTER {

			LOKI("LOKI"), 
			RED_SKULL("RED SKULL");

			private String monsterName;

			MONSTER(String monsterName) {
				this.monsterName = monsterName;
			}

			public String getMonsterName() {
				return this.monsterName;
			}
		}
	}

	public static class HEALTH {

		public enum MAXIMUM_RANGE {

			LEVEL_I(100), 
			LEVEL_II(200), 
			LEVEL_III(500), 
			LEVEL_IV(1000), 
			LEVEL_V(1000000);

			private int health;

			MAXIMUM_RANGE(int health) {
				this.health = health;
			}

			public int getHealth() {
				return this.health;
			}
		}
		
		public enum STATUS {

			ALIVE(true), 
			DEAD(false);

			private boolean status;

			STATUS(boolean status) {
				this.status = status;
			}

			public boolean getStatus() {
				return this.status;
			}
		}

	}
	
	public static class GENERAL {

		public enum LEVELS {

			I(1), 
			II(2), 
			III(3), 
			IV(4), 
			V(5);

			private int level;

			LEVELS(int level) {
				this.level = level;
			}

			public int getLevel() {
				return this.level;
			}

		}
	}
	
	public static class LIFE {

		public enum MAXIMUM_RANGE {

			LEVEL_I(1), 
			LEVEL_II(2), 
			LEVEL_III(3), 
			LEVEL_IV(10), 
			LEVEL_V(20);
			
			private int count;

			MAXIMUM_RANGE(int count) {
				this.count = count;
			}

			public int getCount() {
				return this.count;
			}
		}
	}
	
	public static class XP {

		public enum NEEDED {

			LEVEL_I(100), 
			LEVEL_II(200), 
			LEVEL_III(1000), 
			LEVEL_IV(25000), 
			LEVEL_V(1000000);

			private int points;

			NEEDED(int points) {
				this.points = points;
			}

			public int getPoints() {
				return this.points;
			}
		}
	}
	
	public static class COINS {

		public enum CREDIT {

			LEVEL_I(100), 
			LEVEL_II(200), 
			LEVEL_III(1000), 
			LEVEL_IV(25000), 
			LEVEL_V(1000000);

			private int coins;

			CREDIT(int coins) {
				this.coins = coins;
			}

			public int getCoins() {
				return this.coins;
			}
		}
		
		public enum COUNT {

			TEN(10), 
			HUNDRED(100), 
			THOUSAND(1000), 
			MILLION(1000000),
			TRLLION(1000000000);

			private int value;

			COUNT(int value) {
				this.value = value;
			}

			public int getValue() {
				return this.value;
			}
		}
	}
	
	public static class DIAMONDS {

		public enum COUNT {

			ZERO(0),
			ONE(1), 
			FIVE(5), 
			TEN(10), 
			HUNDRED(100),
			THOUSAND(1000);

			private int value;

			COUNT(int value) {
				this.value = value;
			}

			public int getValue() {
				return this.value;
			}
		}
	}


	public static class GAME {

		public enum MODE {

			AMATEUR("AMATEUR"), 
			HARD("HARD"),
			DEAD_END("DEAD END");

			private String mode;

			MODE(String mode) {
				this.mode = mode;
			}

			public String getMode() {
				return this.mode;
			}
		}
	}
	
	public static class ACHIEVEMENTS {

		public enum BADGES {

			FIRST_WIN("FIRST WIN"),
			
			THREE_IN_A_ROW("3 IN A ROW"),
			FIVE_IN_A_ROW("5 IN A ROW"),
			SEVEN_IN_A_ROW("7 IN A ROW"),
			
			LEVEL_I_FIGHTER("LEVEL 1 FIGHTER"),
			LEVEL_II_FIGHTER("LEVEL 2 FIGHTER"),
			LEVEL_III_FIGHTER("LEVEL 3 FIGHTER"),
			LEVEL_IV_FIGHTER("LEVEL 4 FIGHTER"),
			LEVEL_V_FIGHTER("LEVEL 5 FIGHTER"),
			
			GAME_ADDICT("GAME ADDICT"),
			GAMBLING_ADDICT("GAMBLING ADDICT"),
			SHOPPING_ADDICT("SHOPPING ADDICT"),
			
			COPPER_RAVEN("COPPER RAVEN"),
			SILVER_RAVEN("SILVER RAVEN"),
			GOLD_RAVEN("GOLD RAVEN"),
			
			COPPER_WOLF("COPPER WOLF"),
			SILVER_WOLF("SILVER WOLF"),
			GOLD_WOLF("GOLD WOLF"),
			
			COPPER_LION("COPPER LION"),
			SILVER_LION("SILVER LION"),
			GOLD_LION("GOLD LION"),
			
			COPPER_SKULL("COPPER SKULL"),
			SILVER_SKULL("SILVER SKULL"),
			GOLD_SKULL("GOLD SKULL"),
			
			;

			private String badgeName;

			BADGES(String badgeName) {
				this.badgeName = badgeName;
			}

			public String getBadgeName() {
				return this.badgeName;
			}
		}
	}
	
	public static class HEAL {
		
		public enum POWER {
			
			LIGHT(0.25f), 
			SUPER(0.50f),
			ULTRA(0.75f);

			private float power;

			POWER(float power) {
				this.power = power;
			}

			public float getPower() {
				return this.power;
			}
			
		}
		
	}
	
	public static class POTIONS {

		public enum TYPES {

			SURVIVAL("Survival", COINS.COUNT.HUNDRED, HEAL.POWER.LIGHT, LEVELS.I), 
			RECOVERY("Recovery", COINS.COUNT.THOUSAND, HEAL.POWER.SUPER, LEVELS.II);


			private String potionName;
			private COINS.COUNT price;
			private HEAL.POWER healPower;
			private LEVELS minimumLevelNeeded;

			TYPES(String potionName, COINS.COUNT price, HEAL.POWER healPower, LEVELS minimumLevelNeeded) {
				this.potionName = potionName;
				this.price = price;
				this.healPower = healPower;
				this.minimumLevelNeeded = minimumLevelNeeded;
			}

			public String getPotionName() {
				return this.potionName;
			}

			public COINS.COUNT getPrice() {
				return this.price;
			}

			public HEAL.POWER getHealPower() {
				return this.healPower;
			}

			public LEVELS getMinimumLevelNeeded() {
				return this.minimumLevelNeeded;
			}

		}
	}
	
	public static class INSTA_HEALTH {

		public enum TYPES {

			QUDRA("Quadra", DIAMONDS.COUNT.ONE, HEAL.POWER.SUPER, LEVELS.I), 
			TEDRA("Tedra", DIAMONDS.COUNT.FIVE, HEAL.POWER.ULTRA, LEVELS.II);


			private String instaHealthName;
			private DIAMONDS.COUNT price;
			private HEAL.POWER healPower;
			private LEVELS minimumLevelNeeded;

			TYPES(String instaHealthName, DIAMONDS.COUNT price, HEAL.POWER healPower, LEVELS minimumLevelNeeded) {
				this.instaHealthName = instaHealthName;
				this.price = price;
				this.healPower = healPower;
				this.minimumLevelNeeded = minimumLevelNeeded;
			}

			public String getInstaHealthName() {
				return instaHealthName;
			}

			public DIAMONDS.COUNT getPrice() {
				return price;
			}

			public HEAL.POWER getHealPower() {
				return healPower;
			}

			public LEVELS getMinimumLevelNeeded() {
				return minimumLevelNeeded;
			}

		}
	}
}
