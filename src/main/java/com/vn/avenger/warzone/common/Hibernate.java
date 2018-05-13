package com.vn.avenger.warzone.common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public interface Hibernate<T> {

	default boolean save(String fileName) {

		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(this);

			oos.close();
			fos.close();

			return true;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	default T resurrect(String fileName) {

		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);

			@SuppressWarnings("unchecked")
			T t = (T) ois.readObject();

			ois.close();
			fis.close();

			return t;

		} catch (IOException | ClassNotFoundException e) {
			//e.printStackTrace();
		}
		return null;
	}

}
