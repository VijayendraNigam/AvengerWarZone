package com.vn.avenger.warzone.common;

/**
 * This is to enforce implementation of these methods in sub-classes.
 * This is to make sure we have Object created compatible with HashSet
 * or HashMap.
 * 
 * @author vijayendranigam
 *
 */
public abstract class CollectionAdaptor {

	public abstract boolean equals(Object object);

	public abstract int hashCode();

	public abstract String toString();

}
