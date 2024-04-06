package com.lowlevel.design.solid;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * A class should have only one reason to change ( This class create for only
 * one purpose for entity only)
 * 
 * @author rubin
 *
 */
@Data
@AllArgsConstructor
public class Single {

	private Long singleID;

	private String name;
}
