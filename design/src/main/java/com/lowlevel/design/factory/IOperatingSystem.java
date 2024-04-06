package com.lowlevel.design.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IOperatingSystem implements OperatingSystem {

	@Override
	public void specs() {
		log.info("Apple operating system....");
	}

}
