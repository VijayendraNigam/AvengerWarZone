package com.vn.avenger.warzone.cast.combatant;

import java.io.Serializable;

import com.vn.avenger.warzone.vo.AchievementsVO;
import com.vn.avenger.warzone.vo.CoinsVO;
import com.vn.avenger.warzone.vo.EquippedVO;
import com.vn.avenger.warzone.vo.GeneralVO;
import com.vn.avenger.warzone.vo.HealthVO;
import com.vn.avenger.warzone.vo.LifeVO;
import com.vn.avenger.warzone.vo.SettingsVO;
import com.vn.avenger.warzone.vo.StatisticsVO;

public class CombatantStats implements Serializable {

	private static final long serialVersionUID = -8841953071837375503L;

	private GeneralVO general;
	private HealthVO health;
	private LifeVO life;
	private CoinsVO coins;
	private SettingsVO settings;
	private StatisticsVO statistics;
	private EquippedVO equipped;
	private AchievementsVO achievements;

	public CombatantStats() {
		this.general = new GeneralVO();
		this.health = new HealthVO();
		this.life = new LifeVO();
		this.coins = new CoinsVO();
		this.settings = new SettingsVO();
		this.statistics = new StatisticsVO();
		this.equipped = new EquippedVO();
		this.achievements = new AchievementsVO();
	}

	public CombatantStats(GeneralVO general, HealthVO health, LifeVO life, CoinsVO coins, SettingsVO settings,
			StatisticsVO statistics, EquippedVO equipped, AchievementsVO achievements) {
		this.general = general;
		this.health = health;
		this.life = life;
		this.coins = coins;
		this.settings = settings;
		this.statistics = statistics;
		this.equipped = equipped;
		this.achievements = achievements;
	}

	public GeneralVO getGeneral() {
		return general;
	}

	public CombatantStats setGeneral(GeneralVO general) {
		this.general = general;
		return this;
	}

	public HealthVO getHealth() {
		return health;
	}

	public CombatantStats setHealth(HealthVO health) {
		this.health = health;
		return this;
	}

	public LifeVO getLife() {
		return life;
	}

	public CombatantStats setLife(LifeVO life) {
		this.life = life;
		return this;
	}

	public CoinsVO getCoins() {
		return coins;
	}

	public CombatantStats setCoins(CoinsVO coins) {
		this.coins = coins;
		return this;
	}

	public SettingsVO getSettings() {
		return settings;
	}

	public CombatantStats setSettings(SettingsVO settings) {
		this.settings = settings;
		return this;
	}

	public StatisticsVO getStatistics() {
		return statistics;
	}

	public CombatantStats setStatistics(StatisticsVO statistics) {
		this.statistics = statistics;
		return this;
	}

	public EquippedVO getEquipped() {
		return equipped;
	}

	public CombatantStats setEquipped(EquippedVO equipped) {
		this.equipped = equipped;
		return this;
	}

	public AchievementsVO getAchievements() {
		return achievements;
	}

	public CombatantStats setAchievements(AchievementsVO achievements) {
		this.achievements = achievements;
		return this;
	}

	@Override
	public String toString() {
		return "CombatantStats [general=" + general + ", health=" + health + ", life=" + life + ", coins=" + coins
				+ ", settings=" + settings + ", statistics=" + statistics + ", equipped=" + equipped + ", achievements="
				+ achievements + "]";
	}

}