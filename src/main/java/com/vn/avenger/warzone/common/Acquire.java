package com.vn.avenger.warzone.common;

import com.vn.avenger.warzone.shop.ArsenalPO;

public interface Acquire<T extends ArsenalPO, E extends Enum<E>> {

	public E acquire(T t);

}
