package com.twu.biblioteca;

import java.util.ArrayList;

public abstract class RecordList<T> extends ArrayList<Record> {
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		for (Record record : this) {
			buffer.append(record.toString() + "\n");
		}
		return buffer.toString();
	}

}
