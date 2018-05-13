package com.vn.avenger.warzone.ui;

import java.util.Scanner;

import com.vn.avenger.warzone.common.Singleton;

public class InputReaderAW implements Singleton {

	private static InputReaderAW in = null;
	private Scanner scan = new Scanner(System.in);

	private InputReaderAW() {

	}

	public static InputReaderAW getInstance() {
		if (null == in) {
			synchronized (InputReaderAW.class) {
				if (null == in) {
					in = new InputReaderAW();
				}
			}
		}
		return in;
	}

	public int readInt() {
		while (!scan.hasNextInt()) {
			scan.nextLine();
		}
		return scan.nextInt();
	}

	public String read() {
		scan.reset();
		return scan.next();
	}

	public void pause() {
		scan.nextLine();
		scan.nextLine();

	}

	public boolean isNumber(String string) {
		if (string == null)
			return false;

		int length = string.length();

		if (length == 0)
			return false;

		int i = 0;

		if (string.charAt(0) == '-') {
			if (length == 1)
				return false;

			i = 1;
		}

		for (; i < length; i++) {
			char c = string.charAt(i);

			if (c <= '/' || c >= ':')
				return false;
		}
		return true;
	}
}
