package com.vn.avenger.warzone.game;

import com.vn.avenger.warzone.ui.Gui;

public class Exit {

	private Exit() {

	}

	public static void goodbye() {
		Gui.out.clearScreen();
		Gui.out.println("Avenger WarZone");
		Gui.out.println("Exit...");
	}
}
