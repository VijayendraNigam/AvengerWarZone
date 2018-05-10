package com.vn.avenger.warzone.common.constants;

import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;

public class Enums {

	public static class COMBATANT {

		public enum HERO {

			THOR("Thor"), 
			CAPTAIN_AMERICA("Captain America");

			private String heroName;

			HERO(String heroName) {
				this.heroName = heroName;
			}

			public String getHeroName() {
				return this.heroName;
			}
		}

		public enum MONSTER {

			LOKI("Loki"), 
			RED_SKULL("Red Skull");

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

			LEVEL_1(100), 
			LEVEL_2(200), 
			LEVEL_3(500), 
			LEVEL_4(1000), 
			LEVEL_5(100000);

			private int health;

			HEALTH(int health) {
				this.health = health;
			}

			public int getHealth() {
				return this.health;
			}
		}
		
		public enum STRENGTH {

			LEVEL_1(100), 
			LEVEL_2(200), 
			LEVEL_3(500), 
			LEVEL_4(1000), 
			LEVEL_5(100000);

			private int strength;

			STRENGTH(int strength) {
				this.strength = strength;
			}

			public int getStrength() {
				return this.strength;
			}
		}
		
		public enum STAMINA {

			LEVEL_1(100), 
			LEVEL_2(200), 
			LEVEL_3(500), 
			LEVEL_4(1000), 
			LEVEL_5(100000);

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

			LEVEL_1(1), 
			LEVEL_2(2), 
			LEVEL_3(3), 
			LEVEL_4(4), 
			LEVEL_5(5);

			private int value;

			LEVELS(int value) {
				this.value = value;
			}

			public int getValue() {
				return this.value;
			}

		}
	}
	
	public static class LIFE {

		public enum DEFAULT_COUNT {

			LEVEL_1(1), 
			LEVEL_2(2), 
			LEVEL_3(3), 
			LEVEL_4(10), 
			LEVEL_5(20);
			
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

			LEVEL_1(100), 
			LEVEL_2(200), 
			LEVEL_3(1000), 
			LEVEL_4(25000), 
			LEVEL_5(100000);

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

			LEVEL_1(100), 
			LEVEL_2(200), 
			LEVEL_3(1000), 
			LEVEL_4(25000), 
			LEVEL_5(100000);

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

			private int coins;

			COUNT(int coins) {
				this.coins = coins;
			}

			public int getCoins() {
				return this.coins;
			}
		}
	}
	
	public static class DIAMONDS {
		
		public enum CREDIT {

			LEVEL_1(1), 
			LEVEL_2(2), 
			LEVEL_3(5), 
			LEVEL_4(20), 
			LEVEL_5(100);

			private int diamonds;

			CREDIT(int diamonds) {
				this.diamonds = diamonds;
			}

			public int getDiamonds() {
				return this.diamonds;
			}
		}

		public enum COUNT {

			ZERO(0),
			ONE(1), 
			FIVE(5), 
			TEN(10), 
			HUNDRED(100),
			THOUSAND(1000);

			private int diamonds;

			COUNT(int diamonds) {
				this.diamonds = diamonds;
			}

