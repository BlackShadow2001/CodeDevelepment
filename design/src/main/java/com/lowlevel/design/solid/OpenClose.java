package com.lowlevel.design.solid;

/**
 * Open for extension but closed for modification Best example JPA, R2DBC
 * repositories
 * 
 * @author rubin
 *
 */
public interface OpenClose {

	public void save();
}
