package com.vn.avenger.warzone.common;

import com.vn.avenger.warzone.cast.hero.Hero;
import com.vn.avenger.warzone.shop.PurchaseObject;

public interface Buy<T extends PurchaseObject, E extends Hero> {

	public E buy(T t);

}