			public int getDiamonds() {
				return this.diamonds;
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

			EVERYONE_SUCKS("EVERYONE SUCKS", "Die"),
			FIRST_WIN("FIRST WIN", "Kill one monster"),
			
			THREE_IN_A_ROW("3 IN A ROW", "Kill 3 monsters in 1 streak"),
			FIVE_IN_A_ROW("5 IN A ROW", "Kill 5 monsters in 1 streak"),
			SEVEN_IN_A_ROW("7 IN A ROW", "Kill 7 monsters in 1 streak"),
			
			LEVEL_2_FIGHTER("LEVEL 2 FIGHTER", "Reach Level 2"),
			LEVEL_3_FIGHTER("LEVEL 3 FIGHTER", "Reach Level 3"),
			LEVEL_4_FIGHTER("LEVEL 4 FIGHTER", "Reach Level 4"),
			LEVEL_5_FIGHTER("LEVEL 5 FIGHTER", "Reach Level 5"),
			
			GAME_ADDICT("GAME ADDICT", "Play game more than 10 times in a day"),
			GAMBLING_ADDICT("GAMBLING ADDICT", "Gamble more than 20 times"),
			SHOPPING_ADDICT("SHOPPING ADDICT", "Purchase items worth 10000 coins"),
			POWER_ADDICT("POWER ADDICT", "Use 5 POWERS in a game"),
			MONEY_MAKER("MONEY MAKER", "Win 5000 coins in gambling"),
			
			AVENGER_WARZONE_MASTER("AVENGER WARZONE MASTER", "Unlock all achievements")
			
			;

			private String badgeName;
			private String description;

			BADGES(String badgeName, String description) {
				this.badgeName = badgeName;
				this.description = description;
			}

			public String getBadgeName() {
				return this.badgeName;
			}
			
			public String getDescription() {
				return this.description;
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
	
	public static class DAMAGE {
		
		public enum INJURE {
			
			TINY(0.10f),
			LIGHT(0.25f), 
			SUPER(0.50f),
			ULTRA(0.75f);

			private float injury;

			INJURE(float injury) {
				this.injury = injury;
			}

			public float getInjury() {
				return this.injury;
			}
		}
	}
	
	
	public static class POTIONS {

		public enum TYPES {

			SURVIVAL("Survival", COINS.COUNT.TEN, HEAL.RESTORE.LIGHT, LEVELS.LEVEL_1), 
			RECOVERY("Recovery", COINS.COUNT.THOUSAND, HEAL.RESTORE.SUPER, LEVELS.LEVEL_2);


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

			QUADRA("Quadra", COINS.COUNT.HUNDRED, HEAL.RESTORE.SUPER, LEVELS.LEVEL_1), 
			TEDRA("Tedra", COINS.COUNT.THOUSAND, HEAL.RESTORE.ULTRA, LEVELS.LEVEL_2);


			private String instaHealthName;
			private COINS.COUNT price;
			private HEAL.RESTORE healPower;
			private LEVELS minimumLevelNeeded;

			TYPES(String instaHealthName, COINS.COUNT price, HEAL.RESTORE healPower, LEVELS minimumLevelNeeded) {
				this.instaHealthName = instaHealthName;
				this.price = price;
				this.healPower = healPower;
				this.minimumLevelNeeded = minimumLevelNeeded;
			}

			public String getInstaHealthName() {
				return instaHealthName;
			}

			public COINS.COUNT getPrice() {
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

			CLASSIC("Classic", COINS.COUNT.TEN, HEAL.RESTORE.TINY, LEVELS.LEVEL_1);


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

			SANDWICH("Burger King Whooper Sandwich", COINS.COUNT.TEN, HEAL.RESTORE.TINY, LEVELS.LEVEL_1),
			CHEESE_BURGER("Five Guys Cheese Burger", COINS.COUNT.TEN, HEAL.RESTORE.TINY, LEVELS.LEVEL_1),
			LIMEADE("Sonic Cherry Limeade", COINS.COUNT.TEN, HEAL.RESTORE.TINY, LEVELS.LEVEL_1),
			SLIDERS("White Castle Slider", COINS.COUNT.HUNDRED, HEAL.RESTORE.LIGHT, LEVELS.LEVEL_2),
			BURRITO("Taco Bell Burrito Supreme", COINS.COUNT.HUNDRED, HEAL.RESTORE.LIGHT, LEVELS.LEVEL_2),
			TACO("Taco Bell Chalupa Supreme", COINS.COUNT.THOUSAND, HEAL.RESTORE.SUPER, LEVELS.LEVEL_3),
			PIZZA("Domino Pepperoni Pizza", COINS.COUNT.THOUSAND, HEAL.RESTORE.SUPER, LEVELS.LEVEL_3),
			PASTA("Panera Tortellini Alfredo", COINS.COUNT.TEN_THOUSAND, HEAL.RESTORE.ULTRA, LEVELS.LEVEL_5);


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
	
	
	public static class ARSENAL {

		public enum TYPES {

			FISTS("Fists", COINS.COUNT.TEN, DAMAGE.INJURE.TINY, LEVELS.LEVEL_1),
			KNIFE("Ka-Bar Knife", COINS.COUNT.TEN, DAMAGE.INJURE.TINY, LEVELS.LEVEL_1),
			HAMMER("Giant Hammer", COINS.COUNT.TEN, DAMAGE.INJURE.TINY, LEVELS.LEVEL_1),
			CHAINSAW("Chipper Teeth Chainsaw", COINS.COUNT.HUNDRED, DAMAGE.INJURE.LIGHT, LEVELS.LEVEL_2),
			PISTOL("Desert Eagle Pistol", COINS.COUNT.HUNDRED, DAMAGE.INJURE.LIGHT, LEVELS.LEVEL_2),
			SHOT_GUN("M26 Mass Shotgun", COINS.COUNT.THOUSAND, DAMAGE.INJURE.SUPER, LEVELS.LEVEL_3),
			SNIPER_RIFLE("Dragunov SVC Sniper Rifle", COINS.COUNT.THOUSAND, DAMAGE.INJURE.SUPER, LEVELS.LEVEL_3),
			ASSAULT_RIFLE("Bushmaster ACR Assualt Rifle", COINS.COUNT.TEN_THOUSAND, DAMAGE.INJURE.ULTRA, LEVELS.LEVEL_5);


			private String arsenalName;
			private COINS.COUNT price;
			private DAMAGE.INJURE injurePower;
			private LEVELS minimumLevelNeeded;

			TYPES(String arsenalName, COINS.COUNT price, DAMAGE.INJURE injurePower, LEVELS minimumLevelNeeded) {
				this.arsenalName = arsenalName;
				this.price = price;
				this.injurePower = injurePower;
				this.minimumLevelNeeded = minimumLevelNeeded;
			}

			public String getArsenalName() {
				return arsenalName;
			}

			public COINS.COUNT getPrice() {
				return price;
			}

			public DAMAGE.INJURE getInjurePower() {
				return injurePower;
			}

			public LEVELS getMinimumLevelNeeded() {
				return minimumLevelNeeded;
			}

		}
	}
	
	public static class ABSTRACT_FACTORY {
		
		public enum FACTORY {
			
			HERO,
			MONSTER,
			
			ARSENAL,
			GEAR,
			POTION,
			FIRST_AID,
			INSTA_HEALTH,
			
			FOOD;
			
		}
		
	}
}
