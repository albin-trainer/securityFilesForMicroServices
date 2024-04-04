package com.cg;

import java.util.*;

public class Data {
	private Map<String, String> slots =new HashMap<>();

	public Map<String, String> getSlots() {
		return slots;
	}

	public void setSlots(Map<String, String> slots) {
		this.slots = slots;
	}

	@Override
	public String toString() {
		return "Data [slots=" + slots + "]";
	}

}
