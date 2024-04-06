package com.lowlevel.design.factory;

public class OperationSystemFactory {

	public static OperatingSystem getInstance(String type) {

		if (type.equalsIgnoreCase("IOS"))
			return new IOperatingSystem();

		else if (type.equalsIgnoreCase("Windows"))
			return new WindowsOperatingSystem();

		return new AndroidOperatingSystem();
	}
}
