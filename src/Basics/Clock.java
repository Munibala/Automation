package Basics;

public class Clock {
	private long time = 0;

	Clock(){
		time = 0;
	}
    private Clock(long time) {
        this.time = time;
    }

    public Clock(long time, long timeOffset) {
        this(time);
        this.time += timeOffset;
    }

    public static Clock newClock() {
        return new Clock(System.currentTimeMillis());
    }
    
    public static void main (String[] args){
    	Clock cl= new Clock(1010);
    	System.out.println(cl.time);
    }
}
