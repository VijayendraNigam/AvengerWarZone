
package com.vn.avenger.warzone.game.info;

import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.ui.Gui;

public class XPInfo {

	private XPInfo() {

	}

	public static void info() {

		Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.XP_INFO));
		Gui.in.pause();
	}
}
