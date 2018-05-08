package com.vn.avenger.warzone.vo;

public class StatisticsVO implements ValueObject {

	private static final long serialVersionUID = -8465122675667029742L;

	// Battle statistics
	private int highestScore;
	private int totalWins;
	private int totalDefeats;
	private int timesQuit;

	// Coins statistic
	private int totalCoinsSpent;
	private int coinsSpentOnArsenal;
	private int coinsSpentOnGear;
	private int coinsSpentOnPotions;
	private int coinsSpentOnFirstAid;
	private int coinsSpentOnInstaHealth;
	private int coinsSpentOnFood;

	public StatisticsVO() {
		this.highestScore = 0;
		this.totalWins = 0;
		this.totalDefeats = 0;
		this.timesQuit = 0;

		this.totalCoinsSpent = 0;
		this.coinsSpentOnArsenal = 0;
		this.coinsSpentOnGear = 0;
		this.coinsSpentOnPotions = 0;
		this.coinsSpentOnFirstAid = 0;
		this.coinsSpentOnInstaHealth = 0;
		this.coinsSpentOnFood = 0;
	}

	public int getHighestScore() {
		return highestScore;
	}

	public StatisticsVO setHighestScore(int highestScore) {
		this.highestScore = highestScore;
		return this;
	}

	public int getTotalWins() {
		return totalWins;
	}

	public StatisticsVO setTotalWins(int totalWins) {
		this.totalWins = totalWins;
		return this;
	}

	public int getTotalDefeats() {
		return totalDefeats;
	}

	public StatisticsVO setTotalDefeats(int totalDefeats) {
		this.totalDefeats = totalDefeats;
		return this;
	}

	public int getTimesQuit() {
		return timesQuit;
	}

	public StatisticsVO setTimesQuit(int timesQuit) {
		this.timesQuit = timesQuit;
		return this;
	}

	public int getTotalCoinsSpent() {
		return totalCoinsSpent;
	}

	public StatisticsVO setTotalCoinsSpent(int totalCoinsSpent) {
		this.totalCoinsSpent = totalCoinsSpent;
		return this;
	}

	public int getCoinsSpentOnArsenal() {
		return coinsSpentOnArsenal;
	}

	public StatisticsVO setCoinsSpentOnArsenal(int coinsSpentOnArsenal) {
		this.coinsSpentOnArsenal = coinsSpentOnArsenal;
		return this;
	}

	public int getCoinsSpentOnGear() {
		return coinsSpentOnGear;
	}

	public StatisticsVO setCoinsSpentOnGear(int coinsSpentOnGear) {
		this.coinsSpentOnGear = coinsSpentOnGear;
		return this;
	}

	public int getCoinsSpentOnPotions() {
		return coinsSpentOnPotions;
	}

	public StatisticsVO setCoinsSpentOnPotions(int coinsSpentOnPotions) {
		this.coinsSpentOnPotions = coinsSpentOnPotions;
		return this;
	}

	public int getCoinsSpentOnFirstAid() {
		return coinsSpentOnFirstAid;
	}

	public StatisticsVO setCoinsSpentOnFirstAid(int coinsSpentOnFirstAid) {
		this.coinsSpentOnFirstAid = coinsSpentOnFirstAid;
		return this;
	}

	public int getCoinsSpentOnInstaHealth() {
		return coinsSpentOnInstaHealth;
	}

	public StatisticsVO setCoinsSpentOnInstaHealth(int coinsSpentOnInstaHealth) {
		this.coinsSpentOnInstaHealth = coinsSpentOnInstaHealth;
		return this;
	}

	public int getCoinsSpentOnFood() {
		return coinsSpentOnFood;
	}

	public StatisticsVO setCoinsSpentOnFood(int coinsSpentOnFood) {
		this.coinsSpentOnFood = coinsSpentOnFood;
		return this;
	}

	@Override
	public String toString() {
		return "StatisticsVO [highestScore=" + highestScore + ", totalWins=" + totalWins + ", totalDefeats="
				+ totalDefeats + ", timesQuit=" + timesQuit + ", totalCoinsSpent=" + totalCoinsSpent
				+ ", coinsSpentOnArsenal=" + coinsSpentOnArsenal + ", coinsSpentOnGear=" + coinsSpentOnGear
				+ ", coinsSpentOnPotions=" + coinsSpentOnPotions + ", coinsSpentOnFirstAid=" + coinsSpentOnFirstAid
				+ ", coinsSpentOnInstaHealth=" + coinsSpentOnInstaHealth + ", coinsSpentOnFood=" + coinsSpentOnFood
				+ "]";
	}

}
