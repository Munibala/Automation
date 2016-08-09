package lambda;

import java.time.LocalDate;

public class Person {

	public enum Sex{
		MALE,FEMALE
	}
	Sex gender;
	String name;
	LocalDate birthday;
	String emailAddress;
	
	public int getAge() {
		return 0;
        // ...
    }

    public void printPerson() {
        // ...
    }
}
