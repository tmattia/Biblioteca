package com.twu.biblioteca;

public class ListRecordsAction implements Action {

	private Console console;
	private RecordList<?> recordList;

	public ListRecordsAction(Console console, RecordList<?> recordList) {
		this.console = console;
		this.recordList = recordList;
	}

	@Override
	public void execute() {
		console.println(recordList.toString());
	}

}
