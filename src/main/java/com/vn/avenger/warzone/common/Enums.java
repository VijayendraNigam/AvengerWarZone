package com.vn.avenger.warzone.common;

public class Enums {

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

}
