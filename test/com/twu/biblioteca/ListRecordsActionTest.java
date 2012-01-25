package com.twu.biblioteca;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class ListRecordsActionTest {
	
	@Test
	public void shouldListBooks() {
		final String FAKE_RECORD_LIST = "Fake record list";
		
		Console mockedConsole = mock(Console.class);
		RecordList<?> mockedRecordList = mock(RecordList.class);
		when(mockedRecordList.toString()).thenReturn(FAKE_RECORD_LIST);
		
		ListRecordsAction listBooksAction = new ListRecordsAction(mockedConsole, mockedRecordList);
		listBooksAction.execute();

		verify(mockedConsole).println(FAKE_RECORD_LIST);
	}

}
