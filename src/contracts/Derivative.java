package contracts;

public class Derivative extends Base {

	public Derivative(int param) {
		super(param);
	}

	@Override
	  public void run() {
	      System.out.println("Derivative is running with param " + param);
	  }

	  public static void main(String[] args) {
	      Derivative threadd = new Derivative(4);
	     }
}
