package com.vn.avenger.warzone.vo;

import com.vn.avenger.warzone.common.constants.Enums.HEALTH_VO;

public class HealthVO implements ValueObject {

	private static final long serialVersionUID = -6020379274362386853L;

	private int maximumHealth;
	private int currentHealth;
	private int maximumStrength;
	private int currentStrength;
	private int maximumStamina;
	private int currentStamina;
	private boolean isAlive;

	public HealthVO() {
		this.maximumHealth = HEALTH_VO.HEALTH.LEVEL_1.getHealth();
		this.currentHealth = HEALTH_VO.HEALTH.LEVEL_1.getHealth();
		this.maximumStrength = HEALTH_VO.STRENGTH.LEVEL_1.getStrength();
		this.currentStrength = HEALTH_VO.STRENGTH.LEVEL_1.getStrength();
		this.maximumStamina = HEALTH_VO.STAMINA.LEVEL_1.getStamina();
		this.currentStamina = HEALTH_VO.STAMINA.LEVEL_1.getStamina();
		this.isAlive = HEALTH_VO.STATUS.ALIVE.getStatus();
	}

	public int getMaximumHealth() {
		return maximumHealth;
	}

	public HealthVO setMaximumHealth(int maximumHealth) {
		this.maximumHealth = maximumHealth;
		return this;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public HealthVO setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
		return this;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public HealthVO setAlive(boolean isAlive) {
		this.isAlive = isAlive;
		return this;
	}

	public int getMaximumStrength() {
		return maximumStrength;
	}

	public HealthVO setMaximumStrength(int maximumStrength) {
		this.maximumStrength = maximumStrength;
		return this;
	}

	public int getCurrentStrength() {
		return currentStrength;
	}

	public HealthVO setCurrentStrength(int currentStrength) {
		this.currentStrength = currentStrength;
		return this;
	}

	public int getMaximumStamina() {
		return maximumStamina;
	}

	public HealthVO setMaximumStamina(int maximumStamina) {
		this.maximumStamina = maximumStamina;
		return this;
	}

	public int getCurrentStamina() {
		return currentStamina;
	}

	public HealthVO setCurrentStamina(int currentStamina) {
		this.currentStamina = currentStamina;
		return this;
	}

}
