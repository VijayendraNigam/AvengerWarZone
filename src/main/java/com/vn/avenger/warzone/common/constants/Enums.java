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

	public static class HEALTH_VO {

		public enum HEALTH {

			LEVEL_I(100), 
			LEVEL_II(200), 
			LEVEL_III(500), 
			LEVEL_IV(1000), 
			LEVEL_V(1000000);

			private int health;

			HEALTH(int health) {
				this.health = health;
			}

			public int getHealth() {
				return this.health;
			}
		}
		
		public enum STRENGTH {

			LEVEL_I(100), 
			LEVEL_II(200), 
			LEVEL_III(500), 
			LEVEL_IV(1000), 
			LEVEL_V(1000000);

			private int strength;

			STRENGTH(int strength) {
				this.strength = strength;
			}

			public int getStrength() {
				return this.strength;
			}
		}
		
		public enum STAMINA {

			LEVEL_I(100), 
			LEVEL_II(200), 
			LEVEL_III(500), 
			LEVEL_IV(1000), 
			LEVEL_V(1000000);

			private int stamina;

			STAMINA(int stamina) {
				this.stamina = stamina;
			}

			public int getStamina() {
				return this.stamina;
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

		public enum DEFAULT_COUNT {

			LEVEL_I(1), 
			LEVEL_II(2), 
			LEVEL_III(3), 
			LEVEL_IV(10), 
			LEVEL_V(20);
			
			private int count;

			DEFAULT_COUNT(int count) {
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
			TEN_THOUSAND(10000),
			MILLION(1000000),
			TRILLION(1000000000);

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
		
		public enum ENERGY {
			HEALTH,
			STRENGTH,
			STAMINA,
			ALL;
		}
		
		public enum RESTORE {
			
			TINY(0.10f),
			LIGHT(0.25f), 
			SUPER(0.50f),
			ULTRA(0.75f);

			private float power;

			RESTORE(float power) {
				this.power = power;
			}

			public float getPower() {
				return this.power;
			}
		}
		
	}
	
	public static class POTIONS {

		public enum TYPES {

			SURVIVAL("Survival", COINS.COUNT.HUNDRED, HEAL.RESTORE.LIGHT, LEVELS.I), 
			RECOVERY("Recovery", COINS.COUNT.THOUSAND, HEAL.RESTORE.SUPER, LEVELS.II);


			private String potionName;
			private COINS.COUNT price;
			private HEAL.RESTORE healPower;
			private LEVELS minimumLevelNeeded;

			TYPES(String potionName, COINS.COUNT price, HEAL.RESTORE healPower, LEVELS minimumLevelNeeded) {
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

			public HEAL.RESTORE getHealPower() {
				return this.healPower;
			}

			public LEVELS getMinimumLevelNeeded() {
				return this.minimumLevelNeeded;
			}

		}
	}
	
	public static class INSTA_HEALTH {

		public enum TYPES {

			QUDRA("Quadra", DIAMONDS.COUNT.ONE, HEAL.RESTORE.SUPER, LEVELS.I), 
			TEDRA("Tedra", DIAMONDS.COUNT.FIVE, HEAL.RESTORE.ULTRA, LEVELS.II);


			private String instaHealthName;
			private DIAMONDS.COUNT price;
			private HEAL.RESTORE healPower;
			private LEVELS minimumLevelNeeded;

			TYPES(String instaHealthName, DIAMONDS.COUNT price, HEAL.RESTORE healPower, LEVELS minimumLevelNeeded) {
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

			public HEAL.RESTORE getHealPower() {
				return healPower;
			}

			public LEVELS getMinimumLevelNeeded() {
				return minimumLevelNeeded;
			}

		}
	}
	
	public static class FIRST_AID {

		public enum TYPES {

			CLASSIC("Classic", COINS.COUNT.TEN, HEAL.RESTORE.TINY, LEVELS.I);


			private String firstAidName;
			private COINS.COUNT price;
			private HEAL.RESTORE healPower;
			private LEVELS minimumLevelNeeded;

			TYPES(String firstAidName, COINS.COUNT price, HEAL.RESTORE healPower, LEVELS minimumLevelNeeded) {
				this.firstAidName = firstAidName;
				this.price = price;
				this.healPower = healPower;
				this.minimumLevelNeeded = minimumLevelNeeded;
			}

			public String getFirstAidName() {
				return this.firstAidName;
			}

			public COINS.COUNT getPrice() {
				return this.price;
			}

			public HEAL.RESTORE getHealPower() {
				return this.healPower;
			}

			public LEVELS getMinimumLevelNeeded() {
				return this.minimumLevelNeeded;
			}

		}
	}
	
	public static class FOOD {

		public enum TYPES {

			SANDWICH("Burger King Whooper Sandwich", COINS.COUNT.TEN, HEAL.RESTORE.TINY, LEVELS.I),
			CHEESE_BURGER("Five Guys Cheese Burger", COINS.COUNT.TEN, HEAL.RESTORE.TINY, LEVELS.I),
			LIMEADE("Sonic Cherry Limeade", COINS.COUNT.TEN, HEAL.RESTORE.TINY, LEVELS.I),
			SLIDERS("White Castle Slider", COINS.COUNT.HUNDRED, HEAL.RESTORE.LIGHT, LEVELS.II),
			BURRITO("Taco Bell Burrito Supreme", COINS.COUNT.HUNDRED, HEAL.RESTORE.LIGHT, LEVELS.II),
			TACO("Taco Bell Chalupa Supreme", COINS.COUNT.THOUSAND, HEAL.RESTORE.SUPER, LEVELS.III),
			PIZZA("Domino Pepperoni Pizza", COINS.COUNT.THOUSAND, HEAL.RESTORE.SUPER, LEVELS.III),
			PASTA("Panera Tortellini Alfredo", COINS.COUNT.TEN_THOUSAND, HEAL.RESTORE.ULTRA, LEVELS.V);


			private String foodName;
			private COINS.COUNT price;
			private HEAL.RESTORE healPower;
			private LEVELS minimumLevelNeeded;

			TYPES(String foodName, COINS.COUNT price, HEAL.RESTORE healPower, LEVELS minimumLevelNeeded) {
				this.foodName = foodName;
				this.price = price;
				this.healPower = healPower;
				this.minimumLevelNeeded = minimumLevelNeeded;
			}

			public String getFoodName() {
				return this.foodName;
			}

			public COINS.COUNT getPrice() {
				return this.price;
			}

			public HEAL.RESTORE getHealPower() {
				return this.healPower;
			}

			public LEVELS getMinimumLevelNeeded() {
				return this.minimumLevelNeeded;
			}

		}
	}
}
