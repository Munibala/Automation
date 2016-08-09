package myInterfaces;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class TestHandler implements HandleInvalidTimeZoneClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ZonedDateTime z= HandleInvalidTimeZoneClient.class.getZonedDateTime("china");
		System.out.println();
	}

	
	@Override
	public void setTime(int hour, int minute, int second) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDate(int day, int month, int year) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDateAndTime(int day, int month, int year, int hour,
			int minute, int second) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LocalDateTime getLocalDateTime() {
		// TODO Auto-generated method stub
		return null;
	}

}
