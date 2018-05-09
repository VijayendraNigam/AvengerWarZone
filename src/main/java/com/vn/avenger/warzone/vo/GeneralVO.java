package com.vn.avenger.warzone.vo;

import java.util.Date;

import com.vn.avenger.warzone.common.constants.Enums.GENERAL.LEVELS;
import com.vn.avenger.warzone.common.constants.Enums.XP;

public class GeneralVO implements ValueObject {

	private static final long serialVersionUID = -412404482015403430L;

	private int xp;
	private LEVELS level;
	private int xpNeeded;
	private String playerName;
	private Date lastLoginDate;
	private Date accountCreatedOn;

	public GeneralVO() {
		this.xp = 0;
		this.level = LEVELS.LEVEL_1;
		this.lastLoginDate = new Date();
		this.xpNeeded = XP.NEEDED.LEVEL_1.getPoints();
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

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public GeneralVO setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
		return this;
	}

	public Date getAccountCreatedOn() {
		return accountCreatedOn;
	}

	public GeneralVO setAccountCreatedOn(Date accountCreatedOn) {
		this.accountCreatedOn = accountCreatedOn;
		return this;
	}

	@Override
	public String toString() {
		return "GeneralVO [xp=" + xp + ", level=" + level + ", xpNeeded=" + xpNeeded + ", playerName=" + playerName
				+ ", lastLoginDate=" + lastLoginDate + ", accountCreatedOn=" + accountCreatedOn + "]";
	}

}
