package com.vn.avenger.warzone.vo;

import com.vn.avenger.warzone.common.constants.Enums.GAME;

public class SettingsVO implements ValueObject {

	private static final long serialVersionUID = -6841686481552034724L;

	private GAME.MODE gameMode;
	private boolean godMode;

	public SettingsVO() {
		this.gameMode = GAME.MODE.AMATEUR;
		this.godMode = false;
	}

	public GAME.MODE getGameMode() {
		return gameMode;
	}

	public void setGameMode(GAME.MODE gameMode) {
		this.gameMode = gameMode;
	}

	public boolean isGodMode() {
		return godMode;
	}

	public void setGodMode(boolean godMode) {
		this.godMode = godMode;
	}

	@Override
	public String toString() {
		return "SettingsVO [gameMode=" + gameMode + ", godMode=" + godMode + "]";
	}

}
