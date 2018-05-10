package com.vn.avenger.warzone.common;

import com.vn.avenger.warzone.shop.PurchaseObject;

public interface Buy<T extends PurchaseObject, E extends Enum<E>> {

	public E buy(T t);

}
