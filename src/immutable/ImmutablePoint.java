package immutable;

public class ImmutablePoint {
	private final double x;
	private final double y;
	
	public ImmutablePoint(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	
	public double getx(){
		return x;
		
	}
	
	public double gety(){
		return y;
		
	}
		
	//@Override
	public String toString(){
		return "("+x+","+y+")";
		
	}
}
