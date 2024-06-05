package com.lowlevel.design.interpreter;

import java.util.HashMap;

public class Context {

	HashMap<String, Integer> contextMap = new HashMap<>();

	void putContextValue(String key, Integer value) {
		contextMap.put(key, value);
	}

	int getContextValue(String key) {
		return (int) contextMap.get(key);
	}
}
