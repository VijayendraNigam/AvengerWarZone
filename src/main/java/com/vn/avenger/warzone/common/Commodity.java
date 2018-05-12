package com.vn.avenger.warzone.common;

public interface Commodity<T> {

	public void stock(T t);

	public void consume(T t);

}
