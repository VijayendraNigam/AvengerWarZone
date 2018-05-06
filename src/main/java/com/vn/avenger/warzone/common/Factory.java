package com.vn.avenger.warzone.common;

public interface Factory<T, E extends Enum<E>> {

	public T get(E e);
}
