package com.vn.avenger.warzone.ui;

public class Gui {

	public static InputReaderAW in = null;
	public static OutputWriterAW out = null;

	static {
		in = InputReaderAW.getInstance();
		out = OutputWriterAW.getInstance();
	}

	private Gui() {
	}

}
