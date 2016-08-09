package myInterfaces;

import java.time.ZonedDateTime;

public interface AnotherTimeClient extends TimeClient {
	public ZonedDateTime getZonedDateTime(String zoneString);
}
