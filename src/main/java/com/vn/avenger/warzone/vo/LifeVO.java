package com.vn.avenger.warzone.vo;

import com.vn.avenger.warzone.common.constants.Enums.LIFE;

public class LifeVO implements ValueObject {

	private static final long serialVersionUID = -5636827482091284607L;

	private int maximumLifes;
	private int currentLifes;
	private int noOfTimesDied;

	public LifeVO() {
		this.maximumLifes = LIFE.DEFAULT_COUNT.LEVEL_1.getCount();
		this.currentLifes = LIFE.DEFAULT_COUNT.LEVEL_1.getCount();
		this.noOfTimesDied = 0;
	}

	public int getMaximumLifes() {
		return maximumLifes;
	}

	public LifeVO setMaximumLifes(int maximumLifes) {
		this.maximumLifes = maximumLifes;
		return this;
	}

	public int getCurrentLifes() {
		return currentLifes;
	}

	public LifeVO setCurrentLifes(int currentLifes) {
		this.currentLifes = currentLifes;
		return this;
	}

	public int getNoOfTimesDied() {
		return noOfTimesDied;
	}

	public LifeVO setNoOfTimesDied(int noOfTimesDied) {
		this.noOfTimesDied = noOfTimesDied;
		return this;
	}

	@Override
	public String toString() {
		return "LifeVO [maximumLifes=" + maximumLifes + ", currentLifes=" + currentLifes + ", noOfTimesDied="
				+ noOfTimesDied + "]";
	}

}
