package com.vn.avenger.warzone.vo;

import static com.vn.avenger.warzone.common.Helper.NEWLINE;

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

	@Override
	public String view() {

		StringBuilder screen = new StringBuilder();

		screen.append("_______________________________________________________").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|           |A|v|e|n|g|e|r|  |W|a|r|z|o|n|e|           |").append(NEWLINE);
		screen.append("|           +-+-+-+-+-+-+-+  +-+-+-+-+-+-+-+           |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|                       Settings                       |").append(NEWLINE);
		screen.append("|                                                      |").append(NEWLINE);
		screen.append("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|").append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|    Game mode:   ").append(getGameMode().getMode()).append(NEWLINE);
		screen.append("|    God mode:    ").append(isGodMode()).append(NEWLINE);
		screen.append("|                                                       ").append(NEWLINE);
		screen.append("|_______________________________________________________").append(NEWLINE);

		return screen.toString();
	}

}
