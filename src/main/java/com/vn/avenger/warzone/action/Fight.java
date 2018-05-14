package com.vn.avenger.warzone.action;

import com.vn.avenger.warzone.cast.combatant.Combatant;

/**
 * This involve the fighting of 2 combatants.
 * 
 * @author vijayendranigam
 *
 * @param <T> Attacker
 * @param <E> AttackedOn
 */
public interface Fight<T extends Combatant, E extends Combatant> {

	public T doAttack(E atttackedOn);

}
