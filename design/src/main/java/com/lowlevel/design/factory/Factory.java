package com.lowlevel.design.factory;

public class Factory {

	public static void main(String[] args) {
		OperatingSystem operatingSystem1 = OperationSystemFactory.getInstance("IOS");
		operatingSystem1.specs();
		OperatingSystem operatingSystem2 = OperationSystemFactory.getInstance("Windows");
		operatingSystem2.specs();
		OperatingSystem operatingSystem3 = OperationSystemFactory.getInstance("an");
		operatingSystem3.specs();
	}

}
