package com.vn.avenger.warzone.common;

import com.vn.avenger.warzone.cast.combatant.Combatant;

public interface Use<T extends Combatant, E extends Enum<E>> {

	public E use(T t);
}
