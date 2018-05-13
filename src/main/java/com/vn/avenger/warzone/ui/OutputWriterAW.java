package com.vn.avenger.warzone.ui;

import com.vn.avenger.warzone.common.Helper;
import com.vn.avenger.warzone.common.Singleton;
import com.vn.avenger.warzone.screen.Window;

public class OutputWriterAW implements Singleton {

	private static OutputWriterAW out = null;

	private OutputWriterAW() {
	}

	public static OutputWriterAW getInstance() {
		if (null == out) {
			synchronized (OutputWriterAW.class) {
				if (null == out) {
					out = new OutputWriterAW();
				}
			}
		}
		return out;
	}

	public void print(Object object) {
		System.out.print(object);
	}

	public void println(Object object) {
		print(object + Helper.NEWLINE);
	}

	public void println(Window<String> window) {
		clearScreen();
		print(window.view() + Helper.NEWLINE);
	}

	public void println() {
		print(Helper.NEWLINE);
	}

	public void clearScreen() {
		for (int i = 0; i < Helper.SCREEN_LENGTH; i++) {
			println();
		}
	}

}
