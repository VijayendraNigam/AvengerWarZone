package com.vn.avenger.warzone.common;

/**
 * This is to prevent using new operator. It's an alternative to
 * @Autowired implementation.
 * 
 * @author vijayendranigam
 *
 * @param <T>
 */
public interface IoC<T> {

	public T inject();
}
