package com.lowlevel.design.structual.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ModernPen {

	public void writeImplementation(String assignment) {
		log.info("Write {} assignment for other class", assignment);
	}
}
