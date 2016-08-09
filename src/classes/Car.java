package classes;

public class Car {

	private String color;
	private double speed;
	private final int Maxgear=5;
	private String brand;
	private int  curGear=0;
	 
	
	Car(){
		//if ((this==null) ||(this.brand==null && this.color==null))
			//System.out.println("Object is not initialized.");
			
	}
	
	Car(String brand, String color){
		this.brand=brand;
		setColor(color);
	}
	void setColor(String color){
		this.color=color;
	}
	
	void setSpeed (double speed){
		this.speed=speed;
	}
	
	void display(){
		System.out.println("Car details.........................................");
		System.out.println("Brand: "+this.brand);
		System.out.println("Color: "+this.color);
		System.out.println("Current speed: "+this.speed);
		System.out.println("Current gear: "+this.curGear);
		System.out.println(".............................................................");
	}
	
	void setGear(int gear){
		this.curGear=gear;
	}
	
	void decreaseSpeed(double speed){
		if (this.speed!=0)
		{
			int i=(int) (this.speed - speed);
			if ( i<=0 ){
				speed=speed-(double) Math.abs(i);
			}
			this.speed = this.speed-speed;
		}
			
	}
}


