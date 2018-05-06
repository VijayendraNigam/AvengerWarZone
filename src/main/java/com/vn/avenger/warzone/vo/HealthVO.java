package com.vn.avenger.warzone.vo;

import com.vn.avenger.warzone.common.constants.Enums.HEALTH;

public class HealthVO implements ValueObject {

	private static final long serialVersionUID = -6020379274362386853L;

	private int maximumHealth;
	private int currentHealth;
	private boolean isAlive;

	public HealthVO() {
		this.maximumHealth = HEALTH.MAXIMUM_RANGE.LEVEL_I.getHealth();
		this.currentHealth = HEALTH.MAXIMUM_RANGE.LEVEL_I.getHealth();
		this.isAlive = HEALTH.STATUS.ALIVE.getStatus();
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

	@Override
	public String toString() {
		return "HealthVO [maximumHealth=" + maximumHealth + ", currentHealth=" + currentHealth + ", isAlive=" + isAlive
				+ "]";
	}

}
