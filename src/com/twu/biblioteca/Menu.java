package com.twu.biblioteca;

import java.util.ArrayList;

public class Menu {
	
	ArrayList<MenuOption> options;

	public Menu(ArrayList<MenuOption> options) {
		this.options = options;
	}
	
	public String toString() {
		String ret = "";
		for (MenuOption option : options) {
			ret += option.toString() + "\n";
		}
		return ret;
	}
	
}
