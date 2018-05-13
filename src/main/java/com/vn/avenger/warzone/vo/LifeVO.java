package com.vn.avenger.warzone.vo;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

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

	@Override
	public String view() {

		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|           |A|v|e|n|g|e|r|  |W|a|r|z|o|n|e|           |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|                        Lifes                         |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|    Current lifes:    ").append(getCurrentLifes()).append(NEWLINE);
		screen.append("|    Maximum lifes:    ").append(getMaximumLifes()).append(NEWLINE);
		screen.append("|    No of time died:  ").append(getNoOfTimesDied()).append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|_______________________________________________________").append(NEWLINE);

		return screen.toString();
	}

}
