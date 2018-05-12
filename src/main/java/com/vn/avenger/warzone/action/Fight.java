package com.vn.avenger.warzone.action;

import com.vn.avenger.warzone.cast.combatant.Combatant;

public interface Fight<T extends Combatant, E extends Combatant> {

	public T doAttack(E atttackedOn);

}
