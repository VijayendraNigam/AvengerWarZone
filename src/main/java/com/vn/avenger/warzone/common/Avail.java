package com.vn.avenger.warzone.common;

import com.vn.avenger.warzone.shop.PurchaseObject;

public interface Avail<T extends PurchaseObject, E extends Enum<E>> {

	public E avail(T t);

}