package myInterfaces;

public class TestSimpleTimeClient {

	public static void main(String... args) {
		SimpleTimeClient myTimeClient = new SimpleTimeClient();
        System.out.println("Current time: " + myTimeClient.toString());
        System.out.println("Time in California: " +
        myTimeClient.getZonedDateTime("Blah blah").toString());
        
        System.out.println(".............................................");
        
        TimeClient myTimeClient1 = new SimpleTimeClient();
        System.out.println("Current time: " + myTimeClient1.toString());
        System.out.println("Time in California: " +
        myTimeClient1.getZonedDateTime("Blah blah").toString());
	}

}
