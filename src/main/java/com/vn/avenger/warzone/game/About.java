package com.vn.avenger.warzone.game;

import static com.vn.avenger.warzone.common.Helper.SCREEN_FACTORY;

import com.vn.avenger.warzone.common.constants.Enums.SCREENS;
import com.vn.avenger.warzone.ui.Gui;

public class About {

	private About() {

	}

	public static void view() {
		Gui.out.println(SCREEN_FACTORY.get(SCREENS.TYPES.ABOUT));
		Gui.in.pause();
	}

}
