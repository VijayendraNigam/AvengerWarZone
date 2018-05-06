package com.vn.avenger.warzone.common.constants;

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
}
