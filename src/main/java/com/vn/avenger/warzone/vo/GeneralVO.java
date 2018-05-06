package com.vn.avenger.warzone.vo;

import java.util.Date;

import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.XP;

public class GeneralVO implements ValueObject {

	private static final long serialVersionUID = -412404482015403430L;

	private LEVELS level;
	private String playerName;
	private int xp;
	private int xpNeeded;
	private Date loginDate;

	public GeneralVO() {
		this.level = LEVELS.I;
		this.loginDate = new Date();
		this.xp = 0;
		this.xpNeeded = XP.NEEDED.LEVEL_I.getPoints();
	}

	public LEVELS getLevel() {
		return level;
	}

	public GeneralVO setLevel(LEVELS level) {
		this.level = level;
		return this;
	}

	public String getPlayerName() {
		return playerName;
	}

	public GeneralVO setPlayerName(String playerName) {
		this.playerName = playerName;
		return this;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public GeneralVO setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
		return this;
	}

	public int getXp() {
		return xp;
	}

	public GeneralVO setXp(int xp) {
		this.xp = xp;
		return this;
	}

	public int getXpNeeded() {
		return xpNeeded;
	}

	public GeneralVO setXpNeeded(int xpNeeded) {
		this.xpNeeded = xpNeeded;
		return this;
	}

	@Override
	public String toString() {
		return "GeneralVO [level=" + level + ", playerName=" + playerName + ", xp=" + xp + ", xpNeeded=" + xpNeeded
				+ ", loginDate=" + loginDate + "]";
	}

}
