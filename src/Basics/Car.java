package Basics;

public class Car {

	public String brand=null;
	public String model=null;
	public String color=null;
	static final int f=6;
	
	public Car(){
		
	}
	
	public Car(String brand,String model,String color){
		this.brand=brand;
		this.model=model;
		this.color=color;
				
	}
	public void setColor(String sColor)
	{
		this.color=sColor;
	}
	
	public void setModel(String sModel)
	{
		this.model=sModel;
	}
	
	public void setBrand(String sBrand)
	{
		this.brand=sBrand;
	}
	
	public void getCar()
	{
		System.out.println(brand + " " + model + " " + color); 
	}
	public static void main(String[] args)
	{
		
		/*Car car1=new Car();
		car1.setBrand("Maruthi");
		car1.setModel("Belano");
		car1.setColor("Blue");
		car1.getCar();*/
		
		
		
	}

	
}
