package immutable;

final class MutablePoint {

	private double x;
	private double y;
	
	public MutablePoint(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public double getx(){
		return x;
		
	}
	public void setx(double x){
		this.x=x;
	}
	public double gety(){
		return y;
		
	}
	public void sety(double y){
		this.y=y;
	}
	
	//@Override
	public String toString(){
		return "("+x+","+y+")";
		
	}
}
