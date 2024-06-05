package com.lowlevel.design.singleton;

/**
 * This lazy singleton will fail in multi threading
 * 
 * @author rubin
 *
 */
public class Lazy {
	private static Lazy lazy;

	private Lazy() {

	}

	public static Lazy getInstance() {
		if (lazy == null)
			lazy = new Lazy();
		return lazy;
	}

	/**
	 * This is for synchronized way of creating singleton object
	 * 
	 * @return
	 */
	public synchronized static Lazy getSynchonizedInstance() {
		if (lazy == null)
			lazy = new Lazy();
		return lazy;
	}

	/**
	 * This is for double checked locking way of singleton This one is using in the
	 * industry
	 * 
	 * @return
	 */
	public static Lazy getDoubleLockInstance() {
		if (lazy == null)
			synchronized (Lazy.class) {
				if (lazy == null)
					lazy = new Lazy();
			}
		return lazy;
	}
}
